package org.example;

public class LabExercise4 {
    final static int CAPACITY = 500;

    public static void main(String[] args) {
        Mug.setCapacity(CAPACITY);
        Mug myMug = new Mug();
        Mug yourMug = new Mug("Green tea", 300);

        myMug.display();
        yourMug.display();

        myMug.refill(100);
        yourMug.refill(200);

        myMug.display();
        yourMug.display();

        myMug.spill();
        yourMug.drink(400);

        myMug.display();
        yourMug.display();
    }
}