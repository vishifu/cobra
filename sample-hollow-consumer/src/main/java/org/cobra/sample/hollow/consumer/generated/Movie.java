package org.cobra.sample.hollow.consumer.generated;

import com.netflix.hollow.core.type.*;

import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.api.consumer.index.UniqueKeyIndex;
import com.netflix.hollow.api.objects.HollowObject;
import com.netflix.hollow.tools.stringifier.HollowRecordStringifier;
import org.cobra.sample.hollow.consumer.generated.core.MovieDelegate;
import org.cobra.sample.hollow.consumer.generated.core.MovieTypeAPI;


@SuppressWarnings("all")
public class Movie extends HollowObject {

    public Movie(MovieDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public int getId() {
        return delegate().getId(ordinal);
    }



    public String getTitle() {
        return delegate().getTitle(ordinal);
    }

    public boolean isTitleEqual(String testValue) {
        return delegate().isTitleEqual(ordinal, testValue);
    }

    public HString getTitleHollowReference() {
        int refOrdinal = delegate().getTitleOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getGenre() {
        return delegate().getGenre(ordinal);
    }

    public boolean isGenreEqual(String testValue) {
        return delegate().isGenreEqual(ordinal, testValue);
    }

    public HString getGenreHollowReference() {
        int refOrdinal = delegate().getGenreOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public double getRating() {
        return delegate().getRating(ordinal);
    }



    public String getDirector() {
        return delegate().getDirector(ordinal);
    }

    public boolean isDirectorEqual(String testValue) {
        return delegate().isDirectorEqual(ordinal, testValue);
    }

    public HString getDirectorHollowReference() {
        int refOrdinal = delegate().getDirectorOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getImageUrl() {
        return delegate().getImageUrl(ordinal);
    }

    public boolean isImageUrlEqual(String testValue) {
        return delegate().isImageUrlEqual(ordinal, testValue);
    }

    public HString getImageUrlHollowReference() {
        int refOrdinal = delegate().getImageUrlOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public MovieAPI api() {
        return typeApi().getAPI();
    }

    public MovieTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected MovieDelegate delegate() {
        return (MovieDelegate)delegate;
    }

    public String toString() {
        return new HollowRecordStringifier().stringify(this);
    }

    /**
     * Creates a unique key index for {@code Movie} that has a primary key.
     * The primary key is represented by the type {@code int}.
     * <p>
     * By default the unique key index will not track updates to the {@code consumer} and thus
     * any changes will not be reflected in matched results.  To track updates the index must be
     * {@link HollowConsumer#addRefreshListener(HollowConsumer.RefreshListener) registered}
     * with the {@code consumer}
     *
     * @param consumer the consumer
     * @return the unique key index
     */
    public static UniqueKeyIndex<Movie, Integer> uniqueIndex(HollowConsumer consumer) {
        return UniqueKeyIndex.from(consumer, Movie.class)
            .bindToPrimaryKey()
            .usingPath("id", int.class);
    }

}