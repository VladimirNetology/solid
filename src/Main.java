import print.MsgLogger;
import print.printMsg;

public class Main {
    public static printMsg print = new MsgLogger();

    public static void main(String[] args) {
        Store store = new Store("Магазин #1");
        store.addItem(new Item("Galaxy A20", 250, "Samsung"), 5);
        store.addItem(new Item("Galaxy A75", 400, "Samsung"), 10);
        store.addItem(new Item("Iphone 10", 425, "Apple"), 3);
        store.addItem(new Item("Iphone 12", 850, "Apple"), 5);
        store.addItem(new Item("Phone 5G", 350, "LG"), 7);
        System.out.println();
        store.listAllItems("");
        System.out.println();

        store.listAllItems("Samsung");
        System.out.println();

        User vasya = new User(1, "Vasya Petrov", "1234", "14 Lenina, kv 44");
        vasya.cardStore.connectToStore(store);
        vasya.cardStore.addItem(3, 1);
        vasya.cardStore.addItem(4, 2);
        vasya.cardStore.addItem(2, 1);

        System.out.println();
        vasya.cardStore.listAllItems();

        


//        vasya.cardStore.deleteItem(2, 1);
//        vasya.cardStore.deleteItem(4, 1);
//
//        System.out.println();
//        vasya.cardStore.listAllItems();

//        System.out.println();
//        vasyaCart.order();
//
//        System.out.println();
//        vasyaCart.addRaitingToItem(3, 4.0);
//        vasyaCart.addRaitingToItem(4, 2.5);
//
//        System.out.println();
//        store.listAllItems("");


    }
}
