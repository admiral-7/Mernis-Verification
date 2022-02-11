import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	private ICustomerCheckService checkService;
	private long id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private long nationalIdentity;
	

	public StarbucksCustomerManager(ICustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}
	public StarbucksCustomerManager(long id, String firstName, String lastName, int dateOfBirth, long nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIdentity = nationalIdentity;
	}

	
	public void register(Customer customer) {
		System.out.println("Saved to db  Starbucks: " +customer.getFirstName());
	}
	
	public void save(Customer customer) throws NumberFormatException, RemoteException {
		
		

		  if(checkService.CheckIfRealPerson(customer)) {
		 
		  System.out.println("Doðrulandý"); 
		  register(customer);
		  
		  } 
		  else {
		 
		  System.out.println("Kiþi Bulunamadý");
		  }
		 
	}



}
