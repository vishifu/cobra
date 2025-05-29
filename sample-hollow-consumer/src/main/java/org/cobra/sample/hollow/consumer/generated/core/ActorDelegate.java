package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectDelegate;


@SuppressWarnings("all")
public interface ActorDelegate extends HollowObjectDelegate {

    public int getId(int ordinal);

    public Integer getIdBoxed(int ordinal);

    public String getFirstName(int ordinal);

    public boolean isFirstNameEqual(int ordinal, String testValue);

    public int getFirstNameOrdinal(int ordinal);

    public String getLastName(int ordinal);

    public boolean isLastNameEqual(int ordinal, String testValue);

    public int getLastNameOrdinal(int ordinal);

    public int getAge(int ordinal);

    public Integer getAgeBoxed(int ordinal);

    public String getGender(int ordinal);

    public boolean isGenderEqual(int ordinal, String testValue);

    public int getGenderOrdinal(int ordinal);

    public String getNationality(int ordinal);

    public boolean isNationalityEqual(int ordinal, String testValue);

    public int getNationalityOrdinal(int ordinal);

    public int getYearsOfExperience(int ordinal);

    public Integer getYearsOfExperienceBoxed(int ordinal);

    public int getNumberOfMovies(int ordinal);

    public Integer getNumberOfMoviesBoxed(int ordinal);

    public int getNumberOfAwards(int ordinal);

    public Integer getNumberOfAwardsBoxed(int ordinal);

    public String getDebutMovie(int ordinal);

    public boolean isDebutMovieEqual(int ordinal, String testValue);

    public int getDebutMovieOrdinal(int ordinal);

    public String getMostFamousRole(int ordinal);

    public boolean isMostFamousRoleEqual(int ordinal, String testValue);

    public int getMostFamousRoleOrdinal(int ordinal);

    public double getHeight(int ordinal);

    public Double getHeightBoxed(int ordinal);

    public double getWeight(int ordinal);

    public Double getWeightBoxed(int ordinal);

    public String getHairColor(int ordinal);

    public boolean isHairColorEqual(int ordinal, String testValue);

    public int getHairColorOrdinal(int ordinal);

    public String getEyeColor(int ordinal);

    public boolean isEyeColorEqual(int ordinal, String testValue);

    public int getEyeColorOrdinal(int ordinal);

    public String getEmail(int ordinal);

    public boolean isEmailEqual(int ordinal, String testValue);

    public int getEmailOrdinal(int ordinal);

    public String getPhoneNumber(int ordinal);

    public boolean isPhoneNumberEqual(int ordinal, String testValue);

    public int getPhoneNumberOrdinal(int ordinal);

    public String getAddress(int ordinal);

    public boolean isAddressEqual(int ordinal, String testValue);

    public int getAddressOrdinal(int ordinal);

    public String getInstagramHandle(int ordinal);

    public boolean isInstagramHandleEqual(int ordinal, String testValue);

    public int getInstagramHandleOrdinal(int ordinal);

    public String getTwitterHandle(int ordinal);

    public boolean isTwitterHandleEqual(int ordinal, String testValue);

    public int getTwitterHandleOrdinal(int ordinal);

    public String getFacebookPage(int ordinal);

    public boolean isFacebookPageEqual(int ordinal, String testValue);

    public int getFacebookPageOrdinal(int ordinal);

    public boolean getCanSing(int ordinal);

    public Boolean getCanSingBoxed(int ordinal);

    public boolean getCanDance(int ordinal);

    public Boolean getCanDanceBoxed(int ordinal);

    public boolean getCanAct(int ordinal);

    public Boolean getCanActBoxed(int ordinal);

    public boolean getCanDirect(int ordinal);

    public Boolean getCanDirectBoxed(int ordinal);

    public boolean getCanWrite(int ordinal);

    public Boolean getCanWriteBoxed(int ordinal);

    public String getFavoriteGenre(int ordinal);

    public boolean isFavoriteGenreEqual(int ordinal, String testValue);

    public int getFavoriteGenreOrdinal(int ordinal);

    public String getFavoriteDirector(int ordinal);

    public boolean isFavoriteDirectorEqual(int ordinal, String testValue);

    public int getFavoriteDirectorOrdinal(int ordinal);

    public String getFavoriteActor(int ordinal);

    public boolean isFavoriteActorEqual(int ordinal, String testValue);

    public int getFavoriteActorOrdinal(int ordinal);

    public boolean getIsMarried(int ordinal);

    public Boolean getIsMarriedBoxed(int ordinal);

    public int getNumberOfChildren(int ordinal);

    public Integer getNumberOfChildrenBoxed(int ordinal);

    public String getAlmaMater(int ordinal);

    public boolean isAlmaMaterEqual(int ordinal, String testValue);

    public int getAlmaMaterOrdinal(int ordinal);

    public boolean getHasWonOscar(int ordinal);

    public Boolean getHasWonOscarBoxed(int ordinal);

    public boolean getHasWonEmmy(int ordinal);

    public Boolean getHasWonEmmyBoxed(int ordinal);

    public boolean getHasWonGoldenGlobe(int ordinal);

    public Boolean getHasWonGoldenGlobeBoxed(int ordinal);

    public double getNetWorth(int ordinal);

    public Double getNetWorthBoxed(int ordinal);

    public double getAnnualIncome(int ordinal);

    public Double getAnnualIncomeBoxed(int ordinal);

    public boolean getIsAvailableForNextProject(int ordinal);

    public Boolean getIsAvailableForNextProjectBoxed(int ordinal);

    public String getCurrentProject(int ordinal);

    public boolean isCurrentProjectEqual(int ordinal, String testValue);

    public int getCurrentProjectOrdinal(int ordinal);

    public String getAgentName(int ordinal);

    public boolean isAgentNameEqual(int ordinal, String testValue);

    public int getAgentNameOrdinal(int ordinal);

    public String getAgentContact(int ordinal);

    public boolean isAgentContactEqual(int ordinal, String testValue);

    public int getAgentContactOrdinal(int ordinal);

    public ActorTypeAPI getTypeAPI();

}