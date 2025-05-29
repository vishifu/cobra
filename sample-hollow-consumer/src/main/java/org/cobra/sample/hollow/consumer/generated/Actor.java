package org.cobra.sample.hollow.consumer.generated;

import com.netflix.hollow.core.type.*;

import com.netflix.hollow.api.objects.HollowObject;
import com.netflix.hollow.tools.stringifier.HollowRecordStringifier;
import org.cobra.sample.hollow.consumer.generated.core.ActorDelegate;
import org.cobra.sample.hollow.consumer.generated.core.ActorTypeAPI;


@SuppressWarnings("all")
public class Actor extends HollowObject {

    public Actor(ActorDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public int getId() {
        return delegate().getId(ordinal);
    }



    public String getFirstName() {
        return delegate().getFirstName(ordinal);
    }

    public boolean isFirstNameEqual(String testValue) {
        return delegate().isFirstNameEqual(ordinal, testValue);
    }

    public HString getFirstNameHollowReference() {
        int refOrdinal = delegate().getFirstNameOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getLastName() {
        return delegate().getLastName(ordinal);
    }

    public boolean isLastNameEqual(String testValue) {
        return delegate().isLastNameEqual(ordinal, testValue);
    }

    public HString getLastNameHollowReference() {
        int refOrdinal = delegate().getLastNameOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public int getAge() {
        return delegate().getAge(ordinal);
    }



    public String getGender() {
        return delegate().getGender(ordinal);
    }

    public boolean isGenderEqual(String testValue) {
        return delegate().isGenderEqual(ordinal, testValue);
    }

    public HString getGenderHollowReference() {
        int refOrdinal = delegate().getGenderOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getNationality() {
        return delegate().getNationality(ordinal);
    }

    public boolean isNationalityEqual(String testValue) {
        return delegate().isNationalityEqual(ordinal, testValue);
    }

    public HString getNationalityHollowReference() {
        int refOrdinal = delegate().getNationalityOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public int getYearsOfExperience() {
        return delegate().getYearsOfExperience(ordinal);
    }



    public int getNumberOfMovies() {
        return delegate().getNumberOfMovies(ordinal);
    }



    public int getNumberOfAwards() {
        return delegate().getNumberOfAwards(ordinal);
    }



    public String getDebutMovie() {
        return delegate().getDebutMovie(ordinal);
    }

    public boolean isDebutMovieEqual(String testValue) {
        return delegate().isDebutMovieEqual(ordinal, testValue);
    }

    public HString getDebutMovieHollowReference() {
        int refOrdinal = delegate().getDebutMovieOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getMostFamousRole() {
        return delegate().getMostFamousRole(ordinal);
    }

    public boolean isMostFamousRoleEqual(String testValue) {
        return delegate().isMostFamousRoleEqual(ordinal, testValue);
    }

    public HString getMostFamousRoleHollowReference() {
        int refOrdinal = delegate().getMostFamousRoleOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public double getHeight() {
        return delegate().getHeight(ordinal);
    }



    public double getWeight() {
        return delegate().getWeight(ordinal);
    }



    public String getHairColor() {
        return delegate().getHairColor(ordinal);
    }

    public boolean isHairColorEqual(String testValue) {
        return delegate().isHairColorEqual(ordinal, testValue);
    }

    public HString getHairColorHollowReference() {
        int refOrdinal = delegate().getHairColorOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getEyeColor() {
        return delegate().getEyeColor(ordinal);
    }

    public boolean isEyeColorEqual(String testValue) {
        return delegate().isEyeColorEqual(ordinal, testValue);
    }

    public HString getEyeColorHollowReference() {
        int refOrdinal = delegate().getEyeColorOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getEmail() {
        return delegate().getEmail(ordinal);
    }

    public boolean isEmailEqual(String testValue) {
        return delegate().isEmailEqual(ordinal, testValue);
    }

    public HString getEmailHollowReference() {
        int refOrdinal = delegate().getEmailOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getPhoneNumber() {
        return delegate().getPhoneNumber(ordinal);
    }

    public boolean isPhoneNumberEqual(String testValue) {
        return delegate().isPhoneNumberEqual(ordinal, testValue);
    }

    public HString getPhoneNumberHollowReference() {
        int refOrdinal = delegate().getPhoneNumberOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getAddress() {
        return delegate().getAddress(ordinal);
    }

    public boolean isAddressEqual(String testValue) {
        return delegate().isAddressEqual(ordinal, testValue);
    }

    public HString getAddressHollowReference() {
        int refOrdinal = delegate().getAddressOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getInstagramHandle() {
        return delegate().getInstagramHandle(ordinal);
    }

    public boolean isInstagramHandleEqual(String testValue) {
        return delegate().isInstagramHandleEqual(ordinal, testValue);
    }

    public HString getInstagramHandleHollowReference() {
        int refOrdinal = delegate().getInstagramHandleOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getTwitterHandle() {
        return delegate().getTwitterHandle(ordinal);
    }

    public boolean isTwitterHandleEqual(String testValue) {
        return delegate().isTwitterHandleEqual(ordinal, testValue);
    }

    public HString getTwitterHandleHollowReference() {
        int refOrdinal = delegate().getTwitterHandleOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getFacebookPage() {
        return delegate().getFacebookPage(ordinal);
    }

    public boolean isFacebookPageEqual(String testValue) {
        return delegate().isFacebookPageEqual(ordinal, testValue);
    }

    public HString getFacebookPageHollowReference() {
        int refOrdinal = delegate().getFacebookPageOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public boolean getCanSing() {
        return delegate().getCanSing(ordinal);
    }



    public boolean getCanDance() {
        return delegate().getCanDance(ordinal);
    }



    public boolean getCanAct() {
        return delegate().getCanAct(ordinal);
    }



    public boolean getCanDirect() {
        return delegate().getCanDirect(ordinal);
    }



    public boolean getCanWrite() {
        return delegate().getCanWrite(ordinal);
    }



    public String getFavoriteGenre() {
        return delegate().getFavoriteGenre(ordinal);
    }

    public boolean isFavoriteGenreEqual(String testValue) {
        return delegate().isFavoriteGenreEqual(ordinal, testValue);
    }

    public HString getFavoriteGenreHollowReference() {
        int refOrdinal = delegate().getFavoriteGenreOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getFavoriteDirector() {
        return delegate().getFavoriteDirector(ordinal);
    }

    public boolean isFavoriteDirectorEqual(String testValue) {
        return delegate().isFavoriteDirectorEqual(ordinal, testValue);
    }

    public HString getFavoriteDirectorHollowReference() {
        int refOrdinal = delegate().getFavoriteDirectorOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getFavoriteActor() {
        return delegate().getFavoriteActor(ordinal);
    }

    public boolean isFavoriteActorEqual(String testValue) {
        return delegate().isFavoriteActorEqual(ordinal, testValue);
    }

    public HString getFavoriteActorHollowReference() {
        int refOrdinal = delegate().getFavoriteActorOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public boolean isMarried() {
        return delegate().getIsMarried(ordinal);
    }



    public int getNumberOfChildren() {
        return delegate().getNumberOfChildren(ordinal);
    }



    public String getAlmaMater() {
        return delegate().getAlmaMater(ordinal);
    }

    public boolean isAlmaMaterEqual(String testValue) {
        return delegate().isAlmaMaterEqual(ordinal, testValue);
    }

    public HString getAlmaMaterHollowReference() {
        int refOrdinal = delegate().getAlmaMaterOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public boolean hasWonOscar() {
        return delegate().getHasWonOscar(ordinal);
    }



    public boolean hasWonEmmy() {
        return delegate().getHasWonEmmy(ordinal);
    }



    public boolean hasWonGoldenGlobe() {
        return delegate().getHasWonGoldenGlobe(ordinal);
    }



    public double getNetWorth() {
        return delegate().getNetWorth(ordinal);
    }



    public double getAnnualIncome() {
        return delegate().getAnnualIncome(ordinal);
    }



    public boolean isAvailableForNextProject() {
        return delegate().getIsAvailableForNextProject(ordinal);
    }



    public String getCurrentProject() {
        return delegate().getCurrentProject(ordinal);
    }

    public boolean isCurrentProjectEqual(String testValue) {
        return delegate().isCurrentProjectEqual(ordinal, testValue);
    }

    public HString getCurrentProjectHollowReference() {
        int refOrdinal = delegate().getCurrentProjectOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getAgentName() {
        return delegate().getAgentName(ordinal);
    }

    public boolean isAgentNameEqual(String testValue) {
        return delegate().isAgentNameEqual(ordinal, testValue);
    }

    public HString getAgentNameHollowReference() {
        int refOrdinal = delegate().getAgentNameOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public String getAgentContact() {
        return delegate().getAgentContact(ordinal);
    }

    public boolean isAgentContactEqual(String testValue) {
        return delegate().isAgentContactEqual(ordinal, testValue);
    }

    public HString getAgentContactHollowReference() {
        int refOrdinal = delegate().getAgentContactOrdinal(ordinal);
        if(refOrdinal == -1)
            return null;
        return  api().getHString(refOrdinal);
    }

    public MovieAPI api() {
        return typeApi().getAPI();
    }

    public ActorTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected ActorDelegate delegate() {
        return (ActorDelegate)delegate;
    }

    public String toString() {
        return new HollowRecordStringifier().stringify(this);
    }

}