package Commands;

import Assets.Asset;
import Assets.Currency;
import Containers.Transaction;
import Interfaces.ClientInterface;
import Users.User;

import java.util.function.ToDoubleBiFunction;


/**
 * Command to initiate buy orders. A buy order is a Transaction from Currency (like USD) to
 * an Asset (like Google stock).
 *
 * Author: Langson Zhang
 * Date: Nov 26 2021
 * Version: 1.0
 */
public class Buy extends Command{


    public Buy(User initiator, ClientInterface client, String[] args) {
        super(initiator, client, args);
    }


    /**
     * Initiates a buy order. Uses USD to buy an Asset.
     * this.args syntax: [symbol] [volume]
     * @returns if successful
     */
    @Override
    public boolean execute() {
        //TODO check if you have enough USD.
        if (this.args.length != 2) return false;

        //Symbol
        String symbol = this.args[0];
        String volume = this.args[1];

        Currency usd =  getCapital();
        Asset buy;

        if (usd == null) return false;
        try {
            buy = new Asset(Double.valueOf(volume), getBuyAssetPrice(symbol), symbol, symbol);
        }
        catch (Exception e){
            return false;
        }

        Transaction trans = new Transaction(this.initiator, usd, buy);

        //TODO add to TransactionManager
        //TransactionManager.getInstance().add(trans);

        return true;
    }

    public Currency getCapital(){
        //TODO check if you have enough USD and return it.
        return new Currency(1,1, "","");
    }

    public Double getBuyAssetPrice(String symbol){
        //TODO use API to get the Asset price
        return 1.0;
    }

    @Override
    public String help() {
        return null;
    }

    @Override
    public String name() {
        return null;
    }
}
