package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addTakeaway();
    System.out.print(dp.getBill());

    DeluxePizza dp2 = new DeluxePizza(false);
    dp2.addTakeaway();
    dp2.addTakeaway();
    System.out.println(dp2.getBill());

  }
}