package pl.sda.gdanskdemographics;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        District[] districts = loadDistricts();
    }

    private static District[] loadDistricts() throws IOException {
        String loadedData = FileLoaderUtil.readFileAsSingleStringByFilesReadString("data.csv");
        String[] rows = loadedData.split("\r\n");
        District[] districts = new District[rows.length - 1];

        for (int i = 1; i < rows.length; i++) {
            String[] splitRow = rows[i].split(";");
            District singleDistrict = new District(
                    splitRow[0],
                    splitRow[1],
                    Integer.valueOf(splitRow[2].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[3].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[4].replaceAll(" ", "")),
                    Integer.valueOf(splitRow[5].replaceAll(" ", ""))
            );
            districts[i - 1] = singleDistrict;
        }
        return districts;
    }
}
