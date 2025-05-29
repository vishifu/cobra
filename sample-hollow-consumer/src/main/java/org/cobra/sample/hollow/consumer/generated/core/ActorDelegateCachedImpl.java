package org.cobra.sample.hollow.consumer.generated.core;


import com.netflix.hollow.api.objects.delegate.HollowObjectAbstractDelegate;
import com.netflix.hollow.core.read.dataaccess.HollowObjectTypeDataAccess;
import com.netflix.hollow.core.schema.HollowObjectSchema;
import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowCachedDelegate;

@SuppressWarnings("all")
public class ActorDelegateCachedImpl extends HollowObjectAbstractDelegate implements HollowCachedDelegate, ActorDelegate {

    private final Integer id;
    private final String firstName;
    private final int firstNameOrdinal;
    private final String lastName;
    private final int lastNameOrdinal;
    private final Integer age;
    private final String gender;
    private final int genderOrdinal;
    private final String nationality;
    private final int nationalityOrdinal;
    private final Integer yearsOfExperience;
    private final Integer numberOfMovies;
    private final Integer numberOfAwards;
    private final String debutMovie;
    private final int debutMovieOrdinal;
    private final String mostFamousRole;
    private final int mostFamousRoleOrdinal;
    private final Double height;
    private final Double weight;
    private final String hairColor;
    private final int hairColorOrdinal;
    private final String eyeColor;
    private final int eyeColorOrdinal;
    private final String email;
    private final int emailOrdinal;
    private final String phoneNumber;
    private final int phoneNumberOrdinal;
    private final String address;
    private final int addressOrdinal;
    private final String instagramHandle;
    private final int instagramHandleOrdinal;
    private final String twitterHandle;
    private final int twitterHandleOrdinal;
    private final String facebookPage;
    private final int facebookPageOrdinal;
    private final Boolean canSing;
    private final Boolean canDance;
    private final Boolean canAct;
    private final Boolean canDirect;
    private final Boolean canWrite;
    private final String favoriteGenre;
    private final int favoriteGenreOrdinal;
    private final String favoriteDirector;
    private final int favoriteDirectorOrdinal;
    private final String favoriteActor;
    private final int favoriteActorOrdinal;
    private final Boolean isMarried;
    private final Integer numberOfChildren;
    private final String almaMater;
    private final int almaMaterOrdinal;
    private final Boolean hasWonOscar;
    private final Boolean hasWonEmmy;
    private final Boolean hasWonGoldenGlobe;
    private final Double netWorth;
    private final Double annualIncome;
    private final Boolean isAvailableForNextProject;
    private final String currentProject;
    private final int currentProjectOrdinal;
    private final String agentName;
    private final int agentNameOrdinal;
    private final String agentContact;
    private final int agentContactOrdinal;
    private ActorTypeAPI typeAPI;

    public ActorDelegateCachedImpl(ActorTypeAPI typeAPI, int ordinal) {
        this.id = typeAPI.getIdBoxed(ordinal);
        this.firstNameOrdinal = typeAPI.getFirstNameOrdinal(ordinal);
        int firstNameTempOrdinal = firstNameOrdinal;
        this.firstName = firstNameTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(firstNameTempOrdinal);
        this.lastNameOrdinal = typeAPI.getLastNameOrdinal(ordinal);
        int lastNameTempOrdinal = lastNameOrdinal;
        this.lastName = lastNameTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(lastNameTempOrdinal);
        this.age = typeAPI.getAgeBoxed(ordinal);
        this.genderOrdinal = typeAPI.getGenderOrdinal(ordinal);
        int genderTempOrdinal = genderOrdinal;
        this.gender = genderTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(genderTempOrdinal);
        this.nationalityOrdinal = typeAPI.getNationalityOrdinal(ordinal);
        int nationalityTempOrdinal = nationalityOrdinal;
        this.nationality = nationalityTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(nationalityTempOrdinal);
        this.yearsOfExperience = typeAPI.getYearsOfExperienceBoxed(ordinal);
        this.numberOfMovies = typeAPI.getNumberOfMoviesBoxed(ordinal);
        this.numberOfAwards = typeAPI.getNumberOfAwardsBoxed(ordinal);
        this.debutMovieOrdinal = typeAPI.getDebutMovieOrdinal(ordinal);
        int debutMovieTempOrdinal = debutMovieOrdinal;
        this.debutMovie = debutMovieTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(debutMovieTempOrdinal);
        this.mostFamousRoleOrdinal = typeAPI.getMostFamousRoleOrdinal(ordinal);
        int mostFamousRoleTempOrdinal = mostFamousRoleOrdinal;
        this.mostFamousRole = mostFamousRoleTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(mostFamousRoleTempOrdinal);
        this.height = typeAPI.getHeightBoxed(ordinal);
        this.weight = typeAPI.getWeightBoxed(ordinal);
        this.hairColorOrdinal = typeAPI.getHairColorOrdinal(ordinal);
        int hairColorTempOrdinal = hairColorOrdinal;
        this.hairColor = hairColorTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(hairColorTempOrdinal);
        this.eyeColorOrdinal = typeAPI.getEyeColorOrdinal(ordinal);
        int eyeColorTempOrdinal = eyeColorOrdinal;
        this.eyeColor = eyeColorTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(eyeColorTempOrdinal);
        this.emailOrdinal = typeAPI.getEmailOrdinal(ordinal);
        int emailTempOrdinal = emailOrdinal;
        this.email = emailTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(emailTempOrdinal);
        this.phoneNumberOrdinal = typeAPI.getPhoneNumberOrdinal(ordinal);
        int phoneNumberTempOrdinal = phoneNumberOrdinal;
        this.phoneNumber = phoneNumberTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(phoneNumberTempOrdinal);
        this.addressOrdinal = typeAPI.getAddressOrdinal(ordinal);
        int addressTempOrdinal = addressOrdinal;
        this.address = addressTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(addressTempOrdinal);
        this.instagramHandleOrdinal = typeAPI.getInstagramHandleOrdinal(ordinal);
        int instagramHandleTempOrdinal = instagramHandleOrdinal;
        this.instagramHandle = instagramHandleTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(instagramHandleTempOrdinal);
        this.twitterHandleOrdinal = typeAPI.getTwitterHandleOrdinal(ordinal);
        int twitterHandleTempOrdinal = twitterHandleOrdinal;
        this.twitterHandle = twitterHandleTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(twitterHandleTempOrdinal);
        this.facebookPageOrdinal = typeAPI.getFacebookPageOrdinal(ordinal);
        int facebookPageTempOrdinal = facebookPageOrdinal;
        this.facebookPage = facebookPageTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(facebookPageTempOrdinal);
        this.canSing = typeAPI.getCanSingBoxed(ordinal);
        this.canDance = typeAPI.getCanDanceBoxed(ordinal);
        this.canAct = typeAPI.getCanActBoxed(ordinal);
        this.canDirect = typeAPI.getCanDirectBoxed(ordinal);
        this.canWrite = typeAPI.getCanWriteBoxed(ordinal);
        this.favoriteGenreOrdinal = typeAPI.getFavoriteGenreOrdinal(ordinal);
        int favoriteGenreTempOrdinal = favoriteGenreOrdinal;
        this.favoriteGenre = favoriteGenreTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(favoriteGenreTempOrdinal);
        this.favoriteDirectorOrdinal = typeAPI.getFavoriteDirectorOrdinal(ordinal);
        int favoriteDirectorTempOrdinal = favoriteDirectorOrdinal;
        this.favoriteDirector = favoriteDirectorTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(favoriteDirectorTempOrdinal);
        this.favoriteActorOrdinal = typeAPI.getFavoriteActorOrdinal(ordinal);
        int favoriteActorTempOrdinal = favoriteActorOrdinal;
        this.favoriteActor = favoriteActorTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(favoriteActorTempOrdinal);
        this.isMarried = typeAPI.getIsMarriedBoxed(ordinal);
        this.numberOfChildren = typeAPI.getNumberOfChildrenBoxed(ordinal);
        this.almaMaterOrdinal = typeAPI.getAlmaMaterOrdinal(ordinal);
        int almaMaterTempOrdinal = almaMaterOrdinal;
        this.almaMater = almaMaterTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(almaMaterTempOrdinal);
        this.hasWonOscar = typeAPI.getHasWonOscarBoxed(ordinal);
        this.hasWonEmmy = typeAPI.getHasWonEmmyBoxed(ordinal);
        this.hasWonGoldenGlobe = typeAPI.getHasWonGoldenGlobeBoxed(ordinal);
        this.netWorth = typeAPI.getNetWorthBoxed(ordinal);
        this.annualIncome = typeAPI.getAnnualIncomeBoxed(ordinal);
        this.isAvailableForNextProject = typeAPI.getIsAvailableForNextProjectBoxed(ordinal);
        this.currentProjectOrdinal = typeAPI.getCurrentProjectOrdinal(ordinal);
        int currentProjectTempOrdinal = currentProjectOrdinal;
        this.currentProject = currentProjectTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(currentProjectTempOrdinal);
        this.agentNameOrdinal = typeAPI.getAgentNameOrdinal(ordinal);
        int agentNameTempOrdinal = agentNameOrdinal;
        this.agentName = agentNameTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(agentNameTempOrdinal);
        this.agentContactOrdinal = typeAPI.getAgentContactOrdinal(ordinal);
        int agentContactTempOrdinal = agentContactOrdinal;
        this.agentContact = agentContactTempOrdinal == -1 ? null : typeAPI.getAPI().getStringTypeAPI().getValue(agentContactTempOrdinal);
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

    public String getFirstName(int ordinal) {
        return firstName;
    }

    public boolean isFirstNameEqual(int ordinal, String testValue) {
        if(testValue == null)
            return firstName == null;
        return testValue.equals(firstName);
    }

    public int getFirstNameOrdinal(int ordinal) {
        return firstNameOrdinal;
    }

    public String getLastName(int ordinal) {
        return lastName;
    }

    public boolean isLastNameEqual(int ordinal, String testValue) {
        if(testValue == null)
            return lastName == null;
        return testValue.equals(lastName);
    }

    public int getLastNameOrdinal(int ordinal) {
        return lastNameOrdinal;
    }

    public int getAge(int ordinal) {
        if(age == null)
            return Integer.MIN_VALUE;
        return age.intValue();
    }

    public Integer getAgeBoxed(int ordinal) {
        return age;
    }

    public String getGender(int ordinal) {
        return gender;
    }

    public boolean isGenderEqual(int ordinal, String testValue) {
        if(testValue == null)
            return gender == null;
        return testValue.equals(gender);
    }

    public int getGenderOrdinal(int ordinal) {
        return genderOrdinal;
    }

    public String getNationality(int ordinal) {
        return nationality;
    }

    public boolean isNationalityEqual(int ordinal, String testValue) {
        if(testValue == null)
            return nationality == null;
        return testValue.equals(nationality);
    }

    public int getNationalityOrdinal(int ordinal) {
        return nationalityOrdinal;
    }

    public int getYearsOfExperience(int ordinal) {
        if(yearsOfExperience == null)
            return Integer.MIN_VALUE;
        return yearsOfExperience.intValue();
    }

    public Integer getYearsOfExperienceBoxed(int ordinal) {
        return yearsOfExperience;
    }

    public int getNumberOfMovies(int ordinal) {
        if(numberOfMovies == null)
            return Integer.MIN_VALUE;
        return numberOfMovies.intValue();
    }

    public Integer getNumberOfMoviesBoxed(int ordinal) {
        return numberOfMovies;
    }

    public int getNumberOfAwards(int ordinal) {
        if(numberOfAwards == null)
            return Integer.MIN_VALUE;
        return numberOfAwards.intValue();
    }

    public Integer getNumberOfAwardsBoxed(int ordinal) {
        return numberOfAwards;
    }

    public String getDebutMovie(int ordinal) {
        return debutMovie;
    }

    public boolean isDebutMovieEqual(int ordinal, String testValue) {
        if(testValue == null)
            return debutMovie == null;
        return testValue.equals(debutMovie);
    }

    public int getDebutMovieOrdinal(int ordinal) {
        return debutMovieOrdinal;
    }

    public String getMostFamousRole(int ordinal) {
        return mostFamousRole;
    }

    public boolean isMostFamousRoleEqual(int ordinal, String testValue) {
        if(testValue == null)
            return mostFamousRole == null;
        return testValue.equals(mostFamousRole);
    }

    public int getMostFamousRoleOrdinal(int ordinal) {
        return mostFamousRoleOrdinal;
    }

    public double getHeight(int ordinal) {
        if(height == null)
            return Double.NaN;
        return height.doubleValue();
    }

    public Double getHeightBoxed(int ordinal) {
        return height;
    }

    public double getWeight(int ordinal) {
        if(weight == null)
            return Double.NaN;
        return weight.doubleValue();
    }

    public Double getWeightBoxed(int ordinal) {
        return weight;
    }

    public String getHairColor(int ordinal) {
        return hairColor;
    }

    public boolean isHairColorEqual(int ordinal, String testValue) {
        if(testValue == null)
            return hairColor == null;
        return testValue.equals(hairColor);
    }

    public int getHairColorOrdinal(int ordinal) {
        return hairColorOrdinal;
    }

    public String getEyeColor(int ordinal) {
        return eyeColor;
    }

    public boolean isEyeColorEqual(int ordinal, String testValue) {
        if(testValue == null)
            return eyeColor == null;
        return testValue.equals(eyeColor);
    }

    public int getEyeColorOrdinal(int ordinal) {
        return eyeColorOrdinal;
    }

    public String getEmail(int ordinal) {
        return email;
    }

    public boolean isEmailEqual(int ordinal, String testValue) {
        if(testValue == null)
            return email == null;
        return testValue.equals(email);
    }

    public int getEmailOrdinal(int ordinal) {
        return emailOrdinal;
    }

    public String getPhoneNumber(int ordinal) {
        return phoneNumber;
    }

    public boolean isPhoneNumberEqual(int ordinal, String testValue) {
        if(testValue == null)
            return phoneNumber == null;
        return testValue.equals(phoneNumber);
    }

    public int getPhoneNumberOrdinal(int ordinal) {
        return phoneNumberOrdinal;
    }

    public String getAddress(int ordinal) {
        return address;
    }

    public boolean isAddressEqual(int ordinal, String testValue) {
        if(testValue == null)
            return address == null;
        return testValue.equals(address);
    }

    public int getAddressOrdinal(int ordinal) {
        return addressOrdinal;
    }

    public String getInstagramHandle(int ordinal) {
        return instagramHandle;
    }

    public boolean isInstagramHandleEqual(int ordinal, String testValue) {
        if(testValue == null)
            return instagramHandle == null;
        return testValue.equals(instagramHandle);
    }

    public int getInstagramHandleOrdinal(int ordinal) {
        return instagramHandleOrdinal;
    }

    public String getTwitterHandle(int ordinal) {
        return twitterHandle;
    }

    public boolean isTwitterHandleEqual(int ordinal, String testValue) {
        if(testValue == null)
            return twitterHandle == null;
        return testValue.equals(twitterHandle);
    }

    public int getTwitterHandleOrdinal(int ordinal) {
        return twitterHandleOrdinal;
    }

    public String getFacebookPage(int ordinal) {
        return facebookPage;
    }

    public boolean isFacebookPageEqual(int ordinal, String testValue) {
        if(testValue == null)
            return facebookPage == null;
        return testValue.equals(facebookPage);
    }

    public int getFacebookPageOrdinal(int ordinal) {
        return facebookPageOrdinal;
    }

    public boolean getCanSing(int ordinal) {
        if(canSing == null)
            return false;
        return canSing.booleanValue();
    }

    public Boolean getCanSingBoxed(int ordinal) {
        return canSing;
    }

    public boolean getCanDance(int ordinal) {
        if(canDance == null)
            return false;
        return canDance.booleanValue();
    }

    public Boolean getCanDanceBoxed(int ordinal) {
        return canDance;
    }

    public boolean getCanAct(int ordinal) {
        if(canAct == null)
            return false;
        return canAct.booleanValue();
    }

    public Boolean getCanActBoxed(int ordinal) {
        return canAct;
    }

    public boolean getCanDirect(int ordinal) {
        if(canDirect == null)
            return false;
        return canDirect.booleanValue();
    }

    public Boolean getCanDirectBoxed(int ordinal) {
        return canDirect;
    }

    public boolean getCanWrite(int ordinal) {
        if(canWrite == null)
            return false;
        return canWrite.booleanValue();
    }

    public Boolean getCanWriteBoxed(int ordinal) {
        return canWrite;
    }

    public String getFavoriteGenre(int ordinal) {
        return favoriteGenre;
    }

    public boolean isFavoriteGenreEqual(int ordinal, String testValue) {
        if(testValue == null)
            return favoriteGenre == null;
        return testValue.equals(favoriteGenre);
    }

    public int getFavoriteGenreOrdinal(int ordinal) {
        return favoriteGenreOrdinal;
    }

    public String getFavoriteDirector(int ordinal) {
        return favoriteDirector;
    }

    public boolean isFavoriteDirectorEqual(int ordinal, String testValue) {
        if(testValue == null)
            return favoriteDirector == null;
        return testValue.equals(favoriteDirector);
    }

    public int getFavoriteDirectorOrdinal(int ordinal) {
        return favoriteDirectorOrdinal;
    }

    public String getFavoriteActor(int ordinal) {
        return favoriteActor;
    }

    public boolean isFavoriteActorEqual(int ordinal, String testValue) {
        if(testValue == null)
            return favoriteActor == null;
        return testValue.equals(favoriteActor);
    }

    public int getFavoriteActorOrdinal(int ordinal) {
        return favoriteActorOrdinal;
    }

    public boolean getIsMarried(int ordinal) {
        if(isMarried == null)
            return false;
        return isMarried.booleanValue();
    }

    public Boolean getIsMarriedBoxed(int ordinal) {
        return isMarried;
    }

    public int getNumberOfChildren(int ordinal) {
        if(numberOfChildren == null)
            return Integer.MIN_VALUE;
        return numberOfChildren.intValue();
    }

    public Integer getNumberOfChildrenBoxed(int ordinal) {
        return numberOfChildren;
    }

    public String getAlmaMater(int ordinal) {
        return almaMater;
    }

    public boolean isAlmaMaterEqual(int ordinal, String testValue) {
        if(testValue == null)
            return almaMater == null;
        return testValue.equals(almaMater);
    }

    public int getAlmaMaterOrdinal(int ordinal) {
        return almaMaterOrdinal;
    }

    public boolean getHasWonOscar(int ordinal) {
        if(hasWonOscar == null)
            return false;
        return hasWonOscar.booleanValue();
    }

    public Boolean getHasWonOscarBoxed(int ordinal) {
        return hasWonOscar;
    }

    public boolean getHasWonEmmy(int ordinal) {
        if(hasWonEmmy == null)
            return false;
        return hasWonEmmy.booleanValue();
    }

    public Boolean getHasWonEmmyBoxed(int ordinal) {
        return hasWonEmmy;
    }

    public boolean getHasWonGoldenGlobe(int ordinal) {
        if(hasWonGoldenGlobe == null)
            return false;
        return hasWonGoldenGlobe.booleanValue();
    }

    public Boolean getHasWonGoldenGlobeBoxed(int ordinal) {
        return hasWonGoldenGlobe;
    }

    public double getNetWorth(int ordinal) {
        if(netWorth == null)
            return Double.NaN;
        return netWorth.doubleValue();
    }

    public Double getNetWorthBoxed(int ordinal) {
        return netWorth;
    }

    public double getAnnualIncome(int ordinal) {
        if(annualIncome == null)
            return Double.NaN;
        return annualIncome.doubleValue();
    }

    public Double getAnnualIncomeBoxed(int ordinal) {
        return annualIncome;
    }

    public boolean getIsAvailableForNextProject(int ordinal) {
        if(isAvailableForNextProject == null)
            return false;
        return isAvailableForNextProject.booleanValue();
    }

    public Boolean getIsAvailableForNextProjectBoxed(int ordinal) {
        return isAvailableForNextProject;
    }

    public String getCurrentProject(int ordinal) {
        return currentProject;
    }

    public boolean isCurrentProjectEqual(int ordinal, String testValue) {
        if(testValue == null)
            return currentProject == null;
        return testValue.equals(currentProject);
    }

    public int getCurrentProjectOrdinal(int ordinal) {
        return currentProjectOrdinal;
    }

    public String getAgentName(int ordinal) {
        return agentName;
    }

    public boolean isAgentNameEqual(int ordinal, String testValue) {
        if(testValue == null)
            return agentName == null;
        return testValue.equals(agentName);
    }

    public int getAgentNameOrdinal(int ordinal) {
        return agentNameOrdinal;
    }

    public String getAgentContact(int ordinal) {
        return agentContact;
    }

    public boolean isAgentContactEqual(int ordinal, String testValue) {
        if(testValue == null)
            return agentContact == null;
        return testValue.equals(agentContact);
    }

    public int getAgentContactOrdinal(int ordinal) {
        return agentContactOrdinal;
    }

    @Override
    public HollowObjectSchema getSchema() {
        return typeAPI.getTypeDataAccess().getSchema();
    }

    @Override
    public HollowObjectTypeDataAccess getTypeDataAccess() {
        return typeAPI.getTypeDataAccess();
    }

    public ActorTypeAPI getTypeAPI() {
        return typeAPI;
    }

    public void updateTypeAPI(HollowTypeAPI typeAPI) {
        this.typeAPI = (ActorTypeAPI) typeAPI;
    }

}