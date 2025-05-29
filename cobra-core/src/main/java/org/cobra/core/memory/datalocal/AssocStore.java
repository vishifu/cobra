package org.cobra.core.memory.datalocal;

import org.cobra.core.hashing.HashingTable;
import org.cobra.core.hashing.Table;
import org.cobra.core.hashing.hashcodes.Murmur3Hash;
import org.cobra.core.memory.slab.SlabArena;

public class AssocStore {

    private final Table lookupTable = new HashingTable();
    private final SlabArena arena;

    public AssocStore() {
        arena = SlabArena.initialize();
    }

    public Table lookupTable() {
        return lookupTable;
    }

    public void putObject(String key, byte[] representation) {
        putObject(key.getBytes(), representation);
    }

    public void putObject(byte[] key, byte[] representation) {
        removeObject(key);
        final int hashKey = toHashKey(key);

        // todo: mutex lock re-balance
        // todo: free slab if overwrite an existed key
        final long allocAddress = arena.allocate(hashKey, representation);

        lookupTable.put(hashKey, allocAddress);
    }

    public byte[] removeObject(String key) {
        return removeObject(key.getBytes());
    }

    public byte[] removeObject(byte[] key) {
        final int hashKey = toHashKey(key);

        final long retAddress = lookupTable.remove(hashKey);
        if (retAddress <= 0)
            return null;

        byte[] ans = arena.methods().get(retAddress);
        arena.free(retAddress);

        return ans;
    }

    public byte[] getData(String key) {
        final int hashKey = toHashKey(key.getBytes());
        final long retAddress = lookupTable.get(hashKey);
        if (retAddress <= 0)
            return null;

        return arena.methods().get(retAddress);
    }

    private int toHashKey(byte[] key) {
        return Murmur3Hash.murmur3_32(key, 0, key.length, 0);
    }

    public void destroy() {
        this.lookupTable.destroy();
        this.arena.destroy();
    }
}
