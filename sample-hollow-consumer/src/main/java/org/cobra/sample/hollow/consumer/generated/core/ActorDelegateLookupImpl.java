package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;

@SuppressWarnings("all")
public class ActorDelegateLookupImpl extends HollowObjectAbstractDelegate implements ActorDelegate {

    private final ActorTypeAPI typeAPI;

    public ActorDelegateLookupImpl(ActorTypeAPI typeAPI) {
        this.typeAPI = typeAPI;
    }

    public int getId(int ordinal) {
        return typeAPI.getId(ordinal);
    }

    public Integer getIdBoxed(int ordinal) {
        return typeAPI.getIdBoxed(ordinal);
    }

    public String getFirstName(int ordinal) {
        ordinal = typeAPI.getFirstNameOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isFirstNameEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getFirstNameOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getFirstNameOrdinal(int ordinal) {
        return typeAPI.getFirstNameOrdinal(ordinal);
    }

    public String getLastName(int ordinal) {
        ordinal = typeAPI.getLastNameOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isLastNameEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getLastNameOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getLastNameOrdinal(int ordinal) {
        return typeAPI.getLastNameOrdinal(ordinal);
    }

    public int getAge(int ordinal) {
        return typeAPI.getAge(ordinal);
    }

    public Integer getAgeBoxed(int ordinal) {
        return typeAPI.getAgeBoxed(ordinal);
    }

    public String getGender(int ordinal) {
        ordinal = typeAPI.getGenderOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isGenderEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getGenderOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getGenderOrdinal(int ordinal) {
        return typeAPI.getGenderOrdinal(ordinal);
    }

    public String getNationality(int ordinal) {
        ordinal = typeAPI.getNationalityOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isNationalityEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getNationalityOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getNationalityOrdinal(int ordinal) {
        return typeAPI.getNationalityOrdinal(ordinal);
    }

    public int getYearsOfExperience(int ordinal) {
        return typeAPI.getYearsOfExperience(ordinal);
    }

    public Integer getYearsOfExperienceBoxed(int ordinal) {
        return typeAPI.getYearsOfExperienceBoxed(ordinal);
    }

    public int getNumberOfMovies(int ordinal) {
        return typeAPI.getNumberOfMovies(ordinal);
    }

    public Integer getNumberOfMoviesBoxed(int ordinal) {
        return typeAPI.getNumberOfMoviesBoxed(ordinal);
    }

    public int getNumberOfAwards(int ordinal) {
        return typeAPI.getNumberOfAwards(ordinal);
    }

    public Integer getNumberOfAwardsBoxed(int ordinal) {
        return typeAPI.getNumberOfAwardsBoxed(ordinal);
    }

    public String getDebutMovie(int ordinal) {
        ordinal = typeAPI.getDebutMovieOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isDebutMovieEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getDebutMovieOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getDebutMovieOrdinal(int ordinal) {
        return typeAPI.getDebutMovieOrdinal(ordinal);
    }

    public String getMostFamousRole(int ordinal) {
        ordinal = typeAPI.getMostFamousRoleOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isMostFamousRoleEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getMostFamousRoleOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getMostFamousRoleOrdinal(int ordinal) {
        return typeAPI.getMostFamousRoleOrdinal(ordinal);
    }

    public double getHeight(int ordinal) {
        return typeAPI.getHeight(ordinal);
    }

    public Double getHeightBoxed(int ordinal) {
        return typeAPI.getHeightBoxed(ordinal);
    }

    public double getWeight(int ordinal) {
        return typeAPI.getWeight(ordinal);
    }

    public Double getWeightBoxed(int ordinal) {
        return typeAPI.getWeightBoxed(ordinal);
    }

    public String getHairColor(int ordinal) {
        ordinal = typeAPI.getHairColorOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isHairColorEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getHairColorOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getHairColorOrdinal(int ordinal) {
        return typeAPI.getHairColorOrdinal(ordinal);
    }

    public String getEyeColor(int ordinal) {
        ordinal = typeAPI.getEyeColorOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isEyeColorEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getEyeColorOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getEyeColorOrdinal(int ordinal) {
        return typeAPI.getEyeColorOrdinal(ordinal);
    }

    public String getEmail(int ordinal) {
        ordinal = typeAPI.getEmailOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isEmailEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getEmailOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getEmailOrdinal(int ordinal) {
        return typeAPI.getEmailOrdinal(ordinal);
    }

    public String getPhoneNumber(int ordinal) {
        ordinal = typeAPI.getPhoneNumberOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isPhoneNumberEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getPhoneNumberOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getPhoneNumberOrdinal(int ordinal) {
        return typeAPI.getPhoneNumberOrdinal(ordinal);
    }

    public String getAddress(int ordinal) {
        ordinal = typeAPI.getAddressOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isAddressEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getAddressOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getAddressOrdinal(int ordinal) {
        return typeAPI.getAddressOrdinal(ordinal);
    }

    public String getInstagramHandle(int ordinal) {
        ordinal = typeAPI.getInstagramHandleOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isInstagramHandleEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getInstagramHandleOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getInstagramHandleOrdinal(int ordinal) {
        return typeAPI.getInstagramHandleOrdinal(ordinal);
    }

    public String getTwitterHandle(int ordinal) {
        ordinal = typeAPI.getTwitterHandleOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isTwitterHandleEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getTwitterHandleOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getTwitterHandleOrdinal(int ordinal) {
        return typeAPI.getTwitterHandleOrdinal(ordinal);
    }

    public String getFacebookPage(int ordinal) {
        ordinal = typeAPI.getFacebookPageOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isFacebookPageEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getFacebookPageOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getFacebookPageOrdinal(int ordinal) {
        return typeAPI.getFacebookPageOrdinal(ordinal);
    }

    public boolean getCanSing(int ordinal) {
        return typeAPI.getCanSing(ordinal);
    }

    public Boolean getCanSingBoxed(int ordinal) {
        return typeAPI.getCanSingBoxed(ordinal);
    }

    public boolean getCanDance(int ordinal) {
        return typeAPI.getCanDance(ordinal);
    }

    public Boolean getCanDanceBoxed(int ordinal) {
        return typeAPI.getCanDanceBoxed(ordinal);
    }

    public boolean getCanAct(int ordinal) {
        return typeAPI.getCanAct(ordinal);
    }

    public Boolean getCanActBoxed(int ordinal) {
        return typeAPI.getCanActBoxed(ordinal);
    }

    public boolean getCanDirect(int ordinal) {
        return typeAPI.getCanDirect(ordinal);
    }

    public Boolean getCanDirectBoxed(int ordinal) {
        return typeAPI.getCanDirectBoxed(ordinal);
    }

    public boolean getCanWrite(int ordinal) {
        return typeAPI.getCanWrite(ordinal);
    }

    public Boolean getCanWriteBoxed(int ordinal) {
        return typeAPI.getCanWriteBoxed(ordinal);
    }

    public String getFavoriteGenre(int ordinal) {
        ordinal = typeAPI.getFavoriteGenreOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isFavoriteGenreEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getFavoriteGenreOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getFavoriteGenreOrdinal(int ordinal) {
        return typeAPI.getFavoriteGenreOrdinal(ordinal);
    }

    public String getFavoriteDirector(int ordinal) {
        ordinal = typeAPI.getFavoriteDirectorOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isFavoriteDirectorEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getFavoriteDirectorOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getFavoriteDirectorOrdinal(int ordinal) {
        return typeAPI.getFavoriteDirectorOrdinal(ordinal);
    }

    public String getFavoriteActor(int ordinal) {
        ordinal = typeAPI.getFavoriteActorOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isFavoriteActorEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getFavoriteActorOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getFavoriteActorOrdinal(int ordinal) {
        return typeAPI.getFavoriteActorOrdinal(ordinal);
    }

    public boolean getIsMarried(int ordinal) {
        return typeAPI.getIsMarried(ordinal);
    }

    public Boolean getIsMarriedBoxed(int ordinal) {
        return typeAPI.getIsMarriedBoxed(ordinal);
    }

    public int getNumberOfChildren(int ordinal) {
        return typeAPI.getNumberOfChildren(ordinal);
    }

    public Integer getNumberOfChildrenBoxed(int ordinal) {
        return typeAPI.getNumberOfChildrenBoxed(ordinal);
    }

    public String getAlmaMater(int ordinal) {
        ordinal = typeAPI.getAlmaMaterOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isAlmaMaterEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getAlmaMaterOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getAlmaMaterOrdinal(int ordinal) {
        return typeAPI.getAlmaMaterOrdinal(ordinal);
    }

    public boolean getHasWonOscar(int ordinal) {
        return typeAPI.getHasWonOscar(ordinal);
    }

    public Boolean getHasWonOscarBoxed(int ordinal) {
        return typeAPI.getHasWonOscarBoxed(ordinal);
    }

    public boolean getHasWonEmmy(int ordinal) {
        return typeAPI.getHasWonEmmy(ordinal);
    }

    public Boolean getHasWonEmmyBoxed(int ordinal) {
        return typeAPI.getHasWonEmmyBoxed(ordinal);
    }

    public boolean getHasWonGoldenGlobe(int ordinal) {
        return typeAPI.getHasWonGoldenGlobe(ordinal);
    }

    public Boolean getHasWonGoldenGlobeBoxed(int ordinal) {
        return typeAPI.getHasWonGoldenGlobeBoxed(ordinal);
    }

    public double getNetWorth(int ordinal) {
        return typeAPI.getNetWorth(ordinal);
    }

    public Double getNetWorthBoxed(int ordinal) {
        return typeAPI.getNetWorthBoxed(ordinal);
    }

    public double getAnnualIncome(int ordinal) {
        return typeAPI.getAnnualIncome(ordinal);
    }

    public Double getAnnualIncomeBoxed(int ordinal) {
        return typeAPI.getAnnualIncomeBoxed(ordinal);
    }

    public boolean getIsAvailableForNextProject(int ordinal) {
        return typeAPI.getIsAvailableForNextProject(ordinal);
    }

    public Boolean getIsAvailableForNextProjectBoxed(int ordinal) {
        return typeAPI.getIsAvailableForNextProjectBoxed(ordinal);
    }

    public String getCurrentProject(int ordinal) {
        ordinal = typeAPI.getCurrentProjectOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isCurrentProjectEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getCurrentProjectOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getCurrentProjectOrdinal(int ordinal) {
        return typeAPI.getCurrentProjectOrdinal(ordinal);
    }

    public String getAgentName(int ordinal) {
        ordinal = typeAPI.getAgentNameOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isAgentNameEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getAgentNameOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getAgentNameOrdinal(int ordinal) {
        return typeAPI.getAgentNameOrdinal(ordinal);
    }

    public String getAgentContact(int ordinal) {
        ordinal = typeAPI.getAgentContactOrdinal(ordinal);
        return ordinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(ordinal);
    }

    public boolean isAgentContactEqual(int ordinal, String testValue) {
        ordinal = typeAPI.getAgentContactOrdinal(ordinal);
        return ordinal == -1 ? testValue == null : typeAPI.getAPI().getStringTypeAPI().isValueEqual(ordinal, testValue);
    }

    public int getAgentContactOrdinal(int ordinal) {
        return typeAPI.getAgentContactOrdinal(ordinal);
    }

    public ActorTypeAPI getTypeAPI() {
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