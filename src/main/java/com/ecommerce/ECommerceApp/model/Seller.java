package com.ecommerce.ECommerceApp.model;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


@Component

public class Seller{

    private List<Integer> productIDList = new ArrayList<>();
    private List<Integer> orderFulfillment = new ArrayList<>();

    public List<Integer> getProductIDList(){
        return productIDList;
    }
    public void addProduct(int productID){
        productIDList.add(productID);
    }
    public void removeProduct(int productID){
        productIDList.remove(Integer.valueOf(productID));
    }

    public List<Integer> getOrderFulfillmentList(){
        return orderFulfillment;
    }
    public void addOrder(int orderID){
        orderFulfillment.add(orderID);
    }
    public void removeOrder(int orderID){
        orderFulfillment.remove(Integer.valueOf(orderID));
    }

}