/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IProduct;

/**
 *
 * @author Student
 */
public class ProductJava {
    
}
package salesreport;

/**
 * Holds the sales data for the top-performing products and
 * calculates the figures needed for the report.
 */
public class Product implements IProduct {

    // Single-dimensional array: product names
    private final String[] productNames;

    // Two-dimensional array: [product][month] = number of sales
    private final int[][] monthlySales;

    public Product(String[] productNames, int[][] monthlySales) {
        this.productNames = productNames;
        this.monthlySales = monthlySales;
    }

    /** Adds up the sales of one product across all months. */
    private int getProductTotal(int productIndex) {
        int total = 0;
        for (int sales : monthlySales[productIndex]) {
            total += sales;
        }
        return total;
    }

    /** Total number of products sold across all products and months. */
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < productNames.length; i++) {
            total += getProductTotal(i);
        }
        return total;
    }

    /** Average sales per product per month (total / number of entries). */
    @Override
    public double GetAverageProductSold() {
        int entries = productNames.length * monthlySales[0].length;
        return (double) GetTotalProductsSold() / entries;
    }

    /** Name and total of the product with the highest total sales. */
    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0;
        for (int i = 1; i < productNames.length; i++) {
            if (getProductTotal(i) > getProductTotal(bestIndex)) {
                bestIndex = i;
            }
        }
        return productNames[bestIndex] + " (" + getProductTotal(bestIndex) + ")";
    }
}