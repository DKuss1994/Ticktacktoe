package TikTakToeTest;
import Tiktaktoe.TikTakToe;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TikTakToeTest {
    TikTakToe tikTakToe = new TikTakToe();
    @Test
    void testGewinnErkennungHorizontrale1(){
        String [][] testField = {
                {"x","x","x"},
                {" ","o","o"},
                {" ","o","o"}
        };
        tikTakToe.setField(testField);
        tikTakToe.gewonnen(testField);
        assertTrue(tikTakToe.isGewonnen());

    }
    @Test
    void testGewinnErkennungVertikale(){
        String [][] testField = {
                {"x"," ","x"},
                {"x"," ","o"},
                {"x","o","o"}
        };
        tikTakToe.setField(testField);
        tikTakToe.gewonnen(testField);
        assertTrue(tikTakToe.isGewonnen());

    }
    @Test
    void testGewinnErkennungDiagonale1(){
        String [][] testField = {
                {"x"," ","x"},
                {"o","x","o"},
                {" ","o","x"}
        };
        tikTakToe.setField(testField);
        tikTakToe.gewonnen(testField);
        assertTrue(tikTakToe.isGewonnen());

    }
    @Test
    void testGewinnErkennungHorizontrale3(){
        String [][] testField = {
                {"x"," ","x"},
                {" ","x","o"},
                {"x","o","o"}
        };
        tikTakToe.setField(testField);
        tikTakToe.gewonnen(testField);
        assertTrue(tikTakToe.isGewonnen());

    }
}
