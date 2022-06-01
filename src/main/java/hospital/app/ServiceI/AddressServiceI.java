package hospital.app.ServiceI;

import hospital.app.dto.Address;

public interface AddressServiceI {

	boolean saveAddress(int branch_id, Address address);

	Address getAddressById(int address_id);

	boolean removeAddress(int address_id);

	boolean updateAddress(Address address,int address_id);
}
