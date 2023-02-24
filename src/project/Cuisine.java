/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author kazit
 */
public class Cuisine implements Serializable {
    private String name;
    private String type;
    private double price;
    private double discount;
    private String description;

    public Cuisine(String name, String type, double price, double discount, String description) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Name:\t" + name + "\nType:\t" + type + "\nPrice:\t" + price + "\nDiscount:\t" + discount;
    }
    
}
