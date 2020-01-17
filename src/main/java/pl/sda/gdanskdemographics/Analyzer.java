package pl.sda.gdanskdemographics;

public class Analyzer {

    private District[] allDistricts;

    public Analyzer(District[] allDistricts) {
        this.allDistricts = allDistricts;
    }

    public void findByName(String districtName) {
        for (District singleDistrict : allDistricts) {
            if (singleDistrict.getDistrictName().equals(districtName)) {
                System.out.println(singleDistrict);
            }
        }
    }

    public District findGreatestByGenderAndAge(String gender, int age) {
        District resultDistrict = allDistricts[0];
        for (District currentAnalysedDistrict : allDistricts) {
            if (currentAnalysedDistrict.getGender().equals(gender) &&
                    !currentAnalysedDistrict.getDistrictName().equals("GDAŃSK")) {
                if (age > 0 && age < 17) {
                    if (currentAnalysedDistrict.getAgeUnderEighteen() > resultDistrict.getAgeUnderEighteen()) {
                        resultDistrict = currentAnalysedDistrict;
                    }
                }
                if (age > 18 && age < 59) {
                    if (currentAnalysedDistrict.getAgeFromEighteenToFiftyNine() > resultDistrict.getAgeFromEighteenToFiftyNine()) {
                        resultDistrict = currentAnalysedDistrict;
                    }
                }
                if (age > 60 && age < 64) {
                    if (currentAnalysedDistrict.getAgeFromSixtyToSixtyFour() > resultDistrict.getAgeFromSixtyToSixtyFour()) {
                        resultDistrict = currentAnalysedDistrict;
                    }
                }
                if (age >= 65) {
                    if (currentAnalysedDistrict.getAgeOverSixtyFour() > resultDistrict.getAgeOverSixtyFour()) {
                        resultDistrict = currentAnalysedDistrict;
                    }
                }
            }
        }
        return resultDistrict;
    }
}
