package com.james;

/**
 * Created by jamesyburr on 5/24/16.
 */
public class Hawk extends Bird {
    public Hawk () {
        this.name = "Hawk";
    }

    @Override
    public void makeSound() {
        System.out.println("Cawwww!");
    }
}
