import java.util.HashMap;

public class Inventory {
    private HashMap<Integer, Product> stock=new HashMap<>();

    public void addProduct(Product p) {
        stock.put(p.productId, p);
        System.out.println("Added: "+p.productName);
    }

    public void updateProduct(int id, int newQty, double newPrice) {
        Product p=stock.get(id);
        if (p!=null) {
            p.quantity=newQty;
            p.price=newPrice;
            System.out.println("Updated product ID "+id);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int id) {
        if (stock.containsKey(id)) {
            System.out.println("Deleted: "+stock.get(id).productName);
            stock.remove(id);
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayAll() {
        if (stock.isEmpty()) {
            System.out.println("Inventory is empty.");
        }
        for (Product p : stock.values()) {
            System.out.println(p);
        }
    }

    public static void main(String[] args) {
        Inventory inv=new Inventory();
        inv.addProduct(new Product(1, "Laptop", 10, 999.99));
        inv.addProduct(new Product(2, "Mouse", 50, 25.00));
        inv.addProduct(new Product(3, "Keyboard", 30, 45.00));
        System.out.println("\n--- All Products ---");
        inv.displayAll();
        inv.updateProduct(1, 8, 949.99);
        System.out.println("\n--- After Update ---");
        inv.displayAll();
        inv.deleteProduct(2);
        System.out.println("\n--- After Delete ---");
        inv.displayAll();
    }
}
