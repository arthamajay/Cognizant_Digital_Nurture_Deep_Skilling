import java.util.ArrayList;

public class Product {
    int productId;
    String productName;
    String category;
    long price;

    public Product(int productId,String productName,String category,long price){
        this.productId=productId;
        this.productName=productName;
        this.category=category;
        this.price=price;
    }
    @Override
    public String toString(){
        return "Product Id : "+this.productId+"\nProduct Name : "+this.productName+"\nCategory : "+this.category+"\nPrice : "+this.price+"\n";
    }
}

class Main{
    public static Product linearSearch(ArrayList<Product> products,int id){
        for(Product p:products){
            if(p.productId==id){
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(ArrayList<Product> products,int id){
        int n=products.size();
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            Product p=products.get(mid);
            if(p.productId==id){
                return p;
            }else if(p.productId>id){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return null;
    }
    
    // public static void main(String[] args) {
    //     Product p1=new Product(1,"IPhone 17","Mobile",80000);
    //     Product p2=new Product(2,"HP 12","Laptop",90000);
    //     Product p3=new Product(3,"TWS Earbuds","TWS",2000);
    //     Product p4=new Product(4,"Samsung S25 Ultra","Mobile",130000);
    //     Product p5=new Product(5,"Dell 15","Laptop",85000);
    //     ArrayList<Product> products=new ArrayList<>();
    //     products.add(p1);
    //     products.add(p2);
    //     products.add(p3);
    //     products.add(p4);
    //     products.add(p5);

    //     System.out.println(linearSearch(products, 2).toString());
    //     System.out.println(binarySearch(products, 5).toString());
    // }
    public static void main(String[] args) {
        int n=10203004;
        int sum=0;
        long ans=0,pow=1;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                ans=rem*pow + ans;
                pow*=10;
                sum+=rem;
            }
            n/=10;
        }
        System.out.println(ans*sum);
    }
}