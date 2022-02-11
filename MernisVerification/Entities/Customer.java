import java.rmi.RemoteException;

public class Customer {
	
	 long id;
	 String firstName;
	 String lastName;
	 int dateOfBirth;
	 double nationalIdentity;
	
	public Customer(long id, String firstName, String lastName, int dateOfBirth, long nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalIdentity = nationalIdentity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getDateOfBirth() {
		return (int) dateOfBirth;
	}
	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public long getNationalIdentity() {
		return (long) nationalIdentity;
	}
	public void setNationalIdentity(long nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	
	

}
