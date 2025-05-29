package org.cobra.sample.hollow.consumer.generated.accessor;

import org.cobra.sample.hollow.consumer.generated.MovieAPI;
import org.cobra.sample.hollow.consumer.generated.Publisher;

import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.api.consumer.data.AbstractHollowDataAccessor;
import com.netflix.hollow.core.index.key.PrimaryKey;
import com.netflix.hollow.core.read.engine.HollowReadStateEngine;


@SuppressWarnings("all")
public class PublisherDataAccessor extends AbstractHollowDataAccessor<Publisher> {

    public static final String TYPE = "Publisher";
    private MovieAPI api;

    public PublisherDataAccessor(HollowConsumer consumer) {
        super(consumer, TYPE);
        this.api = (MovieAPI)consumer.getAPI();
    }

    public PublisherDataAccessor(HollowReadStateEngine rStateEngine, MovieAPI api) {
        super(rStateEngine, TYPE);
        this.api = api;
    }

    public PublisherDataAccessor(HollowReadStateEngine rStateEngine, MovieAPI api, String ... fieldPaths) {
        super(rStateEngine, TYPE, fieldPaths);
        this.api = api;
    }

    public PublisherDataAccessor(HollowReadStateEngine rStateEngine, MovieAPI api, PrimaryKey primaryKey) {
        super(rStateEngine, TYPE, primaryKey);
        this.api = api;
    }

    @Override public Publisher getRecord(int ordinal){
        return api.getPublisher(ordinal);
    }

}