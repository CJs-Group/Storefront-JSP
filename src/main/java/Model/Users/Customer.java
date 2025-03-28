package Model.Users;
import Model.Items.Item;
import Model.Items.Unit;
import java.util.HashMap; //Dunno if I should be using hash maps but I'll think about it later because Java doesn't have pairs
import java.util.Map;

public class Customer extends User {
    Map<Item, Integer> cart = new HashMap<>(); // Item to quantity
    Map<Item, Integer> wishlist = new HashMap<>(); // Item to quantity
    String address;
    String paymentInfo; // TODO: Make this a class with card number, expiration date, etc.
    //Maybe a user icon?

    public Customer(int userID, String username, String password, String email, String phoneNumber, String address, String paymentInfo) {
        super(userID, username, password, email, phoneNumber);
        this.address = address;
        this.paymentInfo = paymentInfo;
    }

    public Map<Item, Integer> getCart() {
        return cart;
    }

    public void setCart(Map<Item, Integer> cart) {
        this.cart = cart;
    }

    public void addToCart(Item item, int quantity) {
        cart.put(item, cart.getOrDefault(item, 0) + quantity);
    }

    public void removeFromCart(Item item) {
        cart.remove(item);
    }

    public Map<Item, Integer> getWishlist() {
        return wishlist;
    }

    public void setWishlist(Map<Item, Integer> wishlist) {
        this.wishlist = wishlist;
    }

    public void addToWishlist(Item item, int quantity) {
        wishlist.put(item, wishlist.getOrDefault(item, 0) + quantity);
    }

    public void removeFromWishlist(Item item) {
        wishlist.remove(item);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }
}