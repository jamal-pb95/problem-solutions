package javaForDummies;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySale {
    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        fillTheList(sales);

        double total = 0;
        for (Sale sale : sales) {
            if (sale.item.equals("DVD")) {
                total += sale.price;
            }
        }

        System.out.println(currencyInstance.format(total));
    }

    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Ball Pen", 5.00));
        sales.add(new Sale("Mango", 13.00));
        sales.add(new Sale("CD", 18.00));
    }
}
