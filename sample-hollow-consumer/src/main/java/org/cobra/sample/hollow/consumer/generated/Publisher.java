package org.cobra.sample.hollow.consumer.generated;

import com.netflix.hollow.core.type.*;

import com.netflix.hollow.api.objects.HollowObject;
import com.netflix.hollow.tools.stringifier.HollowRecordStringifier;
import org.cobra.sample.hollow.consumer.generated.core.PublisherDelegate;
import org.cobra.sample.hollow.consumer.generated.core.PublisherTypeAPI;


@SuppressWarnings("all")
public class Publisher extends HollowObject {

    public Publisher(PublisherDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public int getId() {
        return delegate().getId(ordinal);
    }



    public String getName() {
        return delegate().getName(ordinal);
    }

    public boolean isNameEqual(String testValue) {
        return delegate().isNameEqual(ordinal, testValue);
    }

    public HString getNameHollowReference() {
        int refOrdinal = delegate().getNameOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getCountry() {
        return delegate().getCountry(ordinal);
    }

    public boolean isCountryEqual(String testValue) {
        return delegate().isCountryEqual(ordinal, testValue);
    }

    public HString getCountryHollowReference() {
        int refOrdinal = delegate().getCountryOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public int getEstablishedYear() {
        return delegate().getEstablishedYear(ordinal);
    }



    public long getRevenue() {
        return delegate().getRevenue(ordinal);
    }



    public int getNumberOfBooksPublished() {
        return delegate().getNumberOfBooksPublished(ordinal);
    }



    public boolean isPublicCompany() {
        return delegate().getIsPublicCompany(ordinal);
    }



    public double getMarketShare() {
        return delegate().getMarketShare(ordinal);
    }



    public int getNumberOfEmployees() {
        return delegate().getNumberOfEmployees(ordinal);
    }



    public float getAverageBookPrice() {
        return delegate().getAverageBookPrice(ordinal);
    }



    public int getPublisherInitial() {
        return delegate().getPublisherInitial(ordinal);
    }



    public MovieAPI api() {
        return typeApi().getAPI();
    }

    public PublisherTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected PublisherDelegate delegate() {
        return (PublisherDelegate)delegate;
    }

    public String toString() {
        return new HollowRecordStringifier().stringify(this);
    }

}