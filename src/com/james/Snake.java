package com.james;

/**
 * Created by jamesyburr on 5/24/16.
 */
public class Snake extends Reptile {
    public Snake() {
        this.name = "Snake";
    }

    @Override
    public void makeSound() {
        System.out.println("Ssssss...");
    }
}
