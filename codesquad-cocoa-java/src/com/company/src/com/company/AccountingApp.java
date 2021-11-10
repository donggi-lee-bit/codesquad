package com.company;

class Accounting {

  public static double valueOfsupply;
  public static double vatRate = 0.1;

  public static double getVAT() {
    return valueOfsupply * vatRate;
  }

  public static double getTotal() {
    return valueOfsupply + getVAT();
  }


}

public class AccountingApp {

  public static void main(String[] args) {

    Accounting.valueOfsupply = 10000.0;
    System.out.println("Value of supply : " + Accounting.valueOfsupply);
    System.out.println("VAT : " + Accounting.getVAT());
    System.out.println("Total : " + Accounting.getTotal());
  }

}
