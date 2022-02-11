import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy clientService = new KPSPublicSoapProxy();
		
		
		if( clientService.TCKimlikNoDogrula(Long.parseLong("20137173408"),"HARUN","GÜNGÖRMEZ",2001)) {
		return true;
		}
		else {
		return false;
		}
		
	};
		
}
