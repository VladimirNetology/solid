import java.util.HashMap;
import java.util.Map;

public class Store {
    protected String name;
    protected Map<Integer, Item> itemStore = new HashMap<>();
    protected Map<Integer, Integer> itemAmount = new HashMap<>();

    public Store(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, Item> getItemStore() {
        return itemStore;
    }

    public void addItem(Item item, int amount) {
        itemStore.put(item.getId(), item);
        itemAmount.put(item.getId(), amount);
        Main.print.print(" - Товар [" + item.getName() + "] добавлен в [" + name + "] в колличестве " + amount + " шт.");
    }

    public void deleteItem(int itemId, int amount) {
        Item item = getItemFromId(itemId);
        Main.print.print(" - Товар [" + item.getName() + "] удален из [" + name + "] в колличестве " + amount + " шт.");

        if (itemAmount.get(itemId) == amount) {
            itemStore.remove(itemId);
            itemAmount.remove(itemId);
        } else {
            itemAmount.put(itemId, amount);
        }
    }

    public void listAllItems(String company) {
        if (company.isEmpty()) {
            Main.print.print("Товары в наличие [" + name + "]:");
        } else {
            Main.print.print("Товары в наличие [" + name + "] фирмы [" + company + "]:");
        }
        for (Map.Entry<Integer, Item> item : itemStore.entrySet()) {
            if (!company.isEmpty() && !item.getValue().getCompany().equals(company)) {
                continue;
            }
            Main.print.print("[" + item.getKey() + "] " + item.getValue().getName()
                    + " (" + item.getValue().getCompany()
                    + ") - $" + item.getValue().getPrice()
                    + ". Доступно: " + itemAmount.get(item.getKey())
                    + " шт. Рейтинг: " + item.getValue().getRaiting());
        }
    }


    public Item getItemFromId(int itemId) {
        return itemStore.get(itemId);
    }
}
