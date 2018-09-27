/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleapp;

import Business.Product;
import Business.Supplier;
import java.util.Scanner;

/**
 *
 * @author Kavita
 */
public class MainClass {

    public static void main(String args[]) {
        Product product;
        Supplier supplier;
        Scanner sc1 = new Scanner(System.in);
        int userInput = 1;
        String runAgain = "Y";

        System.out.println("Create Product");
        int availabilityNumber;
        float price;
        String name, supplierName;
        String description, supplierAddress;

        System.out.print("Enter product name:");
        name = sc1.nextLine();
        System.out.print("");

        System.out.print("Enter product price:");
        price = sc1.nextFloat();

        System.out.print("Enter availability number:");
        availabilityNumber = sc1.nextInt();
        sc1.nextLine();

        System.out.print("Enter description:");
        description = sc1.nextLine();
        System.out.print("");

        System.out.print("Enter supplier name:");
        supplierName = sc1.nextLine();
        System.out.print("");

        System.out.print("Enter supplier address:");
        supplierAddress = sc1.nextLine();
        System.out.print("");

        supplier = new Supplier(supplierName, supplierAddress);
        product = new Product(name, price, availabilityNumber, description, supplier);

        System.out.print("\nProduct created successfully!!\n\n");

        do {
            System.out.print("Select option:\n1. View\n2. Update\n");
            userInput = sc1.nextInt();

            if (userInput == 1) {
                System.out.println("Product name -- " + product.getName());
                System.out.println("Product price -- " + product.getPrice());
                System.out.println("Product availability number -- " + product.getAvailNum());
                System.out.println("Product description -- " + product.getDescription());
                System.out.println("Supplier name -- " + product.getSupplier().getSupplierName());
                System.out.println("Supplier address -- " + product.getSupplier().getSupplierAddress());

            } else if (userInput == 2) {

                System.out.print("Enter new product name:");
                sc1.nextLine();
                name = sc1.nextLine();
                
                
                System.out.print("Enter new product price:");
                price = sc1.nextFloat();

                System.out.print("Enter new availability number:");
                availabilityNumber = sc1.nextInt();
                System.out.print("");
                
                System.out.print("Enter new description:");
                sc1.nextLine();
                description = sc1.nextLine();
                System.out.print("");

                System.out.print("Enter new supplier name:");
                supplierName = sc1.nextLine();
                System.out.print("");

                System.out.print("Enter new supplier address:");
                supplierAddress = sc1.nextLine();
                System.out.print("");

                supplier = new Supplier(supplierName, supplierAddress);
                product = new Product(name, price, availabilityNumber, description, supplier);
            } else {
                System.out.println("Select a correct option");
            }
            System.out.println("\nEnter Y/y to coninue or enter any other key to cancel");

            runAgain = sc1.next();

        } while (runAgain.equalsIgnoreCase("y"));

    }

}
