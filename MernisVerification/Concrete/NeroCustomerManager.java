
public class NeroCustomerManager extends BaseCustomerManager {

	public void save(Customer customer) {
		
		System.out.println("Saved to db : " + customer.getFirstName());
	}

	
}
