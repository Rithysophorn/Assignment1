//Name: Rithy Sophorn
//Class: BIT 143
//Date: 4/11/2022
//Assignment: A1.0

import java.text.*;

public class Item {
    // You will need to add more instance variables
    private double price;
    private double bulkPrice;
    private int bulkQuantity;
    private NumberFormat nf;
    private String name;

    public Item(String name, double price) {
        if (price<0) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.price = price;
    }

    public Item(String name, double price, int bulkQuantity, double bulkPrice) {
        // this(/*WHAT SHOULD YOU PUT HERE?*/);
        this.name = name;
        this.price = price;
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;

    }

    public double priceFor(int quantity, int bulkQuantity, double bulkPrice) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        double actualPrice = 0;
        if (quantity<0) {
            throw new IllegalArgumentException();
        }
        else {
            if(bulkQuantity!=0) {
                actualPrice = (quantity/bulkQuantity) *bulkPrice + (quantity % bulkQuantity)* price;
            }
            else {
                actualPrice = quantity * price;
            }
        }
        return actualPrice;
    }

    public boolean equals(Item ietm) {
        if(this.name.equals(ietm.name)) {
            return true;
        }
        return false;
    }

    public String toString() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(2);
        nf.setMaximumFractionDigits(2);
        String str = "";
        str = name + ", " + nf.format(price);
        if (bulkPrice != 0){
            str += "(" + bulkQuantity + " for" + nf.format(bulkPrice) + ")";
        }
        return str;
    }
}
