package Entities;

import java.util.UUID;

public class Transaction {
    private UUID id;
    private String from_type;
    private String to_type;
    private double value;  // the price of the to_type
    // private double quantity;  // the quantity of the to_type

    private Transaction(UUID id, String from, String to, double val){
        this.id = id;
        this.from_type = from;
        this.to_type = to;
        this.value = val;
    }

    public static Transaction[] generateTransactionPair(String from, String to, double val) {
        UUID id = UUID.randomUUID();
        Transaction[] t = new Transaction[2];
        t[0] = new Transaction(id, to, from, -val);  // transfering from
        t[1] = new Transaction(id, from, to, val);  // transfering to
        return t;
    }

    public UUID getId() {
        return this.id;
    }

    public String getFrom_type() {
        return this.from_type;
    }

    public String getTo_type() {
        return this.to_type;
    }

    public double getValue() {
        return this.value;
    }
}
