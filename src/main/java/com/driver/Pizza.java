package com.driver;

public class Pizza {

    private int price = 0;
    private Boolean isVeg;
    private String bill = "";

    private boolean isCheeseAdded = false;
    private boolean isToppingAdded = false;
    private boolean isTakeawayAdded = false;

    //price of all items
    private int vegPizzaPrice = 300;
    private int nonVegPizzaPrice = 400;
    private int extraCheesePrice = 80;
    private int extraToppingVeg = 70;
    private int extraToppingNonVeg = 120;
    private int paperBagPrice = 20;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price += vegPizzaPrice;
            this.bill += "Base Price Of The Pizza: 300"+ "\n";
        }else{
            this.price += nonVegPizzaPrice;
            this.bill += "Base Price Of The Pizza: 400"+ "\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price += extraCheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            if(isVeg){
                this.price += extraToppingVeg;
            }else{
                this.price += extraToppingNonVeg;
            }
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isTakeawayAdded){
            this.price += paperBagPrice;
            isTakeawayAdded = true;
        }
    }

    public String getBill(){
        if(isCheeseAdded){
            this.bill += "Extra Cheese Added: 80"+ "\n";
        }
        if(isToppingAdded){
            if(isVeg){
                this.bill += "Extra Toppings Added: 70"+ "\n";
            }else{
                this.bill += "Extra Toppings Added: 120"+ "\n";
            }
        }
        if(isTakeawayAdded){
            this.bill += "Paperbag Added: 20"+ "\n";
        }

        this.bill += "Total Price: "+ this.price + "\n";
        return this.bill;
    }
}
