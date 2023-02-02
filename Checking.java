package Abroad_Program;

import java.util.Scanner;

public class Checking implements Conditions {
    Scanner scanner = new Scanner(System.in);
    private String visa;
    private String ban;
    private String fee;
    private int pay;
    public Checking() throws InterruptedException {

        String warning = "Warning!\n\nYou need to doing this three process ;\n" +
                "-- Visa situation;\n" +
                "-- Travel Ban situation\n" +
                "-- Abroad fee Situation\n\n";
//*****************************************************************
        String warning_2 = "Sorry! must be allowed this three " +
                "rules too for you are going to abroad.\n";

        while(true) {
            System.out.println(warning);

            System.out.println("Have you visa ? (yes or no)");
            visa = scanner.nextLine();

            System.out.println("Have you Travel ban? (yes or no)");
            ban = scanner.nextLine();

            System.out.println("Did you pay Abroad Fee? (yes or no)");
            fee = scanner.nextLine();
//*******************************************************************
            System.out.println("Checking Visa Sitution ...");
            Thread.sleep(3000);

            if(visaSituation()){
                System.out.println(warning_2+"\n");
                continue;
            }

            System.out.println("Checking Travel Ban...");
            Thread.sleep(3000);

            if(travelBan()){
                System.out.println(warning_2+"\n");
                continue;
            }

            System.out.println("Checking Abroad Fee...");
            Thread.sleep(3000);

            if(abroadFee()){
                System.out.println(warning_2+"\n");
                continue;
            }

            System.out.println("Your process checked succesfully." +
                                "You can go Abroad.Have a good journey!");
            break;
        }
    }
    //*************************
    @Override
    public boolean visaSituation() {
        if(visa.equals("no")){
            return true;
        }
        else{
            return false;
        }
    }
    //*************************
    @Override
    public boolean travelBan() {
        if(ban.equals("yes")){
            return true;
        }
        else{
            return false;
        }
    }
    //*************************
    @Override
    public boolean abroadFee() {
        if(fee.equals("no")){
            return true;
        }
        else{
            return false;
        }
    }

}
