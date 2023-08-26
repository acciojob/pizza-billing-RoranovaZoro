package com.driver;

public class Pizza {

    private int basePrice;
    private Boolean isVeg;
    private Boolean extraCheeseAdded;
    private Boolean extraToppingsAdded;
    private Boolean paperBagAdded;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.paperBagAdded = false;
    }

    public int getPrice() {
        int totalPrice = basePrice;

        if (extraCheeseAdded) {
            totalPrice += 80;
        }

        if (extraToppingsAdded) {
            totalPrice += isVeg ? 70 : 120;
        }

        if (paperBagAdded) {
            totalPrice += 20;
        }

        return totalPrice;
    }

    public void addExtraCheese() {
        extraCheeseAdded = true;
    }

    public void addExtraToppings() {
        extraToppingsAdded = true;
    }

    public void addTakeaway() {
        paperBagAdded = true;
    }

    public String getBill() {
        StringBuilder billBuilder = new StringBuilder();
        billBuilder.append("Base Price Of The Pizza: ").append(basePrice).append("\n");

        if (extraCheeseAdded) {
            billBuilder.append("Extra Cheese Added: 80\n");
        }

        if (extraToppingsAdded) {
            billBuilder.append("Extra Toppings Added: ").append(isVeg ? 70 : 120).append("\n");
        }

        if (paperBagAdded) {
            billBuilder.append("Paperbag Added: 20\n");
        }

        billBuilder.append("Total Price: ").append(getPrice());
        return billBuilder.toString();
    }
}