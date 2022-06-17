package vendingmachineinventory;

public class VendingMachineInventory {

    public static void main(String[] args) {
        //variables
        Inventory item1 = new Inventory("Mountain Dew", 1.5, 25);
        Inventory item2 = new Inventory("water", 1, 15);
        Inventory item3 = new Inventory("Apple juice", 2, 20);
        //output
        System.out.println("Module 3 Competency by Kevin Bell");
        System.out.println("\nStarting inventory:");
        item1.display();
        item2.display();
        item3.display();
        //new delivery
        System.out.println("");
        item1.newStock();
        item2.newStock();
        item3.newStock();
        //updated inventory
        System.out.println("\nCurrent inventory:");
        item1.display();
        item2.display();
        item3.display();
    }
}