import java.util.Map;

public class CardStore extends Store {
    private Store store;

    public CardStore(String name) {
        super(name);
    }

    public void listAllItems() {
        System.out.println("Товары в корзине [" + name + "]:");
        for (Map.Entry<Integer, Item> item : itemStore.entrySet()) {
            System.out.println("[" + item.getKey() + "] " + item.getValue().getName()
                    + " (" + item.getValue().getCompany()
                    + ") - $" + item.getValue().getPrice()
                    + ". Выбрано: " + itemAmount.get(item.getKey()) + " шт.");
        }
    }

    // Добавление товара по ID (в оригинале было по Item)
    public void addItem(int id, int amount) {
        Item item = store.getItemFromId(id);
        super.addItem(item, amount);
    }

    public void connectToStore(Store store) {
        this.store = store;
        System.out.println("Подключение к [" + name + "] в [" + store.name + "]");
    }
}

