public class CustomerRepositoryImpl implements CustomerRepository {
    public String findCustomerById(int id) {
        if(id==1) return "Alice";
        if(id==2) return "Bob";
        return "Customer Not Found";
    }
}
