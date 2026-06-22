public class DITest {
    public static void main(String[] args) {
        CustomerRepository repo=new CustomerRepositoryImpl();
        CustomerService service=new CustomerService(repo);

        System.out.println("Customer 1: "+service.getCustomer(1));
        System.out.println("Customer 2: "+service.getCustomer(2));
        System.out.println("Customer 5: "+service.getCustomer(5));
    }
}
