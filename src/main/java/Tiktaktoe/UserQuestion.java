package Tiktaktoe;

import java.util.Scanner;

public class UserQuestion {
    private int spalte;
    private int zeile;
    private boolean userEingabe;
    Scanner sc = new Scanner(System.in);

    public void userEingabeSpalte(String spieler){
        System.out.print(spieler+" Gib eine Spalte ein(Von 1-3): ");
        byte spalte = sc.nextByte();
        setUserEingabe(spalte);

        this.spalte = spalte-1;
    }
    public void userEingabeZeile(String spieler){
        System.out.print(spieler+" Gib eine Zeile ein(Von 1-3): ");
        byte zeile = sc.nextByte();
        setUserEingabe(zeile);
        this.zeile = zeile-1;
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
