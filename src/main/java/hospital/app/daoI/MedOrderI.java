package hospital.app.daoI;

import java.util.List;

import hospital.app.dto.MedOrder;

public interface MedOrderI {

	boolean saveMedOrder(int encounter_id, MedOrder medOrder);

	MedOrder getMedOrderById(int medOrder_id);

	boolean removeMedOrder(int medOrder_id);

	boolean updateMedOrder(int medOrder_id, MedOrder medOrder);

	List<MedOrder> getAllMedOrderEncounter(int encounter_id);

	List<MedOrder> getAllMedOrder();

}
