package com.company;

import java.io.*;

/**
 * Created by matthewhughes on 5/8/15.
 */
public class SaveData {

    public static void SaveGame(){
        DataToSave d = new DataToSave();

        d.gold = Village.gold;
        d.food = Village.food;
        d.wood = Village.wood;
        d.iron = Village.iron;
        d.faith = Village.faith;
        d.people = Village.people;

        d.banks = Village.banks;
        d.farms = Village.farms;
        d.forestries = Village.forestries;
        d.mines = Village.mines;
        d.cathedrals = Village.cathedrals;
        d.houses = Village.houses;

        d.Enemygold = EnemyVillage.gold;
        d.Enemyfood = EnemyVillage.food;
        d.Enemywood = EnemyVillage.wood;
        d.Enemyiron = EnemyVillage.iron;
        d.Enemyfaith = EnemyVillage.faith;
        d.Enemypeople = EnemyVillage.people;

        d.Enemybanks = EnemyVillage.banks;
        d.Enemyfarms = EnemyVillage.farms;
        d.Enemyforestries = EnemyVillage.forestries;
        d.Enemymines = EnemyVillage.mines;
        d.Enemycathedrals = EnemyVillage.cathedrals;
        d.Enemyhouses = EnemyVillage.houses;

        try
        {
            FileOutputStream fileOut = new FileOutputStream("/tmp/save.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(d);
            out.close();
            fileOut.close();
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Game saved in /tmp/save.ser");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }catch(IOException i)
        {
            i.printStackTrace();
        }
    }

    public static void LoadGame(){
        DataToSave d;

        try
        {
            FileInputStream fileIn = new FileInputStream("/tmp/save.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            d = (DataToSave) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("Game Loaded Successfully");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
        }catch(IOException i)
        {
            i.printStackTrace();
            return;
        }catch(ClassNotFoundException c)
        {
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("DataToSave class not found");
            System.out.println("Something Went Wrong.");
            System.out.println("############################################");
            System.out.println("############################################");
            System.out.println("############################################");
            c.printStackTrace();
            return;
        }

        Village.gold = d.gold;
        Village.food = d.food;
        Village.wood =  d.wood;
        Village.iron = d.iron;
        Village.faith = d.faith;
        Village.people = d.people;

        Village.banks = d.banks;
        Village.farms = d.farms;
        Village.forestries = d.forestries;
        Village.mines = d.mines;
        Village.cathedrals = d.cathedrals;
        Village.houses = d.houses;

        EnemyVillage.gold  =  d.Enemygold;
        EnemyVillage.food  =  d.Enemyfood;
        EnemyVillage.wood = d.Enemywood;
        EnemyVillage.iron = d.Enemyiron;
        EnemyVillage.faith = d.Enemyfaith;
        EnemyVillage.people = d.Enemypeople;

        EnemyVillage.banks = d.Enemybanks;
        EnemyVillage.farms = d.Enemyfarms;
        EnemyVillage.forestries = d.Enemyforestries;
        EnemyVillage.mines = d.Enemymines;
        EnemyVillage.cathedrals = d.Enemycathedrals;
        EnemyVillage.houses = d.Enemyhouses;
    }
}
