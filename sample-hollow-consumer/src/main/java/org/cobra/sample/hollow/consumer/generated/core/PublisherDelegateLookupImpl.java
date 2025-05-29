package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class PublisherDelegateLookupImpl extends HollowObjectAbstractDelegate implements PublisherDelegate {

    private final PublisherTypeAPI typeAPI;

    public PublisherDelegateLookupImpl(PublisherTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getId(int ordinal) {
        return typeAPI.getId(ordinal);
    }

    public Integer getIdBoxed(int ordinal) {
        return typeAPI.getIdBoxed(ordinal);
    }

    public String getName(int ordinal) {
        ordinal = typeAPI.getNameOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isNameEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getNameOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getNameOrdinal(int ordinal) {
        return typeAPI.getNameOrdinal(ordinal);
    }

    public String getCountry(int ordinal) {
        ordinal = typeAPI.getCountryOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isCountryEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getCountryOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getCountryOrdinal(int ordinal) {
        return typeAPI.getCountryOrdinal(ordinal);
    }

    public int getEstablishedYear(int ordinal) {
        return typeAPI.getEstablishedYear(ordinal);
    }

    public Integer getEstablishedYearBoxed(int ordinal) {
        return typeAPI.getEstablishedYearBoxed(ordinal);
    }

    public long getRevenue(int ordinal) {
        return typeAPI.getRevenue(ordinal);
    }

    public Long getRevenueBoxed(int ordinal) {
        return typeAPI.getRevenueBoxed(ordinal);
    }

    public int getNumberOfBooksPublished(int ordinal) {
        return typeAPI.getNumberOfBooksPublished(ordinal);
    }

    public Integer getNumberOfBooksPublishedBoxed(int ordinal) {
        return typeAPI.getNumberOfBooksPublishedBoxed(ordinal);
    }

    public boolean getIsPublicCompany(int ordinal) {
        return typeAPI.getIsPublicCompany(ordinal);
    }

    public Boolean getIsPublicCompanyBoxed(int ordinal) {
        return typeAPI.getIsPublicCompanyBoxed(ordinal);
    }

    public double getMarketShare(int ordinal) {
        return typeAPI.getMarketShare(ordinal);
    }

    public Double getMarketShareBoxed(int ordinal) {
        return typeAPI.getMarketShareBoxed(ordinal);
    }

    public int getNumberOfEmployees(int ordinal) {
        return typeAPI.getNumberOfEmployees(ordinal);
    }

    public Integer getNumberOfEmployeesBoxed(int ordinal) {
        return typeAPI.getNumberOfEmployeesBoxed(ordinal);
    }

    public float getAverageBookPrice(int ordinal) {
        return typeAPI.getAverageBookPrice(ordinal);
    }

    public Float getAverageBookPriceBoxed(int ordinal) {
        return typeAPI.getAverageBookPriceBoxed(ordinal);
    }

    public int getPublisherInitial(int ordinal) {
        return typeAPI.getPublisherInitial(ordinal);
    }

    public Integer getPublisherInitialBoxed(int ordinal) {
        return typeAPI.getPublisherInitialBoxed(ordinal);
    }

    public PublisherTypeAPI getTypeAPI() {
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