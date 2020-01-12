package pl.sda.gdanskdemographics;

public class District {

    private String districtName;
    private String gender;
    private Integer ageUnderEighteen;
    private Integer ageFromEighteenToFiftyNine;
    private Integer ageFromSixtyToSixtyFour;
    private Integer ageOverSixtyFour;

    public District(String districtName,
                    String gender,
                    Integer ageUnderEighteen,
                    Integer ageFromEighteenToFiftyNine,
                    Integer ageFromSixtyToSixtyFour,
                    Integer ageOverSixtyFour) {
        this.districtName = districtName;
        this.gender = gender;
        this.ageUnderEighteen = ageUnderEighteen;
        this.ageFromEighteenToFiftyNine = ageFromEighteenToFiftyNine;
        this.ageFromSixtyToSixtyFour = ageFromSixtyToSixtyFour;
        this.ageOverSixtyFour = ageOverSixtyFour;
    }
}
