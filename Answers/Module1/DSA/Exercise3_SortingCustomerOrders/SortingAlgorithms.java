public class SortingAlgorithms {

    public static void bubbleSort(Order[] orders) {
        int n=orders.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if (orders[j].totalPrice>orders[j+1].totalPrice) {
                    Order temp=orders[j];
                    orders[j]=orders[j+1];
                    orders[j+1]=temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low<high) {
            int pi=partition(orders, low, high);
            quickSort(orders, low, pi-1);
            quickSort(orders, pi+1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot=orders[high].totalPrice;
        int i=low-1;
        for (int j=low; j<high; j++) {
            if (orders[j].totalPrice<=pivot) {
                i++;
                Order temp=orders[i];
                orders[i]=orders[j];
                orders[j]=temp;
            }
        }
        Order temp=orders[i+1];
        orders[i+1]=orders[high];
        orders[high]=temp;
        return i+1;
    }

    public static void printOrders(Order[] orders) {
        for (Order o : orders) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Order[] ordersForBubble={
            new Order(101, "Alice", 250.00),
            new Order(102, "Bob", 89.99),
            new Order(103, "Charlie", 540.00),
            new Order(104, "Diana", 120.50),
            new Order(105, "Eve", 310.75)
        };

        Order[] ordersForQuick={
            new Order(101, "Alice", 250.00),
            new Order(102, "Bob", 89.99),
            new Order(103, "Charlie", 540.00),
            new Order(104, "Diana", 120.50),
            new Order(105, "Eve", 310.75)
        };

        System.out.println("--- Bubble Sort Result ---");
        bubbleSort(ordersForBubble);
        printOrders(ordersForBubble);

        System.out.println("\n--- Quick Sort Result ---");
        quickSort(ordersForQuick, 0, ordersForQuick.length-1);
        printOrders(ordersForQuick);
    }
}
