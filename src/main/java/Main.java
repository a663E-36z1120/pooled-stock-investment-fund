
import Entities.Asset;
import Interfaces.YahooFinanceAPI;
import UseCases.AssetManager;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import Interfaces.CommandLine;

import java.io.IOException;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CommandLine cmd = new CommandLine();

//        Asset teslaStock = new Asset("TSLA", 3.123);
//        YahooFinanceAPI yahoo = new YahooFinanceAPI();
//        while (true) {
//            AssetManager.updateAssetPrice(teslaStock, yahoo);
//            double value = teslaStock.getValue();
//            double price = teslaStock.getPrice();
//            double quantity = teslaStock.getQuantity();
//            Thread.sleep(2000);
//
//            System.out.println(quantity + " Tesla Stock is now worth $" + value + " at price $" + price);
    }
}