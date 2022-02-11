import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

 		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
 		
 		customerManager.save(new Customer(1,"HARUN","G�NG�RMEZ",2001,Long.parseLong("********")));
	}
	}