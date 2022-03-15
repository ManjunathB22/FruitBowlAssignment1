package com.ultralesson.objectorientation;

import java.util.ArrayList;
import java.util.List;

public class Bowl {
    public List<Fruits> fruits;

    public Bowl(){

        fruits = new ArrayList<>();
    }

    public void addFruit(Fruits... fruit) {
        for (Fruits fruites : fruit) {
            fruits.add(fruites);
        }
    }

    public Bowl getAllApplesBowl() {
        Bowl appleBowl = new Bowl();
        for (Fruits fruit : fruits) {
            if (fruit instanceof Apple){
                appleBowl.addFruit(fruit);
            }
        }
        return appleBowl;
    }

    public Bowl getAllOrangesBowl() {
        Bowl orangeBowl = new Bowl();
        for (Fruits fruit : fruits) {
            if (fruit instanceof Apple){
                orangeBowl.addFruit(fruit);
            }
        }
        return orangeBowl;
    }

    public Bowl getAllGrapesBowls() {
        Bowl grapesBowl = new Bowl();
        for (Fruits fruit : fruits) {
            if (fruit instanceof Apple){
                grapesBowl.addFruit(fruit);
            }
        }
        return grapesBowl;
    }

    public Bowl getAllRedColorFruits(){
        Bowl redColorFruits = new Bowl();
        for(Fruits fruit : fruits){
         if (fruit.color().equalsIgnoreCase("Red")){
             redColorFruits.addFruit(fruit);
         }
        }
        return redColorFruits;
    }

    public Bowl getAllGreenColorFruits(){
        Bowl greenColorFruits = new Bowl();
        for(Fruits fruit : fruits){
            if (fruit.color().equalsIgnoreCase("Green")){
                greenColorFruits.addFruit(fruit);
            }
        }
        return greenColorFruits;
    }

    public Bowl getAllOrangeColorFruits(){
        Bowl orangeColorFruits = new Bowl();
        for(Fruits fruit : fruits){
            if (fruit.color().equalsIgnoreCase("Orange")){
                orangeColorFruits.addFruit(fruit);
            }
        }
        return orangeColorFruits;
    }

    public Bowl getAllMediumSizeFruits(){
        Bowl mediumSizeFruits = new Bowl();
        for (Fruits fruit: fruits){
            if (fruit.size().equalsIgnoreCase("Medium")){
            mediumSizeFruits.addFruit(fruit);
            }
        }
        return mediumSizeFruits;
    }

    public Bowl getAllSmallSizeFruits(){
        Bowl smallSizeFruits = new Bowl();
        for (Fruits fruit: fruits){
            if (fruit.size().equalsIgnoreCase("Small")) {
                smallSizeFruits.addFruit(fruit);
            }
        }
        return smallSizeFruits;
    }

    public Bowl getAllSourTypeFruits(){
        Bowl sourTasteFruits = new Bowl();
        for (Fruits fruit : fruits){
            if (fruit.type().equalsIgnoreCase("Sour")){
                sourTasteFruits.addFruit(fruit);
            }
        }
        return sourTasteFruits;
    }

    public Bowl getAllSweetTypeFruits(){
        Bowl sweetTasteFruits = new Bowl();
        for (Fruits fruit : fruits){
            if (fruit.type().equalsIgnoreCase("Sweet")){
                sweetTasteFruits.addFruit(fruit);
            }
        }
        return sweetTasteFruits;
    }

    public int getCount() {
        return fruits.size();
    }
}
