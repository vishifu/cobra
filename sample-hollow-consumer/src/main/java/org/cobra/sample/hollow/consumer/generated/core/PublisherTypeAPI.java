package org.cobra.sample.hollow.consumer.generated.core;

import com.netflix.hollow.core.type.*;
import org.cobra.sample.hollow.consumer.generated.MovieAPI;

import com.netflix.hollow.api.custom.HollowObjectTypeAPI;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;


@SuppressWarnings("all")
public class PublisherTypeAPI extends HollowObjectTypeAPI {

    private final PublisherDelegateLookupImpl delegateLookupImpl;

    public PublisherTypeAPI(MovieAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "id",
            "name",
            "country",
            "establishedYear",
            "revenue",
            "numberOfBooksPublished",
            "isPublicCompany",
            "marketShare",
            "numberOfEmployees",
            "averageBookPrice",
            "publisherInitial"
        });
        this.delegateLookupImpl = new PublisherDelegateLookupImpl(this);
    }

    public int getId(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleInt("Publisher", ordinal, "id");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[0]);
    }

    public Integer getIdBoxed(int ordinal) {
        int i;
        if(fieldIndex[0] == -1) {
            i = missingDataHandler().handleInt("Publisher", ordinal, "id");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[0]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[0]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getNameOrdinal(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleReferencedOrdinal("Publisher", ordinal, "name");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[1]);
    }

    public StringTypeAPI getNameTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getCountryOrdinal(int ordinal) {
        if(fieldIndex[2] == -1)
            return missingDataHandler().handleReferencedOrdinal("Publisher", ordinal, "country");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[2]);
    }

    public StringTypeAPI getCountryTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getEstablishedYear(int ordinal) {
        if(fieldIndex[3] == -1)
            return missingDataHandler().handleInt("Publisher", ordinal, "establishedYear");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[3]);
    }

    public Integer getEstablishedYearBoxed(int ordinal) {
        int i;
        if(fieldIndex[3] == -1) {
            i = missingDataHandler().handleInt("Publisher", ordinal, "establishedYear");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[3]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[3]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public long getRevenue(int ordinal) {
        if(fieldIndex[4] == -1)
            return missingDataHandler().handleLong("Publisher", ordinal, "revenue");
        return getTypeDataAccess().readLong(ordinal, fieldIndex[4]);
    }

    public Long getRevenueBoxed(int ordinal) {
        long l;
        if(fieldIndex[4] == -1) {
            l = missingDataHandler().handleLong("Publisher", ordinal, "revenue");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[4]);
            l = getTypeDataAccess().readLong(ordinal, fieldIndex[4]);
        }
        if(l == Long.MIN_VALUE)
            return null;
        return Long.valueOf(l);
    }



    public int getNumberOfBooksPublished(int ordinal) {
        if(fieldIndex[5] == -1)
            return missingDataHandler().handleInt("Publisher", ordinal, "numberOfBooksPublished");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[5]);
    }

    public Integer getNumberOfBooksPublishedBoxed(int ordinal) {
        int i;
        if(fieldIndex[5] == -1) {
            i = missingDataHandler().handleInt("Publisher", ordinal, "numberOfBooksPublished");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[5]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[5]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public boolean getIsPublicCompany(int ordinal) {
        if(fieldIndex[6] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Publisher", ordinal, "isPublicCompany"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[6]));
    }

    public Boolean getIsPublicCompanyBoxed(int ordinal) {
        if(fieldIndex[6] == -1)
            return missingDataHandler().handleBoolean("Publisher", ordinal, "isPublicCompany");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[6]);
    }



    public double getMarketShare(int ordinal) {
        if(fieldIndex[7] == -1)
            return missingDataHandler().handleDouble("Publisher", ordinal, "marketShare");
        return getTypeDataAccess().readDouble(ordinal, fieldIndex[7]);
    }

    public Double getMarketShareBoxed(int ordinal) {
        double d;
        if(fieldIndex[7] == -1) {
            d = missingDataHandler().handleDouble("Publisher", ordinal, "marketShare");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[7]);
            d = getTypeDataAccess().readDouble(ordinal, fieldIndex[7]);
        }
        return Double.isNaN(d) ? null : Double.valueOf(d);
    }



    public int getNumberOfEmployees(int ordinal) {
        if(fieldIndex[8] == -1)
            return missingDataHandler().handleInt("Publisher", ordinal, "numberOfEmployees");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[8]);
    }

    public Integer getNumberOfEmployeesBoxed(int ordinal) {
        int i;
        if(fieldIndex[8] == -1) {
            i = missingDataHandler().handleInt("Publisher", ordinal, "numberOfEmployees");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[8]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[8]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public float getAverageBookPrice(int ordinal) {
        if(fieldIndex[9] == -1)
            return missingDataHandler().handleFloat("Publisher", ordinal, "averageBookPrice");
        return getTypeDataAccess().readFloat(ordinal, fieldIndex[9]);
    }

    public Float getAverageBookPriceBoxed(int ordinal) {
        float f;
        if(fieldIndex[9] == -1) {
            f = missingDataHandler().handleFloat("Publisher", ordinal, "averageBookPrice");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[9]);
            f = getTypeDataAccess().readFloat(ordinal, fieldIndex[9]);
        }        return Float.isNaN(f) ? null : Float.valueOf(f);
    }



    public int getPublisherInitial(int ordinal) {
        if(fieldIndex[10] == -1)
            return missingDataHandler().handleInt("Publisher", ordinal, "publisherInitial");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[10]);
    }

    public Integer getPublisherInitialBoxed(int ordinal) {
        int i;
        if(fieldIndex[10] == -1) {
            i = missingDataHandler().handleInt("Publisher", ordinal, "publisherInitial");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[10]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[10]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public PublisherDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public MovieAPI getAPI() {
        return (MovieAPI) api;
    }

}