package org.cobra.sample.hollow.consumer.generated.core;

import com.netflix.hollow.core.type.*;
import org.cobra.sample.hollow.consumer.generated.MovieAPI;

import com.netflix.hollow.api.custom.HollowObjectTypeAPI;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;


@SuppressWarnings("all")
public class MovieTypeAPI extends HollowObjectTypeAPI {

    private final MovieDelegateLookupImpl delegateLookupImpl;

    public MovieTypeAPI(MovieAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "id",
            "title",
            "genre",
            "rating",
            "director",
            "imageUrl"
        });
        this.delegateLookupImpl = new MovieDelegateLookupImpl(this);
    }

    public int getId(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleInt("Movie", ordinal, "id");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[0]);
    }

    public Integer getIdBoxed(int ordinal) {
        int i;
        if(fieldIndex[0] == -1) {
            i = missingDataHandler().handleInt("Movie", ordinal, "id");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[0]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[0]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getTitleOrdinal(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleReferencedOrdinal("Movie", ordinal, "title");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[1]);
    }

    public StringTypeAPI getTitleTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getGenreOrdinal(int ordinal) {
        if(fieldIndex[2] == -1)
            return missingDataHandler().handleReferencedOrdinal("Movie", ordinal, "genre");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[2]);
    }

    public StringTypeAPI getGenreTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public double getRating(int ordinal) {
        if(fieldIndex[3] == -1)
            return missingDataHandler().handleDouble("Movie", ordinal, "rating");
        return getTypeDataAccess().readDouble(ordinal, fieldIndex[3]);
    }

    public Double getRatingBoxed(int ordinal) {
        double d;
        if(fieldIndex[3] == -1) {
            d = missingDataHandler().handleDouble("Movie", ordinal, "rating");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[3]);
            d = getTypeDataAccess().readDouble(ordinal, fieldIndex[3]);
        }
        return Double.isNaN(d) ? null : Double.valueOf(d);
    }



    public int getDirectorOrdinal(int ordinal) {
        if(fieldIndex[4] == -1)
            return missingDataHandler().handleReferencedOrdinal("Movie", ordinal, "director");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[4]);
    }

    public StringTypeAPI getDirectorTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getImageUrlOrdinal(int ordinal) {
        if(fieldIndex[5] == -1)
            return missingDataHandler().handleReferencedOrdinal("Movie", ordinal, "imageUrl");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[5]);
    }

    public StringTypeAPI getImageUrlTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public MovieDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public MovieAPI getAPI() {
        return (MovieAPI) api;
    }

}