package com.training.Feb19th_Day1.ProductCartTask;

public class Product {

    private String productName;
    private int prodID;

    private int price;

    public Product(String productName, int prodID, int price) {
        this.productName = productName;
        this.prodID = prodID;
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductNameName() {
        return productName;
    }
    public int getPrice() {
        return price;
    }
    public int getProdIDID() {
        return prodID;
    }
    @Override
    public String toString(){
        return productName +" "+ prodID +" "+ price;
    }
}
