package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectDelegate;


@SuppressWarnings("all")
public interface MovieDelegate extends HollowObjectDelegate {

    public int getId(int ordinal);

    public Integer getIdBoxed(int ordinal);

    public String getTitle(int ordinal);

    public boolean isTitleEqual(int ordinal, String testValue);

    public int getTitleOrdinal(int ordinal);

    public String getGenre(int ordinal);

    public boolean isGenreEqual(int ordinal, String testValue);

    public int getGenreOrdinal(int ordinal);

    public double getRating(int ordinal);

    public Double getRatingBoxed(int ordinal);

    public String getDirector(int ordinal);

    public boolean isDirectorEqual(int ordinal, String testValue);

    public int getDirectorOrdinal(int ordinal);

    public String getImageUrl(int ordinal);

    public boolean isImageUrlEqual(int ordinal, String testValue);

    public int getImageUrlOrdinal(int ordinal);

    public MovieTypeAPI getTypeAPI();

}