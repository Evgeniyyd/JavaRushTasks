package ru.javarush.java.core.level15.task04;

public class Product {
   String productName;
   int productID;

    public Product(int productID,String productName) {
        this.productID = productID;
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }
}
