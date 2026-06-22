public class SearchAlgorithms {

    public static Product linearSearch(Product[] products, String targetName) {
        for (int i=0; i<products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(targetName)) {
                return products[i];
            }
        }
        return null;
    }

    public static Product binarySearch(Product[] sortedProducts, String targetName) {
        int low=0;
        int high=sortedProducts.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int cmp=sortedProducts[mid].productName.compareToIgnoreCase(targetName);
            if (cmp==0) {
                return sortedProducts[mid];
            } else if (cmp<0) {
                low=mid+1;
            } else {
                high=mid-1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products={
            new Product(1, "Camera", "Electronics"),
            new Product(2, "Headphones", "Electronics"),
            new Product(3, "Laptop", "Electronics"),
            new Product(4, "Monitor", "Electronics"),
            new Product(5, "Tablet", "Electronics")
        };

        System.out.println("--- Linear Search ---");
        Product result1=linearSearch(products, "Laptop");
        System.out.println(result1!=null ? result1 : "Not found");

        System.out.println("\n--- Binary Search (sorted array) ---");
        Product result2=binarySearch(products, "Monitor");
        System.out.println(result2!=null ? result2 : "Not found");

        System.out.println("\n--- Search for non-existent item ---");
        Product result3=linearSearch(products, "Drone");
        System.out.println(result3!=null ? result3 : "Not found");
    }
}
