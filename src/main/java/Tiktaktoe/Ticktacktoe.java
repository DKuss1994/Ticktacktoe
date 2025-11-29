package Tiktaktoe;

import java.util.Objects;

public class Ticktacktoe {
    private String[][] field = new String[3][3];
    private boolean spieler1 = true;//true is "x" //false is "o"
    private boolean unentschieden = false;
    private boolean gewonnen = false;

    public void werHatGewooen(){
        String spieler;
        if(this.spieler1){
            spieler = "o";
            System.out.println("Spieler "+spieler+" hat gewonnen");
        }
        else{
            spieler = "x";
            System.out.println("Spieler "+spieler+" hat gewonnen");

        }
    }

    public String aktuellerSpieler() {
        String spieler;
        if (this.spieler1) {
            spieler = "x";
        } else {
            spieler = "o";
        }
        return spieler;
    }

    public void spielerZug(int zeile, int spalte, String[][] field) {
        String spieler = aktuellerSpieler();
        if (field[zeile][spalte].equals(" ")) {
            field[zeile][spalte] = spieler;
            tauschSpieler();
        } else {
            System.out.println("Feld ist belegt!");
        }


    }

    public void gewonnen(String[][] field) {
        this.gewonnen = false;
        String[] spieler = {"x", "o"};
        for (String player : spieler) {
            for (int i = 0; i < field.length; i++) {
                //Zeile prüfen
                if (Objects.equals(player, field[i][0]) &&
                        Objects.equals(player, field[i][1]) &&
                        Objects.equals(player, field[i][2])) {
                    this.gewonnen = true;
                    return;
                }
            }
            //Spalte prüfen
            for (int i = 0; i < field.length; i++) {
                if (Objects.equals(player, field[0][i]) &&
                        Objects.equals(player, field[1][i]) &&
                        Objects.equals(player, field[2][i])) {
                    this.gewonnen = true;
                    return;
                }
            }
            if (Objects.equals(player, field[0][0]) &&
                    Objects.equals(player, field[1][1]) &&
                    Objects.equals(player, field[2][2])||
                    Objects.equals(player, field[0][2]) &&
                    Objects.equals(player, field[1][1]) &&
                    Objects.equals(player, field[2][0])) {
                this.gewonnen = true;
                return;
            }
        }

        }


    public void unentschieden(String[][] field) {
        boolean voll = true;
        for (int i = 0; i < field.length; i++) {
            for (int i1 = 0; i1 < field.length; i1++) {
                if (field[i][i1] == null || field[i][i1].trim().isEmpty()) {
                    voll = false;
                    break;
                }
            }
            if (!voll) {
                break;
            }
        }
        if (voll) {
            this.unentschieden = true;
            System.out.println("Das Spiel ist unentschieden.");
        } else {
            this.unentschieden = false;
        }

    }

    public void tauschSpieler() {
        if (spieler1) {
            spieler1 = false;
        } else {
            spieler1 = true;
        }
    }


    public void creatField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int i1 = 0; i1 < field.length; i1++) {
                field[i][i1] = " ";

            }

        }
        this.field = field;
    }

    public void printField(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int i1 = 0; i1 < field[i].length; i1++) {
                System.out.print(field[i][i1]);
                if (i1 < field[i].length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < field.length - 1) {
                System.out.println("-----");
            }
        }
    }

    public String[][] getField() {
        return field;
    }

    public void setField(String[][] field) {
        this.field = field;
    }

    public boolean isUnentschieden() {
        return unentschieden;
    }

    public boolean isGewonnen() {
        return gewonnen;
    }
}
