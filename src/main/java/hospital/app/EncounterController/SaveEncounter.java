package hospital.app.EncounterController;

import java.time.LocalDate;
import java.time.LocalDateTime;

import hospital.app.ServiceImpl.EncounterServiceImpl;
import hospital.app.dto.Encounter;

public class SaveEncounter {
	public static void main(String[] args) {
		Encounter dto=new Encounter();
		dto.setAdmissionDateAndTime(LocalDateTime.of(2021,5, 12, 5, 00));
		dto.setDischargeDateAndTime(LocalDateTime.now());
		dto.setReasonOfAdmission("accident");
		dto.setStatus("normal");
		
		EncounterServiceImpl encounterServiceImpl=new EncounterServiceImpl();
		encounterServiceImpl.saveEncounter(1, 1, dto);
	}

}
