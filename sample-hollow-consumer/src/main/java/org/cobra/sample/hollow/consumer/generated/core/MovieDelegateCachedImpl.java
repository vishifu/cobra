package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;
import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowCachedDelegate;

@SuppressWarnings("all")
public class MovieDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, MovieDelegate {

    private final Integer id;
    private final String title;
    private final int titleOrdinal;
    private final String genre;
    private final int genreOrdinal;
    private final Double rating;
    private final String director;
    private final int directorOrdinal;
    private final String imageUrl;
    private final int imageUrlOrdinal;
    private MovieTypeAPI typeAPI;

    public MovieDelegateCachedImpl(MovieTypeAPI typeAPI, int ordinal) {
        this.id = typeAPI.getIdBoxed(ordinal);
        this.titleOrdinal = typeAPI.getTitleOrdinal(ordinal);
        int titleTempOrdinal = titleOrdinal;
        this.title = titleTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(titleTempOrdinal);
        this.genreOrdinal = typeAPI.getGenreOrdinal(ordinal);
        int genreTempOrdinal = genreOrdinal;
        this.genre = genreTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(genreTempOrdinal);
        this.rating = typeAPI.getRatingBoxed(ordinal);
        this.directorOrdinal = typeAPI.getDirectorOrdinal(ordinal);
        int directorTempOrdinal = directorOrdinal;
        this.director = directorTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(directorTempOrdinal);
        this.imageUrlOrdinal = typeAPI.getImageUrlOrdinal(ordinal);
        int imageUrlTempOrdinal = imageUrlOrdinal;
        this.imageUrl = imageUrlTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(imageUrlTempOrdinal);
        this.typeAPI = typeAPI;
    }

    public int getId(int ordinal) {
        if(id == null)
            return Integer.MIN_VALUE;
        return id.intValue();
    }

    public Integer getIdBoxed(int ordinal) {
        return id;
    }

    public String getTitle(int ordinal) {
        return title;
    }

    public boolean isTitleEqual(int ordinal, String testValue) {
        if(testValue == null)
            return title == null;
        return testValue.equals(title);
    }

    public int getTitleOrdinal(int ordinal) {
        return titleOrdinal;
    }

    public String getGenre(int ordinal) {
        return genre;
    }

    public boolean isGenreEqual(int ordinal, String testValue) {
        if(testValue == null)
            return genre == null;
        return testValue.equals(genre);
    }

    public int getGenreOrdinal(int ordinal) {
        return genreOrdinal;
    }

    public double getRating(int ordinal) {
        if(rating == null)
            return Double.NaN;
        return rating.doubleValue();
    }

    public Double getRatingBoxed(int ordinal) {
        return rating;
    }

    public String getDirector(int ordinal) {
        return director;
    }

    public boolean isDirectorEqual(int ordinal, String testValue) {
        if(testValue == null)
            return director == null;
        return testValue.equals(director);
    }

    public int getDirectorOrdinal(int ordinal) {
        return directorOrdinal;
    }

    public String getImageUrl(int ordinal) {
        return imageUrl;
    }

    public boolean isImageUrlEqual(int ordinal, String testValue) {
        if(testValue == null)
            return imageUrl == null;
        return testValue.equals(imageUrl);
    }

    public int getImageUrlOrdinal(int ordinal) {
        return imageUrlOrdinal;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public MovieTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (MovieTypeAPI) typeAPI;
    }

}