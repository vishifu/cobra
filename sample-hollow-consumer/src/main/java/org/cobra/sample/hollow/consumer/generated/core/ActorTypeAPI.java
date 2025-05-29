package org.cobra.sample.hollow.consumer.generated.core;

import com.netflix.hollow.core.type.*;
import org.cobra.sample.hollow.consumer.generated.MovieAPI;

import com.netflix.hollow.api.custom.HollowObjectTypeAPI;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;


@SuppressWarnings("all")
public class ActorTypeAPI extends HollowObjectTypeAPI {

    private final ActorDelegateLookupImpl delegateLookupImpl;

    public ActorTypeAPI(MovieAPI api, HollowObjectTypeDataAccess typeDataAccess) {
        super(api, typeDataAccess, new String[] {
            "id",
            "firstName",
            "lastName",
            "age",
            "gender",
            "nationality",
            "yearsOfExperience",
            "numberOfMovies",
            "numberOfAwards",
            "debutMovie",
            "mostFamousRole",
            "height",
            "weight",
            "hairColor",
            "eyeColor",
            "email",
            "phoneNumber",
            "address",
            "instagramHandle",
            "twitterHandle",
            "facebookPage",
            "canSing",
            "canDance",
            "canAct",
            "canDirect",
            "canWrite",
            "favoriteGenre",
            "favoriteDirector",
            "favoriteActor",
            "isMarried",
            "numberOfChildren",
            "almaMater",
            "hasWonOscar",
            "hasWonEmmy",
            "hasWonGoldenGlobe",
            "netWorth",
            "annualIncome",
            "isAvailableForNextProject",
            "currentProject",
            "agentName",
            "agentContact"
        });
        this.delegateLookupImpl = new ActorDelegateLookupImpl(this);
    }

    public int getId(int ordinal) {
        if(fieldIndex[0] == -1)
            return missingDataHandler().handleInt("Actor", ordinal, "id");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[0]);
    }

    public Integer getIdBoxed(int ordinal) {
        int i;
        if(fieldIndex[0] == -1) {
            i = missingDataHandler().handleInt("Actor", ordinal, "id");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[0]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[0]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getFirstNameOrdinal(int ordinal) {
        if(fieldIndex[1] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "firstName");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[1]);
    }

    public StringTypeAPI getFirstNameTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getLastNameOrdinal(int ordinal) {
        if(fieldIndex[2] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "lastName");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[2]);
    }

    public StringTypeAPI getLastNameTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getAge(int ordinal) {
        if(fieldIndex[3] == -1)
            return missingDataHandler().handleInt("Actor", ordinal, "age");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[3]);
    }

    public Integer getAgeBoxed(int ordinal) {
        int i;
        if(fieldIndex[3] == -1) {
            i = missingDataHandler().handleInt("Actor", ordinal, "age");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[3]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[3]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getGenderOrdinal(int ordinal) {
        if(fieldIndex[4] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "gender");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[4]);
    }

    public StringTypeAPI getGenderTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getNationalityOrdinal(int ordinal) {
        if(fieldIndex[5] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "nationality");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[5]);
    }

    public StringTypeAPI getNationalityTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getYearsOfExperience(int ordinal) {
        if(fieldIndex[6] == -1)
            return missingDataHandler().handleInt("Actor", ordinal, "yearsOfExperience");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[6]);
    }

    public Integer getYearsOfExperienceBoxed(int ordinal) {
        int i;
        if(fieldIndex[6] == -1) {
            i = missingDataHandler().handleInt("Actor", ordinal, "yearsOfExperience");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[6]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[6]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getNumberOfMovies(int ordinal) {
        if(fieldIndex[7] == -1)
            return missingDataHandler().handleInt("Actor", ordinal, "numberOfMovies");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[7]);
    }

    public Integer getNumberOfMoviesBoxed(int ordinal) {
        int i;
        if(fieldIndex[7] == -1) {
            i = missingDataHandler().handleInt("Actor", ordinal, "numberOfMovies");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[7]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[7]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getNumberOfAwards(int ordinal) {
        if(fieldIndex[8] == -1)
            return missingDataHandler().handleInt("Actor", ordinal, "numberOfAwards");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[8]);
    }

    public Integer getNumberOfAwardsBoxed(int ordinal) {
        int i;
        if(fieldIndex[8] == -1) {
            i = missingDataHandler().handleInt("Actor", ordinal, "numberOfAwards");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[8]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[8]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getDebutMovieOrdinal(int ordinal) {
        if(fieldIndex[9] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "debutMovie");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[9]);
    }

    public StringTypeAPI getDebutMovieTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getMostFamousRoleOrdinal(int ordinal) {
        if(fieldIndex[10] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "mostFamousRole");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[10]);
    }

    public StringTypeAPI getMostFamousRoleTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public double getHeight(int ordinal) {
        if(fieldIndex[11] == -1)
            return missingDataHandler().handleDouble("Actor", ordinal, "height");
        return getTypeDataAccess().readDouble(ordinal, fieldIndex[11]);
    }

    public Double getHeightBoxed(int ordinal) {
        double d;
        if(fieldIndex[11] == -1) {
            d = missingDataHandler().handleDouble("Actor", ordinal, "height");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[11]);
            d = getTypeDataAccess().readDouble(ordinal, fieldIndex[11]);
        }
        return Double.isNaN(d) ? null : Double.valueOf(d);
    }



    public double getWeight(int ordinal) {
        if(fieldIndex[12] == -1)
            return missingDataHandler().handleDouble("Actor", ordinal, "weight");
        return getTypeDataAccess().readDouble(ordinal, fieldIndex[12]);
    }

    public Double getWeightBoxed(int ordinal) {
        double d;
        if(fieldIndex[12] == -1) {
            d = missingDataHandler().handleDouble("Actor", ordinal, "weight");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[12]);
            d = getTypeDataAccess().readDouble(ordinal, fieldIndex[12]);
        }
        return Double.isNaN(d) ? null : Double.valueOf(d);
    }



    public int getHairColorOrdinal(int ordinal) {
        if(fieldIndex[13] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "hairColor");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[13]);
    }

    public StringTypeAPI getHairColorTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getEyeColorOrdinal(int ordinal) {
        if(fieldIndex[14] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "eyeColor");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[14]);
    }

    public StringTypeAPI getEyeColorTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getEmailOrdinal(int ordinal) {
        if(fieldIndex[15] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "email");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[15]);
    }

    public StringTypeAPI getEmailTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getPhoneNumberOrdinal(int ordinal) {
        if(fieldIndex[16] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "phoneNumber");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[16]);
    }

    public StringTypeAPI getPhoneNumberTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getAddressOrdinal(int ordinal) {
        if(fieldIndex[17] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "address");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[17]);
    }

    public StringTypeAPI getAddressTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getInstagramHandleOrdinal(int ordinal) {
        if(fieldIndex[18] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "instagramHandle");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[18]);
    }

    public StringTypeAPI getInstagramHandleTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getTwitterHandleOrdinal(int ordinal) {
        if(fieldIndex[19] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "twitterHandle");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[19]);
    }

    public StringTypeAPI getTwitterHandleTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getFacebookPageOrdinal(int ordinal) {
        if(fieldIndex[20] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "facebookPage");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[20]);
    }

    public StringTypeAPI getFacebookPageTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public boolean getCanSing(int ordinal) {
        if(fieldIndex[21] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "canSing"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[21]));
    }

    public Boolean getCanSingBoxed(int ordinal) {
        if(fieldIndex[21] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "canSing");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[21]);
    }



    public boolean getCanDance(int ordinal) {
        if(fieldIndex[22] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "canDance"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[22]));
    }

    public Boolean getCanDanceBoxed(int ordinal) {
        if(fieldIndex[22] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "canDance");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[22]);
    }



    public boolean getCanAct(int ordinal) {
        if(fieldIndex[23] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "canAct"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[23]));
    }

    public Boolean getCanActBoxed(int ordinal) {
        if(fieldIndex[23] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "canAct");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[23]);
    }



    public boolean getCanDirect(int ordinal) {
        if(fieldIndex[24] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "canDirect"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[24]));
    }

    public Boolean getCanDirectBoxed(int ordinal) {
        if(fieldIndex[24] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "canDirect");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[24]);
    }



    public boolean getCanWrite(int ordinal) {
        if(fieldIndex[25] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "canWrite"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[25]));
    }

    public Boolean getCanWriteBoxed(int ordinal) {
        if(fieldIndex[25] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "canWrite");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[25]);
    }



    public int getFavoriteGenreOrdinal(int ordinal) {
        if(fieldIndex[26] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "favoriteGenre");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[26]);
    }

    public StringTypeAPI getFavoriteGenreTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getFavoriteDirectorOrdinal(int ordinal) {
        if(fieldIndex[27] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "favoriteDirector");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[27]);
    }

    public StringTypeAPI getFavoriteDirectorTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getFavoriteActorOrdinal(int ordinal) {
        if(fieldIndex[28] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "favoriteActor");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[28]);
    }

    public StringTypeAPI getFavoriteActorTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public boolean getIsMarried(int ordinal) {
        if(fieldIndex[29] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "isMarried"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[29]));
    }

    public Boolean getIsMarriedBoxed(int ordinal) {
        if(fieldIndex[29] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "isMarried");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[29]);
    }



    public int getNumberOfChildren(int ordinal) {
        if(fieldIndex[30] == -1)
            return missingDataHandler().handleInt("Actor", ordinal, "numberOfChildren");
        return getTypeDataAccess().readInt(ordinal, fieldIndex[30]);
    }

    public Integer getNumberOfChildrenBoxed(int ordinal) {
        int i;
        if(fieldIndex[30] == -1) {
            i = missingDataHandler().handleInt("Actor", ordinal, "numberOfChildren");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[30]);
            i = getTypeDataAccess().readInt(ordinal, fieldIndex[30]);
        }
        if(i == Integer.MIN_VALUE)
            return null;
        return Integer.valueOf(i);
    }



    public int getAlmaMaterOrdinal(int ordinal) {
        if(fieldIndex[31] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "almaMater");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[31]);
    }

    public StringTypeAPI getAlmaMaterTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public boolean getHasWonOscar(int ordinal) {
        if(fieldIndex[32] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "hasWonOscar"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[32]));
    }

    public Boolean getHasWonOscarBoxed(int ordinal) {
        if(fieldIndex[32] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "hasWonOscar");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[32]);
    }



    public boolean getHasWonEmmy(int ordinal) {
        if(fieldIndex[33] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "hasWonEmmy"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[33]));
    }

    public Boolean getHasWonEmmyBoxed(int ordinal) {
        if(fieldIndex[33] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "hasWonEmmy");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[33]);
    }



    public boolean getHasWonGoldenGlobe(int ordinal) {
        if(fieldIndex[34] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "hasWonGoldenGlobe"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[34]));
    }

    public Boolean getHasWonGoldenGlobeBoxed(int ordinal) {
        if(fieldIndex[34] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "hasWonGoldenGlobe");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[34]);
    }



    public double getNetWorth(int ordinal) {
        if(fieldIndex[35] == -1)
            return missingDataHandler().handleDouble("Actor", ordinal, "netWorth");
        return getTypeDataAccess().readDouble(ordinal, fieldIndex[35]);
    }

    public Double getNetWorthBoxed(int ordinal) {
        double d;
        if(fieldIndex[35] == -1) {
            d = missingDataHandler().handleDouble("Actor", ordinal, "netWorth");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[35]);
            d = getTypeDataAccess().readDouble(ordinal, fieldIndex[35]);
        }
        return Double.isNaN(d) ? null : Double.valueOf(d);
    }



    public double getAnnualIncome(int ordinal) {
        if(fieldIndex[36] == -1)
            return missingDataHandler().handleDouble("Actor", ordinal, "annualIncome");
        return getTypeDataAccess().readDouble(ordinal, fieldIndex[36]);
    }

    public Double getAnnualIncomeBoxed(int ordinal) {
        double d;
        if(fieldIndex[36] == -1) {
            d = missingDataHandler().handleDouble("Actor", ordinal, "annualIncome");
        } else {
            boxedFieldAccessSampler.recordFieldAccess(fieldIndex[36]);
            d = getTypeDataAccess().readDouble(ordinal, fieldIndex[36]);
        }
        return Double.isNaN(d) ? null : Double.valueOf(d);
    }



    public boolean getIsAvailableForNextProject(int ordinal) {
        if(fieldIndex[37] == -1)
            return Boolean.TRUE.equals(missingDataHandler().handleBoolean("Actor", ordinal, "isAvailableForNextProject"));
        return Boolean.TRUE.equals(getTypeDataAccess().readBoolean(ordinal, fieldIndex[37]));
    }

    public Boolean getIsAvailableForNextProjectBoxed(int ordinal) {
        if(fieldIndex[37] == -1)
            return missingDataHandler().handleBoolean("Actor", ordinal, "isAvailableForNextProject");
        return getTypeDataAccess().readBoolean(ordinal, fieldIndex[37]);
    }



    public int getCurrentProjectOrdinal(int ordinal) {
        if(fieldIndex[38] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "currentProject");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[38]);
    }

    public StringTypeAPI getCurrentProjectTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getAgentNameOrdinal(int ordinal) {
        if(fieldIndex[39] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "agentName");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[39]);
    }

    public StringTypeAPI getAgentNameTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public int getAgentContactOrdinal(int ordinal) {
        if(fieldIndex[40] == -1)
            return missingDataHandler().handleReferencedOrdinal("Actor", ordinal, "agentContact");
        return getTypeDataAccess().readOrdinal(ordinal, fieldIndex[40]);
    }

    public StringTypeAPI getAgentContactTypeAPI() {
        return getAPI().getStringTypeAPI();
    }

    public ActorDelegateLookupImpl getDelegateLookupImpl() {
        return delegateLookupImpl;
    }

    @Override
    public MovieAPI getAPI() {
        return (MovieAPI) api;
    }

}