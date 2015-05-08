package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Village.PrintWelcomeMessage();

        while ( true ){
            try {
                int ascii = br.read();
                System.out.println(ascii);
                switch(ascii){
                    case 115:
                        SaveData.SaveGame();
                        break;
                    case 108:
                        SaveData.LoadGame();
                        break;
                    case 106:
                        Village.PrintStats();
                        break;
                    case 110:
                        Village.nextTurn();
                        EnemyVillage.levelUp();
                        break;
                    case 113:
                        Village.addBank();
                        break;
                    case 119:
                        Village.addCathedral();
                        break;
                    case 101:
                        Village.addFarm();
                        break;
                    case 114:
                        Village.addForestry();
                        break;
                    case 116:
                        Village.addHouse();
                        break;
                    case 121:
                        Village.addMine();
                        break;
                    case 104:
                        Village.PrintHelp();
                        break;
                    case 122:
                        System.out.println("############################################");
                        System.out.println("############################################");
                        System.out.println("############################################");
                        System.out.println("Exiting Now");
                        System.exit(0);
                        break;
                }
            } catch (IOException e){
                e.printStackTrace();
            }


        }

    }


}
