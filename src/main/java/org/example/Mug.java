package org.example;

public class Mug {
    private static int capacity;
    private String content;
    private int quantity;

    Mug() {
        setContent("Water");
        setQuantity(500);
    }

    Mug(String content, int quantity) {
        setContent(content);
        setQuantity(quantity);
    }

    public static int getCapacity() { return capacity; }
    public static void setCapacity(int capacity) {
        if (capacity > 0) Mug.capacity = capacity;
        else {
            System.out.println("Mug's capacity has to be positive.. This has been set to 300.");
            Mug.capacity = 300;
        }
    }

    public String getContent() { return content; }
    public void setContent(String content) {
        this.content = content;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            if (capacity >= quantity) this.quantity = quantity;
            else {
                System.out.printf("Quantity has to be equal to or less than the capacity %d. This has been set to %d.",
                        capacity, capacity);
                this.quantity = capacity;
            }
        } else {
            System.out.println("Quantity has to be zero or positive.. This has been set to 0.");
            this.quantity = 0;
        }
    }

    public void drink(int amount) {
        if (amount > 0) {
            if (quantity >= amount) {
                int remaining = quantity - amount;
                setQuantity(remaining);
            } else {
                System.out.printf("The amount to drink has to be equal to or less than the capacity %d. You drank it out.",
                        capacity);
                setQuantity(0);
            }
        } else {
            System.out.println("The amount to drink should be positive.. Did nothing.");
        }
    }

    public void refill(int amount) {
        if (amount > 0) {
            int margin = capacity - quantity;
            if (margin >= amount) {
                int newQuantity = quantity + amount;
                setQuantity(newQuantity);
            } else {
                System.out.println("The amount to refill plus current quantity exceeds the capacity.. This has been set to full.");
                setQuantity(capacity);
            }
        } else {
            System.out.println("The amount to drink should be positive.. Did nothing.");
        }
    }

    public void spill() {
        System.out.println("On no! You spilled the mug..");
        setQuantity(0);
    }

    public void display() {
        System.out.printf("Content: %10s  Quantity: %5d ml\n", content, quantity);
    }
 }
