package hospital.app.ServiceI;

import java.util.List;

import hospital.app.dto.MedOrder;

public interface MedOrderServiceI {
	boolean saveMedOrder(int encounter_id, MedOrder medOrder);

	MedOrder getMedOrderById(int order_id);

	boolean removeMedOrder(int order_id);

	boolean updateMedOrder(int order_id, MedOrder medOrder);

	List<MedOrder> getAllMedOrderEncounter(int encounter_id);

	List<MedOrder> getAllMedOrder();
}
