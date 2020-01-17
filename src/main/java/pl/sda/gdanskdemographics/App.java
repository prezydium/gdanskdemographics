package pl.sda.gdanskdemographics;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        District[] districts = DataProvider.loadDistricts();
        Analyzer analyzer = new Analyzer(districts);
        analyzer.findByName("RUDNIKI");


    }
}
