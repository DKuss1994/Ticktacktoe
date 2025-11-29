package Tiktaktoe;

public class Start {
    public void start(){
        Ticktacktoe ticktacktoe = new Ticktacktoe();
        ticktacktoe.creatField(ticktacktoe.getField());
        UserQuestion userQuestion = new UserQuestion();
        while(true){
            ticktacktoe.printField(ticktacktoe.getField());
            userQuestion.userEingabeZeile(ticktacktoe.aktuellerSpieler());
            if(!userQuestion.isUserEingabe()){
                System.out.println("Falsche Eingabe");
                continue;
            }
            userQuestion.userEingabeSpalte(ticktacktoe.aktuellerSpieler());
            if(!userQuestion.isUserEingabe()){
                System.out.println("Falsche Eingabe");
                continue;
            }
            ticktacktoe.spielerZug(userQuestion.getZeile(),userQuestion.getSpalte(), ticktacktoe.getField());
            ticktacktoe.gewonnen(ticktacktoe.getField());
            if (ticktacktoe.isGewonnen()){
                ticktacktoe.printField(ticktacktoe.getField());
                ticktacktoe.werHatGewooen();
                break;
            }
            ticktacktoe.unentschieden(ticktacktoe.getField());
            if (ticktacktoe.isUnentschieden()){
                ticktacktoe.printField(ticktacktoe.getField());
                break;
            }

            }


        }
    }

