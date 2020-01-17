package pl.sda.gdanskdemographics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class AnalyzerTest {

    private District[] testDistricts;
    private Analyzer analyzer;

    @Before
    public void setUp() throws IOException {
        testDistricts = App.loadDistricts();
        assertNotNull(testDistricts);
        analyzer = new Analyzer(testDistricts);
    }

    @Test
    public void shouldFindBySpecificDataInNormalFile() {
        District result = analyzer.findGreatestByGenderAndAge("kobiety", 35);
        Assert.assertEquals("CHEŁM", result.getDistrictName());
        District result2 = analyzer.findGreatestByGenderAndAge("kobiety", 80);
        Assert.assertEquals("PRZYMORZE WIELKIE", result2.getDistrictName());
    }

    @Test
    public void shouldFindBySpecyficDataInMockedData() {
        analyzer = new Analyzer(new District[]{new District("test1", "kobiety", 1, 1, 3, 4),
                new District("test2", "kobiety", 1, 50, 2, 2),
                new District("test3", "kobiety", 1, 1, 3, 3)});
        District result = analyzer.findGreatestByGenderAndAge("kobiety", 35);
        assertEquals("test2", result.getDistrictName());

        District result2 = analyzer.findGreatestByGenderAndAge("kobiety", 6778);
        assertEquals("test1", result2.getDistrictName());
    }


}