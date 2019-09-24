package javaForDummies;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySales {
    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        fillTheList(sales);
        System.out.println(currency.format(
                sales.stream()
                .filter((sale) -> sale.item.equals("Mango"))
                .map((sale) -> sale.price)
                .reduce(0.0, (price1, price2) -> price1 + price2)));
    }

    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("Mango", 12.33));
        sales.add(new Sale("MangoA", 33.33));
        sales.add(new Sale("Orange", 12.432));
        sales.add(new Sale("Apple", 14.33));
        sales.add(new Sale("MangoR", 112.33));
    }
}
