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
public class Bill extends Order{
    private double price;
    private double discount;
    private int quantity;

    public Bill(String customerName, String orderedItem, double price, double discount, int quantity) {
        super(customerName, orderedItem);
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price*quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
         
    public double getDiscountPrice(double price, double discount){
        return (price*discount)/100.0;
    }

    public double getCalculatedPrice(double price, double discount){
        return price-getDiscountPrice(price, discount);
    }
    
    public double getCalculatedPrice(double price){
        return price-getDiscountPrice(price, discount);
    }

    @Override
    public String toString() {
        return "Item name:\t" + super.getOrderedItem()+ "\nRegular Price:\t" + price + "\nDiscount:\t" + discount + "%\nQuantity:\t" + quantity + "\nDiscount tk:\t"+this.getDiscountPrice(this.getPrice(), discount)+"\nTaka to Pay:\t"+this.getCalculatedPrice(this.getPrice(), discount);
    }
    
}
