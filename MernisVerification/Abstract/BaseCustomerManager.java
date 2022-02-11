import java.rmi.RemoteException;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		System.out.println("Saved to db ; " + customer.getFirstName());
	}


	


}
