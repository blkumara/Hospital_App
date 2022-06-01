package hospital.app.ServiceImpl;

import hospital.app.ServiceI.AddressServiceI;
import hospital.app.daoI.impl.AddressDaoImpl;
import hospital.app.dto.Address;

public class AddressServiceImpl implements AddressServiceI{
	AddressDaoImpl addressDaoImpl=new AddressDaoImpl();

	public boolean saveAddress(int branch_id, Address address) {
			if(addressDaoImpl.saveAddress(branch_id, address)) {
				return addressDaoImpl.saveAddress(branch_id, address);
			}
			else {
				System.out.println("Branch not saved");
				return false;
			}	}

	public Address getAddressById(int address_id) {
		if(addressDaoImpl.getAddressById(address_id) != null) {
			return addressDaoImpl.getAddressById(address_id) ;
		}else {
			System.out.println("address not found ");
			return addressDaoImpl.getAddressById(address_id) ;
		}	}

	public boolean removeAddress(int address_id) {
		if(addressDaoImpl.removeAddress(address_id)) {
			return addressDaoImpl.removeAddress(address_id) ;
		}else {
			System.out.println("address not get removed");
			return addressDaoImpl.removeAddress(address_id) ;
		}	}

	public boolean updateAddress(Address address, int address_id) {
		if(addressDaoImpl.updateAddress(address, address_id)) {
			return addressDaoImpl.updateAddress(address, address_id);
		}else {
			System.out.println("address not modified");
			return addressDaoImpl.updateAddress(address, address_id);
		}	}
}

	