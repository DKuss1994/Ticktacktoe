package Tiktaktoe;

public class Start {
    public void start(){
        TikTakToe tikTakToe = new TikTakToe();
        tikTakToe.creatField(tikTakToe.getField());
        UserQuestion userQuestion = new UserQuestion();
        while(true){
            tikTakToe.printField(tikTakToe.getField());
            userQuestion.userEingabeZeile(tikTakToe.aktuellerSpieler());
            if(!userQuestion.isUserEingabe()){
                System.out.println("Falsche Eingabe");
                continue;
            }
            userQuestion.userEingabeSpalte(tikTakToe.aktuellerSpieler());
            if(!userQuestion.isUserEingabe()){
                System.out.println("Falsche Eingabe");
                continue;
            }
            tikTakToe.spielerZug(userQuestion.getZeile(),userQuestion.getSpalte(), tikTakToe.getField());
            tikTakToe.gewonnen(tikTakToe.getField());
            if (tikTakToe.isGewonnen()){
                tikTakToe.printField(tikTakToe.getField());
                tikTakToe.werHatGewooen();
                break;
            }
            tikTakToe.unentschieden(tikTakToe.getField());
            if (tikTakToe.isUnentschieden()){
                tikTakToe.printField(tikTakToe.getField());
                break;
            }

            }


        }
    }

