package TikTakToeTest;
import Tiktaktoe.TikTakToe;
import Tiktaktoe.UserQuestion;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TikTakToeTest {
    TikTakToe tikTakToe = new TikTakToe();
    UserQuestion userQuestion = new UserQuestion();
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
    void testGewinnErkennungDiagonale2(){
        String [][] testField = {
                {"x"," ","x"},
                {" ","x","o"},
                {"x","o","o"}
        };
        tikTakToe.setField(testField);
        tikTakToe.gewonnen(testField);
        assertTrue(tikTakToe.isGewonnen());

    }
    @Test
    void testUentschieden(){
        String [][] testField = {
                {"x","o","x"},
                {"x","x","o"},
                {"o","x","o"}
        };
        tikTakToe.setField(testField);
        tikTakToe.unentschieden(testField);
        assertFalse(tikTakToe.isGewonnen());
        assertTrue(tikTakToe.isUnentschieden());

    }
}
