package salesreport;

/**
 * Responsible only for printing the report data (Q.1.3).
 */
public class PrintProduct {

    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void printHeader() {
        System.out.println("\n\nPRODUCT SALES REPORT - 2026\n");
        System.out.println("*".repeat(50));
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSales() {
        System.out.println("AVERAGE PRODUCT SALES: " + Math.round(product.GetAverageProductSold()));
    }

    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
package Printproduct;

/**
 *
 * @author Student
 */
public class java {
    
}
