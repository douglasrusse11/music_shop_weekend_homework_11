package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> stock;

    public Shop() {
        stock = new ArrayList<>();
    }

    public int getStockCount() {
        return stock.size();
    }

    public void addItemToStock(ISell item) {
        stock.add(item);
    }

    public void removeItemFromStock(ISell item) {
        stock.remove(item);
    }

    public double getTotalPotentialProfit() {
        double profit = 0;
        for (ISell item: stock) {
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
