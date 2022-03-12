import java.util.ArrayList;
import java.util.List;

public class User {
    private long id;
    private String name;
    private String password;
    private String address;
    public CardStore cardStore;
    private List<Delivery> deliveryList;

    public User(long id, String name, String password, String address) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.cardStore = new CardStore("Корзина " + name);
        deliveryList = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    public List<Delivery> getDeliveryList() {
//        return deliveryList;
//    }
}
