package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.MedOrderServiceI;
import hospital.app.dto.MedOrder;

public class MedOrderServiceImpl implements MedOrderServiceI {
	MedOrderServiceI medOrderServiceI = new MedOrderServiceImpl();

	public boolean saveMedOrder(int encounter_id, MedOrder medOrder) {
		if (medOrderServiceI.saveMedOrder(encounter_id, medOrder)) {
			return medOrderServiceI.saveMedOrder(encounter_id, medOrder);
		} else {
			System.out.println("MedOrder not saved");
			return false;
		}	}

	public MedOrder getMedOrderById(int order_id) {
		if (medOrderServiceI.getMedOrderById(order_id) != null) {
			return medOrderServiceI.getMedOrderById(order_id) ;
		} else {
			System.out.println("medical orderS not found");
			return null;
		}	}

	public boolean removeMedOrder(int order_id) {
		if (medOrderServiceI.removeMedOrder(order_id)) {
			return medOrderServiceI.removeMedOrder(order_id);
		} else {
			System.out.println("med order not removed");
			return false;
		}	}

	public boolean updateMedOrder(int order_id, MedOrder medOrder) {
		if (medOrderServiceI.updateMedOrder(order_id, medOrder)) {
			return medOrderServiceI.updateMedOrder(order_id, medOrder);
		} else {
			System.out.println("medical order not updated");
			return false;
		}	}

	public List<MedOrder> getAllMedOrderEncounter(int encounter_id) {
		if (medOrderServiceI.getAllMedOrderEncounter(encounter_id) != null) {
			return medOrderServiceI.getAllMedOrderEncounter(encounter_id);
		} else {
			System.out.println("Med order empty");
			return medOrderServiceI.getAllMedOrderEncounter(encounter_id);
		}
	}

	public List<MedOrder> getAllMedOrder() {
		if (medOrderServiceI.getAllMedOrder() != null) {
			return medOrderServiceI.getAllMedOrder();
		} else {
			System.out.println("Med order empty");
			return medOrderServiceI.getAllMedOrder();
		}	}

}
