package com.company;

import java.util.Random;

/**
 * Created by matthewhughes on 5/7/15.
 */
public class EnemyVillage {

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

    public static int counter = 0;

    public static void levelUp() {
        Random rand = new Random();

        int randomNum = rand.nextInt((30 - 1 + 1) + 1);
        if(counter <= 5) {
            if (gold >= 300 & wood >= 300 & iron >= 300) {
                if (randomNum >= 1 & randomNum <= 5) {
                    // Build House
                    if(gold >= 10 && wood >= 200) {
                        gold = gold - 10;
                        wood = wood - 200;
                        houses = houses + 1;
                    } else {
                        counter = counter + 1;
                        levelUp();
                    }
                } else if (randomNum >= 5 & randomNum <= 10) {
                    // Build Farm
                    if(gold >= 10 && wood >= 200) {
                        farms = farms + 1;
                        gold = gold - 10;
                        wood = wood - 200;
                    } else {
                        counter = counter + 1;
                        levelUp();
                    }
                } else if (randomNum >= 10 & randomNum <= 15) {
                    //build Forestry
                    if(gold >= 20 && wood >= 300) {
                        forestries = forestries + 1;
                        gold = gold - 20;
                        wood = wood - 300;
                    } else {
                        counter = counter + 1;
                        levelUp();
                    }

                } else if (randomNum >= 15 & randomNum <= 20) {
                    // build cathedral
                    if(gold >= 500 && faith >= 500) {
                        cathedrals = cathedrals + 1;
                        gold = gold - 500;
                        faith = faith - 500;
                    } else {
                        counter = counter + 1;
                        levelUp();
                    }
                } else if (randomNum >= 20 & randomNum <= 25) {
                    // Build Mine
                    if(gold >= 50 && wood >= 500) {
                        mines = mines + 1;
                        gold = gold - 50;
                        wood = wood - 500;
                    } else {
                        counter = counter + 1;
                        levelUp();
                    }
                } else if (randomNum >= 25 & randomNum <= 30) {
                    // Build Bank
                    if(gold >= 100 && wood >= 400 && iron >= 30) {
                        banks = banks + 1;
                        gold = gold - 100;
                        wood = wood - 400;
                        iron = iron - 30;
                    } else {
                        counter = counter + 1;
                        levelUp();
                    }
                }
            }
        } else {
            increaseStats();
        }
    }

    public static void increaseStats() {
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
}