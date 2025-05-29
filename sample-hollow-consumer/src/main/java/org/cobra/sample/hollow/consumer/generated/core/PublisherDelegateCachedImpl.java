package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;
import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowCachedDelegate;

@SuppressWarnings("all")
public class PublisherDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, PublisherDelegate {

    private final Integer id;
    private final String name;
    private final int nameOrdinal;
    private final String country;
    private final int countryOrdinal;
    private final Integer establishedYear;
    private final Long revenue;
    private final Integer numberOfBooksPublished;
    private final Boolean isPublicCompany;
    private final Double marketShare;
    private final Integer numberOfEmployees;
    private final Float averageBookPrice;
    private final Integer publisherInitial;
    private PublisherTypeAPI typeAPI;

    public PublisherDelegateCachedImpl(PublisherTypeAPI typeAPI, int ordinal) {
        this.id = typeAPI.getIdBoxed(ordinal);
        this.nameOrdinal = typeAPI.getNameOrdinal(ordinal);
        int nameTempOrdinal = nameOrdinal;
        this.name = nameTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(nameTempOrdinal);
        this.countryOrdinal = typeAPI.getCountryOrdinal(ordinal);
        int countryTempOrdinal = countryOrdinal;
        this.country = countryTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(countryTempOrdinal);
        this.establishedYear = typeAPI.getEstablishedYearBoxed(ordinal);
        this.revenue = typeAPI.getRevenueBoxed(ordinal);
        this.numberOfBooksPublished = typeAPI.getNumberOfBooksPublishedBoxed(ordinal);
        this.isPublicCompany = typeAPI.getIsPublicCompanyBoxed(ordinal);
        this.marketShare = typeAPI.getMarketShareBoxed(ordinal);
        this.numberOfEmployees = typeAPI.getNumberOfEmployeesBoxed(ordinal);
        this.averageBookPrice = typeAPI.getAverageBookPriceBoxed(ordinal);
        this.publisherInitial = typeAPI.getPublisherInitialBoxed(ordinal);
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

    public String getName(int ordinal) {
        return name;
    }

    public boolean isNameEqual(int ordinal, String testValue) {
        if(testValue == null)
            return name == null;
        return testValue.equals(name);
    }

    public int getNameOrdinal(int ordinal) {
        return nameOrdinal;
    }

    public String getCountry(int ordinal) {
        return country;
    }

    public boolean isCountryEqual(int ordinal, String testValue) {
        if(testValue == null)
            return country == null;
        return testValue.equals(country);
    }

    public int getCountryOrdinal(int ordinal) {
        return countryOrdinal;
    }

    public int getEstablishedYear(int ordinal) {
        if(establishedYear == null)
            return Integer.MIN_VALUE;
        return establishedYear.intValue();
    }

    public Integer getEstablishedYearBoxed(int ordinal) {
        return establishedYear;
    }

    public long getRevenue(int ordinal) {
        if(revenue == null)
            return Long.MIN_VALUE;
        return revenue.longValue();
    }

    public Long getRevenueBoxed(int ordinal) {
        return revenue;
    }

    public int getNumberOfBooksPublished(int ordinal) {
        if(numberOfBooksPublished == null)
            return Integer.MIN_VALUE;
        return numberOfBooksPublished.intValue();
    }

    public Integer getNumberOfBooksPublishedBoxed(int ordinal) {
        return numberOfBooksPublished;
    }

    public boolean getIsPublicCompany(int ordinal) {
        if(isPublicCompany == null)
            return false;
        return isPublicCompany.booleanValue();
    }

    public Boolean getIsPublicCompanyBoxed(int ordinal) {
        return isPublicCompany;
    }

    public double getMarketShare(int ordinal) {
        if(marketShare == null)
            return Double.NaN;
        return marketShare.doubleValue();
    }

    public Double getMarketShareBoxed(int ordinal) {
        return marketShare;
    }

    public int getNumberOfEmployees(int ordinal) {
        if(numberOfEmployees == null)
            return Integer.MIN_VALUE;
        return numberOfEmployees.intValue();
    }

    public Integer getNumberOfEmployeesBoxed(int ordinal) {
        return numberOfEmployees;
    }

    public float getAverageBookPrice(int ordinal) {
        if(averageBookPrice == null)
            return Float.NaN;
        return averageBookPrice.floatValue();
    }

    public Float getAverageBookPriceBoxed(int ordinal) {
        return averageBookPrice;
    }

    public int getPublisherInitial(int ordinal) {
        if(publisherInitial == null)
            return Integer.MIN_VALUE;
        return publisherInitial.intValue();
    }

    public Integer getPublisherInitialBoxed(int ordinal) {
        return publisherInitial;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public PublisherTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (PublisherTypeAPI) typeAPI;
    }

}