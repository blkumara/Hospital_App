package hospital.app.AddressController;

import hospital.app.ServiceImpl.AddressServiceImpl;
import hospital.app.dto.Address;

public class SaveAddress {
	public static void main(String[] args) {
		Address address=new Address();
		address.setCity("Hassan");
		address.setLocation("B M Road");
		address.setPincode(568755);
		address.setState("karnataka");
		
		AddressServiceImpl addressServiceImpl=new AddressServiceImpl();
		addressServiceImpl.saveAddress(1, address);
	}

}
