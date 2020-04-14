package controller;

import data.Flower;
import data.Plant;
import data.Tree;

public class PlantsApp {

    public static void main(String[] args) {

        Plant tree = new Tree("Baobab", 100, 1);
        Plant flower = new Flower("Tulip", 0, 1);

        Plant[] plants = {tree,flower};

        growPlantsForNumberOfYears(plants, 3);

    }

    public static void growPlantsForNumberOfYears(Plant[] plants, int numberOfYears){
        for (int i = 0; i<numberOfYears; i++){
            for (Plant plant:plants) {
                System.out.println();
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();
                System.out.println("************************************");
            }
        }
    }

}
