//Name: Rithy Sophorn
//Class: BIT 143
//Date: 4/11/2022
//Assignment: A1.0

import java.util.*;

public class ShoppingCart {

    public static final double DISCOUNT_PERCENT = 0.9;
    private ArrayList<ItemOrder>itemOrder;
    private double total = 0;
    private double check = 0;
    private ItemOrder next;

    public ShoppingCart() {
        itemOrder = new ArrayList<ItemOrder>();
        total = 0;
    }

    public boolean add(ItemOrder next) {
        for (int i =0; i<itemOrder.size(); i++) {
            ItemOrder current = itemOrder.get(i);
            if ((current.getItem()).equals(next.getItem())) {
                itemOrder.set(i, next);
                return true;
            }
        }
        itemOrder.add(next);
        return true;
    }

    public void setDiscount(boolean discount) {
        if(discount) {
            check = total * 0.1;
        }
    }

    public double getTotal() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        total = 0;
        for (ItemOrder order : itemOrder) {
            total += order.getPrice();
        }
        return total - check;
    }
}
