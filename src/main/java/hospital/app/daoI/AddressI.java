package hospital.app.daoI;

import java.util.List;

import hospital.app.dto.Address;

public interface AddressI {

	boolean saveAddress(int branch_id, Address address);

	Address getAddressById(int id);

	boolean removeAddress(int id);

	boolean updateAddress(Address address,int id);

}
