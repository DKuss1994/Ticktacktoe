package Tiktaktoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserQuestion {
    private int spalte;
    private int zeile;
    private boolean userEingabe;
    Scanner sc = new Scanner(System.in);

    public void userEingabeZeile(String spieler) {

        while (true) {
            System.out.print(spieler +" Bitte Zeile von eins bis drei eingeben: ");

            try {
                byte wert = sc.nextByte();

                if (wert >= 1 && wert <= 3) {
                    this.zeile = wert-1;
                    return;
                } else {
                    System.out.println("Der Wert muss im Bereich eins bis drei liegen");
                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte eine gültige Zahl eingeben");
                sc.next();
            }
        }
    }
    public void userEingabeSpalte(String spieler) {

        while (true) {
            System.out.print(spieler+" Bitte Spalte von eins bis drei eingeben: ");

            try {
                byte wert = sc.nextByte();

                if (wert >= 1 && wert <= 3) {
                    this.spalte = wert-1;
                    return;
                } else {
                    System.out.println("Der Wert muss im Bereich eins bis drei liegen");
                }

            } catch (InputMismatchException e) {
                System.out.println("Bitte eine gültige Zahl eingeben");
                sc.next();
            }
        }
    }

    public void setUserEingabe(byte zeileSpalte) {

        if (zeileSpalte < 1 || zeileSpalte > 3) {
            this.userEingabe = false;
        } else {
            this.userEingabe = true;
        }
    }


    public boolean isUserEingabe() {
        return userEingabe;
    }

    public int getSpalte() {
        return spalte;
    }

    public int getZeile() {
        return zeile;
    }
}
