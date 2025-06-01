import java.util.Scanner;

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = sc.nextLine();

        System.out.print("Enter Product Price: ");
        double price = sc.nextDouble();

        User user = new User("U001", userName);
        Product product = new Product("P001", productName, price);
        Order order = new Order(user, product);

        order.placeOrder();
    }
}

class User {
    String name;

    public User(String id, String name) {
        this.name = name;
    }
}

class Product {
    String name;
    double price;

    public Product(String id, String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    User user;
    Product product;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    void placeOrder() {
        System.out.println(user.name + " placed an order for " + product.name + " at $" + product.price);
    }
}
