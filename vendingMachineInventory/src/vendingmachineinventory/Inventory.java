package vendingmachineinventory;

import java.util.Scanner;

public class Inventory {

    //variables
    Scanner computerKeyboardInput = new Scanner(System.in);
    private String name;
    private double price;
    private int quantity;

    public Inventory(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void display() {
        System.out.printf("Name: %s, price: $%.2f, Quantity: %d\n", this.name, this.price, this.quantity);
    }

    public void newStock() {
        int quantity;
        double price;
        System.out.printf("How many bottles of %s are you delivering? ", this.name);
        quantity = computerKeyboardInput.nextInt();
        computerKeyboardInput.nextLine();
        this.quantity += quantity;
        price = this.price * quantity;
        System.out.printf("Received $%.2f of %s\n", price, this.name);
    }
}
