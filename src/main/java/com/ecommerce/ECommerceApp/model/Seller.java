package com.ecommerce.ECommerceApp.model;
import java.util.ArrayList;

import org.springframework.stereotype.Component;


@Component

public class Seller{

    private List<int> productIDList;
    private List<int> orderFulfillment;

    public List<int> getProductIDList(){
        return productIDList;
    }
    public void addProduct(int productID){
        productIDList.add(productID);
    }
    public void removeProduct(int productID){
        productIDList.remove(Integer.valueof(productID));
    }

    public List<int> getOrderFulfillmentList(){
        return productIDList;
    }
    public void addOrder(int orderID){
        orderFulfillment.add(orderID);
    }
    public void removeOrder(int orderID){
        orderFulfillment.remove(Integer.valueof(orderID));
    }

}