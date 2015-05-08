package com.company;

/**
 * Created by matthewhughes on 4/29/15.
 */
public class Village {


    // Inventory
    public static int gold = 300;
    public static int food = 1000;
    public static int wood = 1000;
    public static int iron = 500;
    public static int faith = 100;
    public static int people = 10;

    // Infrastructure

    public static int banks = 1;
    public static int farms = 1;
    public static int forestries = 1;
    public static int mines = 1;
    public static int cathedrals = 0;
    public static int houses = 2;

    public static int turn = 1;

    public static void PrintWelcomeMessage(){
        for(int i = 0; i < 3; i++) {
            System.out.println("#########################");
        }
        System.out.println("Welcome to Slim City.");
        System.out.println("Your goal? To build the wealthiest, fictional city in the world");
        System.out.println("You have 200 turns to do that.");
        System.out.print("Good luck!");
        System.out.println("To get help, press 'h' at any time");
        for(int i = 0; i < 3; i++) {
            System.out.println("#########################");
        }
    }

    public static void PrintHelp(){
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("Press J To View Stats");
        System.out.println("Press N To Move To The Next Turn");
        System.out.println("Press L To Load Game");
        System.out.println("Press S To Save Game");
        System.out.println("Press Q To Add Bank");
        System.out.println("Press Y To Build Mine");
        System.out.println("Press E To Build Farm");
        System.out.println("Press R To Build Forestry");
        System.out.println("Press W To Build Cathedral");
        System.out.println("Press T To Build House");
        System.out.println("Press Z To Exit Game");
        System.out.println("Press H To View Help");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
    }

    public static void PrintStats(){
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("In your inventory, you currently have:");
        System.out.println("Gold: " + gold);
        System.out.println("Food: " + food);
        System.out.println("Wood: " + wood);
        System.out.println("Iron: " + iron);
        System.out.println("Faith :" + faith);
        System.out.println("Your village has the following buildings:");
        System.out.println("Banks: " + banks);
        System.out.println("Farms: " + farms);
        System.out.println("Forestries: " + forestries);
        System.out.println("Mines :" + mines);
        System.out.println("Cathedrals :" + cathedrals);
        System.out.println("Houses: " + houses);
        System.out.println("Your city has a population of " + people + ".");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("In your enemy's inventory, there is:");
        System.out.println("Gold: " + EnemyVillage.gold);
        System.out.println("Food: " + EnemyVillage.food);
        System.out.println("Wood: " + EnemyVillage.wood);
        System.out.println("Iron: " + EnemyVillage.iron);
        System.out.println("Faith :" + EnemyVillage.faith);
        System.out.println("Your enemy's village has the following buildings:");
        System.out.println("Banks: " + EnemyVillage.banks);
        System.out.println("Farms: " + EnemyVillage.farms);
        System.out.println("Forestries: " + EnemyVillage.forestries);
        System.out.println("Mines :" + EnemyVillage.mines);
        System.out.println("Cathedrals :" + EnemyVillage.cathedrals);
        System.out.println("Houses: " + EnemyVillage.houses);
        System.out.println("Your enemy's village has a population of " + EnemyVillage.people + ".");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
    }

    public static void nextTurn(){
        increaseStats();
        incrementTurn();
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("############################################");
        System.out.println("Welcome to turn " + turn);
        if(turn == 200){
            System.out.println("Game Over");
            System.out.println("At end of game, your village is as follows");
            PrintStats();
        }

    }

    public static void incrementTurn() {
        turn = turn + 1;
    }

    public static void increaseStats(){
        gold = gold + 20;
        food = food + 20;
        wood = wood + 20;
        iron = iron + 20;
        faith = faith + 20;

        gold = gold + (banks * 50);
        food = food + (farms * 30);
        wood = wood + (forestries * 20);
        iron = iron + (mines * 20);
        faith = faith + (cathedrals * 100);
        people = houses * 5;
    }



    public static void addBank(){
        if(gold >= 100 && wood >= 400 && iron >= 30) {
            banks = banks + 1;
            gold = gold - 100;
            wood = wood - 400;
            iron = iron - 30;
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Bank built");
            System.out.println("Total banks are now: " + banks);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");

        } else {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Insufficient Resources To Build This Bank");
            System.out.println("You need 100 gold, you have : " + gold);
            System.out.println("You need 400 wood, you have : " + wood);
            System.out.println("You need 30 iron, you have :" + iron);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }
        }

    public static void addFarm(){
        if(gold >= 10 && wood >= 200) {
            farms = farms + 1;
            gold = gold - 10;
            wood = wood - 200;
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Farm built");
            System.out.println("Total farms are now: " + banks);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");

        } else {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Insufficient Resources");
            System.out.println("You need 10 gold, you have : " + gold);
            System.out.println("You need 200 wood, you have : " + wood);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }
    }
    public static void addForestry(){
        if(gold >= 20 && wood >= 300) {
            forestries = forestries + 1;
            gold = gold - 20;
            wood = wood - 300;
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Forestry built");
            System.out.println("Total forestries are now: " + forestries);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");

        } else {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Insufficient Resources");
            System.out.println("You need 20 gold, you have : " + gold);
            System.out.println("You need 300 wood, you have : " + wood);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }
    }

    public static void addMine(){
        if(gold >= 50 && wood >= 500) {
            mines = mines + 1;
            gold = gold - 50;
            wood = wood - 500;
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Mine built");
            System.out.println("Total mines are now: " + mines);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");

        } else {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Insufficient Resources");
            System.out.println("You need 50 gold, you have : " + gold);
            System.out.println("You need 500 wood, you have : " + wood);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }
    }
    public static void addCathedral(){
        if(gold >= 500 && faith >= 500) {
            cathedrals = cathedrals + 1;
            gold = gold - 500;
            faith = faith - 500;
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Cathedral built");
            System.out.println("Total cathedrals are now: " + cathedrals);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");

        } else {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Insufficient Resources");
            System.out.println("You need 500 gold, you have : " + gold);
            System.out.println("You need 500 faith, you have : " + wood);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }
    }
    public static void addHouse(){
        if(gold >= 10 && faith >= 200) {
            houses = houses + 1;
            gold = gold - 10;
            wood = wood - 200;
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("House built");
            System.out.println("Total houses are now: " + cathedrals);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");

        } else {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Insufficient Resources");
            System.out.println("You need 10 gold, you have : " + gold);
            System.out.println("You need 200 wood, you have : " + wood);
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }
    }

    }