package org.cobra.sample.hollow.consumer.generated.core;

import org.cobra.sample.hollow.consumer.generated.core.*;

import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class MovieDelegateLookupImpl extends HollowObjectAbstractDelegate implements MovieDelegate {

    private final MovieTypeAPI typeAPI;

    public MovieDelegateLookupImpl(MovieTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getId(int ordinal) {
        return typeAPI.getId(ordinal);
    }

    public Integer getIdBoxed(int ordinal) {
        return typeAPI.getIdBoxed(ordinal);
    }

    public String getTitle(int ordinal) {
        ordinal = typeAPI.getTitleOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isTitleEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getTitleOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getTitleOrdinal(int ordinal) {
        return typeAPI.getTitleOrdinal(ordinal);
    }

    public String getGenre(int ordinal) {
        ordinal = typeAPI.getGenreOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isGenreEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getGenreOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getGenreOrdinal(int ordinal) {
        return typeAPI.getGenreOrdinal(ordinal);
    }

    public double getRating(int ordinal) {
        return typeAPI.getRating(ordinal);
    }

    public Double getRatingBoxed(int ordinal) {
        return typeAPI.getRatingBoxed(ordinal);
    }

    public String getDirector(int ordinal) {
        ordinal = typeAPI.getDirectorOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isDirectorEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getDirectorOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getDirectorOrdinal(int ordinal) {
        return typeAPI.getDirectorOrdinal(ordinal);
    }

    public String getImageUrl(int ordinal) {
        ordinal = typeAPI.getImageUrlOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isImageUrlEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getImageUrlOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getImageUrlOrdinal(int ordinal) {
        return typeAPI.getImageUrlOrdinal(ordinal);
    }

    public MovieTypeAPI getTypeAPI() {
        return typeAPI;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

}