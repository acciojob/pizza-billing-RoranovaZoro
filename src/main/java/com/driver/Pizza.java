package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean extraCheeseAdded;
    private Boolean extraToppingsAdded;
    private Boolean paperBagAdded;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
        this.bill = "";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if (!extraCheeseAdded) {
            this.price += 80;
            this.extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!extraToppingsAdded) {
            int toppingsPrice = isVeg ? 70 : 120;
            this.price += toppingsPrice;
            this.extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if (!paperBagAdded) {
            this.price += 20;
            this.paperBagAdded = true;
        }
    }

    public String getBill(){
        StringBuilder billBuilder = new StringBuilder();
        billBuilder.append("Base Price Of The Pizza: ").append(this.price).append("\n");

        if (extraCheeseAdded) {
            billBuilder.append("Extra Cheese Added: 80\n");
        }

        if (extraToppingsAdded) {
            billBuilder.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        }

        if (paperBagAdded) {
            billBuilder.append("Paperbag Added: 20\n");
        }

        billBuilder.append("Total Price: ").append(this.price);
        this.bill = billBuilder.toString();
        return this.bill;
    }
}