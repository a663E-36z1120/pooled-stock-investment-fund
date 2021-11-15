package Assets;

import Users.User;
import Identification.Identifiable;

public class Asset<T extends AssetType> extends Identifiable<T> {
    //____________________ Variables ___________________________________________________________________________________

    private User owner; // The owner of the asset
    private double volume; // The volume of the asset: ex. how many shares of X stock
    private double price; // The price per unit volume of the asset

    //____________________ Constructors ________________________________________________________________________________

    /**
     * Basic constructor.
     * @param volume is how many of the asset
     * @param price is how much $ its worth
     * @param type holds the information about the type of asset
     */
    public Asset(double volume, double price, T type) {
        super(type);
        this.volume = volume;
        this.price = price;
    }

    //____________________ Methods _____________________________________________________________________________________

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public double getVolume() {
        return volume;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public double getValue(){
        return this.volume * this.price;
    }


}