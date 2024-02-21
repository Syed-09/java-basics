package com.training.Feb19th_Day1.ProductCartTask;

import java.util.ArrayList;

public class Cart {
    public ArrayList<Product> cartList;

    public Cart(ArrayList<Product> arrli) {
        this.cartList = arrli;
    }


    public void addProduct(Product prod){
        //cart = new ArrayList<Product>();
        cartList.add(prod);
    }

    public ArrayList getCart(){
        return cartList;
    }

    public static int cartSum(ArrayList<Product> arrli){
        int cartSum =0;
        for (Product prod: arrli){
            cartSum+=prod.getPrice();
        }
        return cartSum;
    }
}
