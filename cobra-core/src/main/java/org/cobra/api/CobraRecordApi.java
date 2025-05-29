package org.cobra.api;

import org.cobra.RecordApi;
import org.cobra.commons.errors.CobraException;
import org.cobra.consumer.CobraConsumer;
import org.cobra.core.memory.datalocal.AssocStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CobraRecordApi implements RecordApi {

    private static final Logger log = LoggerFactory.getLogger(CobraRecordApi.class);
    private final CobraConsumer consumer;

    public CobraRecordApi(CobraConsumer consumer) {
        this.consumer = consumer;
    }

    @Override
    public byte[] getRaw(String key) {
        return records().getData(key);
    }

    @Override
    public <T> T query(String key) {
        byte[] raw = records().getData(key);
        if (raw == null) {
            return null;
        }
        try {
            return consumer.context().getSerde().deserialize(getRaw(key));
        } catch (CobraException e) {
            log.error("interrupt query key {}", key, e);
            return null;
        }
    }

    private AssocStore records() {
        return consumer.context().getStore();
    }
}
