//Name: Rithy Sophorn
//Class: BIT 143
//Date: 4/11/2022
//Assignment: A1.0

public class ItemOrder {
    private Item item;
    private int quantity;
    private int bulkQuantity;
    private double bulkPrice;

    public ItemOrder(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public double getPrice() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return item.priceFor(quantity, bulkQuantity, bulkPrice);
    }

    public Item getItem() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return item;
    }
}
