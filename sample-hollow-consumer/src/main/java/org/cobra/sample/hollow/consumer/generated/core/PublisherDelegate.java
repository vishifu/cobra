package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectDelegate;


@SuppressWarnings("all")
public interface PublisherDelegate extends HollowObjectDelegate {

    public int getId(int ordinal);

    public Integer getIdBoxed(int ordinal);

    public String getName(int ordinal);

    public boolean isNameEqual(int ordinal, String testValue);

    public int getNameOrdinal(int ordinal);

    public String getCountry(int ordinal);

    public boolean isCountryEqual(int ordinal, String testValue);

    public int getCountryOrdinal(int ordinal);

    public int getEstablishedYear(int ordinal);

    public Integer getEstablishedYearBoxed(int ordinal);

    public long getRevenue(int ordinal);

    public Long getRevenueBoxed(int ordinal);

    public int getNumberOfBooksPublished(int ordinal);

    public Integer getNumberOfBooksPublishedBoxed(int ordinal);

    public boolean getIsPublicCompany(int ordinal);

    public Boolean getIsPublicCompanyBoxed(int ordinal);

    public double getMarketShare(int ordinal);

    public Double getMarketShareBoxed(int ordinal);

    public int getNumberOfEmployees(int ordinal);

    public Integer getNumberOfEmployeesBoxed(int ordinal);

    public float getAverageBookPrice(int ordinal);

    public Float getAverageBookPriceBoxed(int ordinal);

    public int getPublisherInitial(int ordinal);

    public Integer getPublisherInitialBoxed(int ordinal);

    public PublisherTypeAPI getTypeAPI();

}