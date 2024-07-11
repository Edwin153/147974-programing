/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.RestaurantOrderSystem;

/**
 *
 * @author irung
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FoodItem {
    String name;
    String description;
    double price;

    public FoodItem(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

class Menu {
    List<FoodItem> items;

    public Menu() {
        items = new ArrayList<>();
        // Add food items to the menu
        items.add(new FoodItem("Burger", "Juicy beef patty with cheese", 8.99));
        items.add(new FoodItem("Pizza", "Margherita pizza with fresh basil", 12.49));
        // Add more items...
    }

    public void displayMenu() {
        System.out.println("Menu:");
        for (FoodItem item : items) {
            System.out.printf("%s - %s ($%.2f)\n", item.name, item.description, item.price);
        }
    }
}

class Order {
    List<FoodItem> selectedItems;

    public Order() {
        selectedItems = new ArrayList<>();
    }

    public void addItem(FoodItem item) {
        selectedItems.add(item);
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (FoodItem item : selectedItems) {
            total += item.price;
        }
        return total;
    }
}

class Customer {
    String name;
    List<Order> orderHistory;

    public Customer(String name) {
        this.name = name;
        orderHistory = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orderHistory.add(order);
    }
}

public class RestaurantOrderSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String customerName = scanner.nextLine();
        Customer customer = new Customer(customerName);

        Menu menu = new Menu();
        menu.displayMenu();

        Order currentOrder = new Order();
        while (true) {
            System.out.print("Enter food item name (or 'done' to finish): ");
            String itemName = scanner.nextLine();
            if (itemName.equalsIgnoreCase("done")) {
                break;
            }
            // Find the selected item from the menu
            // Add it to the current order
        }

        double totalPrice = currentOrder.calculateTotalPrice();
        System.out.printf("Total price: $%.2f\n", totalPrice);

        customer.placeOrder(currentOrder);
        System.out.println("Order placed successfully! Thank you.");

        // You can expand this system by adding more features (e.g., payment processing).
    }
}
