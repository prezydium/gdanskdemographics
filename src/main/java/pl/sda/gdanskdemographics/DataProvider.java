package pl.sda.gdanskdemographics;

import java.io.IOException;

public class DataProvider {

    public static District[] loadDistricts() throws IOException {
        String loadedData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv");
        String[] rows = loadedData.split("\r\n");
        District[] districts = new District[rows.length - 1];
        //remove header by starting with one
        for (int i = 1; i < rows.length; i++) {
            String[] splitRow = rows[i].split(";");
            District singleDistrict = new District(
                    splitRow[0],
                    splitRow[1],
                    convertStringToInteger(splitRow[2]),
                    convertStringToInteger(splitRow[3]),
                    convertStringToInteger(splitRow[4]),
                    convertStringToInteger(splitRow[5])
            );
            //subtract one to start with first index of array
            districts[i - 1] = singleDistrict;
        }
        return districts;
    }

    private static Integer convertStringToInteger(String numberAsString){
        return Integer.valueOf(numberAsString.replaceAll(" ", ""));
    }
}
