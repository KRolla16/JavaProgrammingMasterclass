package com.company;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	// write your code here

        StockItem temp = new StockItem("bread", 0.86,100);
        stockList.addStock(temp);


        temp = new StockItem("cake",1.10,7);
        stockList.addStock(temp);
        temp = new StockItem("car",12.10,2);
        stockList.addStock(temp);
        temp = new StockItem("chair",52.10,200);
        stockList.addStock(temp);
        temp = new StockItem("cup",1.00,200);
        stockList.addStock(temp);
        temp = new StockItem("cup",5.45,7);
        stockList.addStock(temp);
        temp = new StockItem("door",71.95,4);
        stockList.addStock(temp);
        temp = new StockItem("juice",2.50,36);
        stockList.addStock(temp);
        temp = new StockItem("phone",96.90,35);
        stockList.addStock(temp);
        temp = new StockItem("towel",50.00,55);
        stockList.addStock(temp);
        temp = new StockItem("vase",6.90,4);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket tempBasket = new Basket("temp");
        sellItem(tempBasket,"car",1);
        System.out.println(tempBasket);

        sellItem(tempBasket,"car",1);
        System.out.println(tempBasket);

        sellItem(tempBasket,"car",1);
        sellItem(tempBasket,"spanner",5);
        System.out.println(tempBasket);
        System.out.println(stockList);

        /*for (String s: stockList.Items().keySet()){
            System.out.println(s);
        }*/


    }


    public static int sellItem(Basket basket, String item, int quantity){
        StockItem stockItem = stockList.get(item);
        if (stockItem == null){
            System.out.println("we dont sell " + item);
            return 0;
        }
        if (stockList.sellStock(item,quantity) != 0){
            basket.addToBasket(stockItem,quantity);
            return quantity;
        }
        return 0;
    }
}
