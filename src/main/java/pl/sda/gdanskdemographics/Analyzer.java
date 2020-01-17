package pl.sda.gdanskdemographics;

public class Analyzer {

    private District[] allDistricts;

    public Analyzer(District[] allDistricts) {
        this.allDistricts = allDistricts;
    }

    public void findByName(String districtName) {
        for (District singleDistrict : allDistricts) {
            if (singleDistrict.getDistrictName().equals(districtName)){
                System.out.println(singleDistrict);
            }
        }
    }
}
