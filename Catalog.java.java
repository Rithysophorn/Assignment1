//Name: Rithy Sophorn
//Class: BIT 143
//Date: 4/11/2022
//Assignment: A1.0

import java.util.*;

public class Catalog {

    private ArrayList<Item> items;
    String catalogName;

    public Catalog(String name) {
        items = new ArrayList<Item>();
        catalogName = name; 
    }

    public void add(Item next) {
        items.add(next);
    }

    public int size() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return items.size();
    }

    public Item get(int index) {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code

        return items.get(index);
    }

    public String getName() {
        // This does NOT produce the correct behavior. It's only here to keep the
        // compiler happy until you replace it with working code
        return catalogName;
    }
}
