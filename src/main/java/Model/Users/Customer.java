package Model.Users;

public class Customer extends Account {
    List<Pair<Item, Integer>> cart = new ArrayList<>(); // Item and quantity
    List<Pair<Item, Integer>> wishlist = new ArrayList<>(); // Item and quantity
    String address;
    String paymentInfo; // TODO: Make this a class with card number, expiration date, etc.
    //Maybe a user icon?

    public Customer(int userID, String username, String password, String email, String phoneNumber, String address, String paymentInfo) {
        super(userID, username, password, email, phoneNumber);
        this.address = address;
        this.paymentInfo = paymentInfo;
    }

    public List<Pair<Item, Integer>> getCart() {
        return cart;
    }

    public void setCart(List<Pair<Item, Integer>> cart) {
        this.cart = cart;
    }

    public void addToCart(Item item, int quantity) {
        for (Pair<Item, Integer> pair : cart) {
            if (pair.getKey().equals(item)) {
                pair.setValue(pair.getValue() + quantity);
                return;
            }
        }
        cart.add(new Pair<>(item, quantity));
    }

    public void removeFromCart(Item item) {
        for (Pair<Item, Integer> pair : cart) {
            if (pair.getKey().equals(item)) {
                cart.remove(pair);
                return;
            }
        }
    }

    public List<Pair<Item, Integer>> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<Pair<Item, Integer>> wishlist) {
        this.wishlist = wishlist;
    }

    public void addToWishlist(Item item, int quantity) {
        for (Pair<Item, Integer> pair : wishlist) {
            if (pair.getKey().equals(item)) {
                pair.setValue(pair.getValue() + quantity);
                return;
            }
        }
        wishlist.add(new Pair<>(item, quantity));
    }

    public void removeFromWishlist(Item item) {
        for (Pair<Item, Integer> pair : wishlist) {
            if (pair.getKey().equals(item)) {
                wishlist.remove(pair);
                return;
            }
        }
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
