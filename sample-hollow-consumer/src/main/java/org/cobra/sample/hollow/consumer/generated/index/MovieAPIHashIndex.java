package org.cobra.sample.hollow.consumer.generated.index;

import com.netflix.hollow.core.type.*;
import org.cobra.sample.hollow.consumer.generated.MovieAPI;
import org.cobra.sample.hollow.consumer.generated.Movie;
import org.cobra.sample.hollow.consumer.generated.Actor;
import org.cobra.sample.hollow.consumer.generated.Publisher;

import com.netflix.hollow.api.consumer.HollowConsumer;
import com.netflix.hollow.core.index.HollowHashIndexResult;
import java.util.Collections;
import java.lang.Iterable;
import com.netflix.hollow.api.consumer.index.AbstractHollowHashIndex;
import com.netflix.hollow.api.consumer.data.AbstractHollowOrdinalIterable;


/**
 * @deprecated see {@link com.netflix.hollow.api.consumer.index.HashIndex} which can be built as follows:
 * <pre>{@code
 *     HashIndex<HString, K> uki = HashIndex.from(consumer, HString.class)
 *         .usingBean(k);
 *     Stream<HString> results = uki.findMatches(k);
 * }</pre>
 * where {@code K} is a class declaring key field paths members, annotated with
 * {@link com.netflix.hollow.api.consumer.index.FieldPath}, and {@code k} is an instance of
 * {@code K} that is the query to find the matching {@code HString} objects.
 */
@Deprecated

@SuppressWarnings("all")
public class MovieAPIHashIndex extends AbstractHollowHashIndex<MovieAPI> {

    public MovieAPIHashIndex(HollowConsumer consumer, String queryType, String selectFieldPath, String... matchFieldPaths) {
        super(consumer, false, queryType, selectFieldPath, matchFieldPaths);
    }

    public MovieAPIHashIndex(HollowConsumer consumer, boolean isListenToDataRefresh, String queryType, String selectFieldPath, String... matchFieldPaths) {
        super(consumer, isListenToDataRefresh, queryType, selectFieldPath, matchFieldPaths);
    }

    public Iterable<HString> findStringMatches(Object... keys) {
        HollowHashIndexResult matches = idx.findMatches(keys);
        if(matches == null) return Collections.emptySet();

        return new AbstractHollowOrdinalIterable<HString>(matches.iterator()) {
            public HString getData(int ordinal) {
                return api.getHString(ordinal);
            }
        };
    }

    public Iterable<Actor> findActorMatches(Object... keys) {
        HollowHashIndexResult matches = idx.findMatches(keys);
        if(matches == null) return Collections.emptySet();

        return new AbstractHollowOrdinalIterable<Actor>(matches.iterator()) {
            public Actor getData(int ordinal) {
                return api.getActor(ordinal);
            }
        };
    }

    public Iterable<Movie> findMovieMatches(Object... keys) {
        HollowHashIndexResult matches = idx.findMatches(keys);
        if(matches == null) return Collections.emptySet();

        return new AbstractHollowOrdinalIterable<Movie>(matches.iterator()) {
            public Movie getData(int ordinal) {
                return api.getMovie(ordinal);
            }
        };
    }

    public Iterable<Publisher> findPublisherMatches(Object... keys) {
        HollowHashIndexResult matches = idx.findMatches(keys);
        if(matches == null) return Collections.emptySet();

        return new AbstractHollowOrdinalIterable<Publisher>(matches.iterator()) {
            public Publisher getData(int ordinal) {
                return api.getPublisher(ordinal);
            }
        };
    }

}