/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author Student
 */
public class Java {
    
}
package salesreport;

import java.util.Scanner;

/**
 * Collects the sales input and prints the product sales report (Q.1.1).
 */
public class Main {

    private static final int MONTHS = 3;

    public static void main(String[] args) {
        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };
        int[][] monthlySales = new int[productNames.length][MONTHS];

        Scanner input = new Scanner(System.in);

        // Populate the 2D array: one row per product, one column per month
        for (int p = 0; p < productNames.length; p++) {
            for (int m = 0; m < MONTHS; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + productNames[p] + " mattress: ");
                monthlySales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        Product product = new Product(productNames, monthlySales);
        PrintProduct printer = new PrintProduct(product);

        printer.printHeader();
        printer.printTotalProductSales();
        printer.printAverageProductSales();
        printer.printMostPopularProduct();
    }
}