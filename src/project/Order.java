/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author kazit
 */
public class Order {
    private String customerName;
    private String orderedItem;

    public Order(String customerName, String orderedItem) {
        this.customerName = customerName;
        this.orderedItem = orderedItem;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getOrderedItem() {
        return orderedItem;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setOrderedItem(String orderedItem) {
        this.orderedItem = orderedItem;
    }

    @Override
    public String toString() {
        return "Customer Name: " + customerName + "\nOrdered Item: " + orderedItem;
    }
}
