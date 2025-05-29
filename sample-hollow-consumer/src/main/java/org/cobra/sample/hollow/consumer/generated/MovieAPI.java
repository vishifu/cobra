package org.cobra.sample.hollow.consumer.generated;

import com.netflix.hollow.core.type.*;

import java.util.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import com.netflix.hollow.api.consumer.HollowConsumerAPI;
import com.netflix.hollow.api.custom.HollowAPI;
import com.netflix.hollow.core.read.dataaccess.HollowDataAccess;
import com.netflix.hollow.core.read.dataaccess.HollowTypeDataAccess;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.read.dataaccess.missing.HollowObjectMissingDataAccess;
import com.netflix.hollow.api.objects.provider.HollowFactory;
import com.netflix.hollow.api.objects.provider.HollowObjectProvider;
import com.netflix.hollow.api.objects.provider.HollowObjectCacheProvider;
import com.netflix.hollow.api.objects.provider.HollowObjectFactoryProvider;
import com.netflix.hollow.api.sampling.HollowObjectCreationSampler;
import com.netflix.hollow.api.sampling.HollowSamplingDirector;
import com.netflix.hollow.api.sampling.SampleResult;
import com.netflix.hollow.core.util.AllHollowRecordCollection;
import org.cobra.sample.hollow.consumer.generated.core.ActorHollowFactory;
import org.cobra.sample.hollow.consumer.generated.core.ActorTypeAPI;
import org.cobra.sample.hollow.consumer.generated.core.MovieHollowFactory;
import org.cobra.sample.hollow.consumer.generated.core.MovieTypeAPI;
import org.cobra.sample.hollow.consumer.generated.core.PublisherHollowFactory;
import org.cobra.sample.hollow.consumer.generated.core.PublisherTypeAPI;

@SuppressWarnings("all")
public class MovieAPI extends HollowAPI implements  HollowConsumerAPI.StringRetriever {

    private final HollowObjectCreationSampler objectCreationSampler;

    private final StringTypeAPI stringTypeAPI;
    private final ActorTypeAPI actorTypeAPI;
    private final MovieTypeAPI movieTypeAPI;
    private final PublisherTypeAPI publisherTypeAPI;

    private final HollowObjectProvider stringProvider;
    private final HollowObjectProvider actorProvider;
    private final HollowObjectProvider movieProvider;
    private final HollowObjectProvider publisherProvider;

    public MovieAPI(HollowDataAccess dataAccess) {
        this(dataAccess, Collections.<String>emptySet());
    }

    public MovieAPI(HollowDataAccess dataAccess, Set<String> cachedTypes) {
        this(dataAccess, cachedTypes, Collections.<String, HollowFactory<?>>emptyMap());
    }

    public MovieAPI(HollowDataAccess dataAccess, Set<String> cachedTypes, Map<String, HollowFactory<?>> factoryOverrides) {
        this(dataAccess, cachedTypes, factoryOverrides, null);
    }

    public MovieAPI(HollowDataAccess dataAccess, Set<String> cachedTypes, Map<String, HollowFactory<?>> factoryOverrides, MovieAPI previousCycleAPI) {
        super(dataAccess);
        HollowTypeDataAccess typeDataAccess;
        HollowFactory factory;

        objectCreationSampler = new HollowObjectCreationSampler("String","Actor","Movie","Publisher");

        typeDataAccess = dataAccess.getTypeDataAccess("String");
        if(typeDataAccess != null) {
            stringTypeAPI = new StringTypeAPI(this, (HollowObjectTypeDataAccess)typeDataAccess);
        } else {
            stringTypeAPI = new StringTypeAPI(this, new HollowObjectMissingDataAccess(dataAccess, "String"));
        }
        addTypeAPI(stringTypeAPI);
        factory = factoryOverrides.get("String");
        if(factory == null)
            factory = new StringHollowFactory();
        if(cachedTypes.contains("String")) {
            HollowObjectCacheProvider previousCacheProvider = null;
            if(previousCycleAPI != null && (previousCycleAPI.stringProvider instanceof HollowObjectCacheProvider))
                previousCacheProvider = (HollowObjectCacheProvider) previousCycleAPI.stringProvider;
            stringProvider = new HollowObjectCacheProvider(typeDataAccess, stringTypeAPI, factory, previousCacheProvider);
        } else {
            stringProvider = new HollowObjectFactoryProvider(typeDataAccess, stringTypeAPI, factory);
        }

        typeDataAccess = dataAccess.getTypeDataAccess("Actor");
        if(typeDataAccess != null) {
            actorTypeAPI = new ActorTypeAPI(this, (HollowObjectTypeDataAccess)typeDataAccess);
        } else {
            actorTypeAPI = new ActorTypeAPI(this, new HollowObjectMissingDataAccess(dataAccess, "Actor"));
        }
        addTypeAPI(actorTypeAPI);
        factory = factoryOverrides.get("Actor");
        if(factory == null)
            factory = new ActorHollowFactory();
        if(cachedTypes.contains("Actor")) {
            HollowObjectCacheProvider previousCacheProvider = null;
            if(previousCycleAPI != null && (previousCycleAPI.actorProvider instanceof HollowObjectCacheProvider))
                previousCacheProvider = (HollowObjectCacheProvider) previousCycleAPI.actorProvider;
            actorProvider = new HollowObjectCacheProvider(typeDataAccess, actorTypeAPI, factory, previousCacheProvider);
        } else {
            actorProvider = new HollowObjectFactoryProvider(typeDataAccess, actorTypeAPI, factory);
        }

        typeDataAccess = dataAccess.getTypeDataAccess("Movie");
        if(typeDataAccess != null) {
            movieTypeAPI = new MovieTypeAPI(this, (HollowObjectTypeDataAccess)typeDataAccess);
        } else {
            movieTypeAPI = new MovieTypeAPI(this, new HollowObjectMissingDataAccess(dataAccess, "Movie"));
        }
        addTypeAPI(movieTypeAPI);
        factory = factoryOverrides.get("Movie");
        if(factory == null)
            factory = new MovieHollowFactory();
        if(cachedTypes.contains("Movie")) {
            HollowObjectCacheProvider previousCacheProvider = null;
            if(previousCycleAPI != null && (previousCycleAPI.movieProvider instanceof HollowObjectCacheProvider))
                previousCacheProvider = (HollowObjectCacheProvider) previousCycleAPI.movieProvider;
            movieProvider = new HollowObjectCacheProvider(typeDataAccess, movieTypeAPI, factory, previousCacheProvider);
        } else {
            movieProvider = new HollowObjectFactoryProvider(typeDataAccess, movieTypeAPI, factory);
        }

        typeDataAccess = dataAccess.getTypeDataAccess("Publisher");
        if(typeDataAccess != null) {
            publisherTypeAPI = new PublisherTypeAPI(this, (HollowObjectTypeDataAccess)typeDataAccess);
        } else {
            publisherTypeAPI = new PublisherTypeAPI(this, new HollowObjectMissingDataAccess(dataAccess, "Publisher"));
        }
        addTypeAPI(publisherTypeAPI);
        factory = factoryOverrides.get("Publisher");
        if(factory == null)
            factory = new PublisherHollowFactory();
        if(cachedTypes.contains("Publisher")) {
            HollowObjectCacheProvider previousCacheProvider = null;
            if(previousCycleAPI != null && (previousCycleAPI.publisherProvider instanceof HollowObjectCacheProvider))
                previousCacheProvider = (HollowObjectCacheProvider) previousCycleAPI.publisherProvider;
            publisherProvider = new HollowObjectCacheProvider(typeDataAccess, publisherTypeAPI, factory, previousCacheProvider);
        } else {
            publisherProvider = new HollowObjectFactoryProvider(typeDataAccess, publisherTypeAPI, factory);
        }

    }

/*
 * Cached objects are no longer accessible after this method is called and an attempt to access them will cause an IllegalStateException.
 */
    public void detachCaches() {
        if(stringProvider instanceof HollowObjectCacheProvider)
            ((HollowObjectCacheProvider)stringProvider).detach();
        if(actorProvider instanceof HollowObjectCacheProvider)
            ((HollowObjectCacheProvider)actorProvider).detach();
        if(movieProvider instanceof HollowObjectCacheProvider)
            ((HollowObjectCacheProvider)movieProvider).detach();
        if(publisherProvider instanceof HollowObjectCacheProvider)
            ((HollowObjectCacheProvider)publisherProvider).detach();
    }

    public StringTypeAPI getStringTypeAPI() {
        return stringTypeAPI;
    }
    public ActorTypeAPI getActorTypeAPI() {
        return actorTypeAPI;
    }
    public MovieTypeAPI getMovieTypeAPI() {
        return movieTypeAPI;
    }
    public PublisherTypeAPI getPublisherTypeAPI() {
        return publisherTypeAPI;
    }
    public Collection<HString> getAllHString() {
        HollowTypeDataAccess tda = Objects.requireNonNull(getDataAccess().getTypeDataAccess("String"), "type not loaded or does not exist in dataset; type=String");
        return new AllHollowRecordCollection<HString>(tda.getTypeState()) {
            protected HString getForOrdinal(int ordinal) {
                return getHString(ordinal);
            }
        };
    }
    public HString getHString(int ordinal) {
        objectCreationSampler.recordCreation(0);
        return (HString)stringProvider.getHollowObject(ordinal);
    }
    public Collection<Actor> getAllActor() {
        HollowTypeDataAccess tda = Objects.requireNonNull(getDataAccess().getTypeDataAccess("Actor"), "type not loaded or does not exist in dataset; type=Actor");
        return new AllHollowRecordCollection<Actor>(tda.getTypeState()) {
            protected Actor getForOrdinal(int ordinal) {
                return getActor(ordinal);
            }
        };
    }
    public Actor getActor(int ordinal) {
        objectCreationSampler.recordCreation(1);
        return (Actor)actorProvider.getHollowObject(ordinal);
    }
    public Collection<Movie> getAllMovie() {
        HollowTypeDataAccess tda = Objects.requireNonNull(getDataAccess().getTypeDataAccess("Movie"), "type not loaded or does not exist in dataset; type=Movie");
        return new AllHollowRecordCollection<Movie>(tda.getTypeState()) {
            protected Movie getForOrdinal(int ordinal) {
                return getMovie(ordinal);
            }
        };
    }
    public Movie getMovie(int ordinal) {
        objectCreationSampler.recordCreation(2);
        return (Movie)movieProvider.getHollowObject(ordinal);
    }
    public Collection<Publisher> getAllPublisher() {
        HollowTypeDataAccess tda = Objects.requireNonNull(getDataAccess().getTypeDataAccess("Publisher"), "type not loaded or does not exist in dataset; type=Publisher");
        return new AllHollowRecordCollection<Publisher>(tda.getTypeState()) {
            protected Publisher getForOrdinal(int ordinal) {
                return getPublisher(ordinal);
            }
        };
    }
    public Publisher getPublisher(int ordinal) {
        objectCreationSampler.recordCreation(3);
        return (Publisher)publisherProvider.getHollowObject(ordinal);
    }
    public void setSamplingDirector(HollowSamplingDirector director) {
        super.setSamplingDirector(director);
        objectCreationSampler.setSamplingDirector(director);
    }

    public Collection<SampleResult> getObjectCreationSamplingResults() {
        return objectCreationSampler.getSampleResults();
    }

}
