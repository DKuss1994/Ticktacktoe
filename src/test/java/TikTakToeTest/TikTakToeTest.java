package TikTakToeTest;
import Tiktaktoe.TikTakToe;
import Tiktaktoe.UserQuestion;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    @Test
    void questionTestTrue(){
        String spieler = "x";
        byte usereingabe = 1;
        userQuestion.setUserEingabe(usereingabe);
        assertTrue(userQuestion.isUserEingabe());
    }
    @Test
    void questionTestFalse(){
        String spieler = "x";
        byte usereingabe = 5;
        userQuestion.setUserEingabe(usereingabe);
        assertFalse(userQuestion.isUserEingabe());
    }
    @Test
    void questionTestChar(){
        String spieler = "x";
        char usereingabe = 'a';
        userQuestion.setUserEingabe(usereingabe);
        assertFalse(userQuestion.isUserEingabe()) ;
    }
}
