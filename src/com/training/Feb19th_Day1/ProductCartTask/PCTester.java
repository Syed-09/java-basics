package com.training.Feb19th_Day1.ProductCartTask;

import java.util.ArrayList;

public class PCTester {
    public static void main(String[] args){
        ArrayList<Product> cart = new ArrayList<Product>();
        cart.add(new Product("Pen",1,10));
        cart.add(new Product("Bottle",2,20));
        cart.add(new Product("Jar",3,40));
        cart.add(new Product("Cookies",4,30));
        System.out.println(Cart.cartSum(cart));
        System.out.println(cart);
    }

}
