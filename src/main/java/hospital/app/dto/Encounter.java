package hospital.app.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int encounter_id;
	private LocalDateTime admissionDateAndTime;
	private String reasonOfAdmission;
	private LocalDateTime dischargeDateAndTime;
	private String status;

	@ManyToOne
	@JoinColumn
	private Branch branch;

	@ManyToOne
	@JoinColumn
	private Person person;

	@OneToMany(mappedBy = "encounter")
	private List<Observation> observations;

	@OneToMany(mappedBy = "encounter")
	private List<MedOrder> medOrders;

	public int getEncounter_id() {
		return encounter_id;
	}

	public void setEncounter_id(int encounter_id) {
		this.encounter_id = encounter_id;
	}

	public LocalDateTime getAdmissionDateAndTime() {
		return admissionDateAndTime;
	}

	public void setAdmissionDateAndTime(LocalDateTime admissionDateAndTime) {
		this.admissionDateAndTime = admissionDateAndTime;
	}

	public String getReasonOfAdmission() {
		return reasonOfAdmission;
	}

	public void setReasonOfAdmission(String reasonOfAdmission) {
		this.reasonOfAdmission = reasonOfAdmission;
	}

	public LocalDateTime getDischargeDateAndTime() {
		return dischargeDateAndTime;
	}

	public void setDischargeDateAndTime(LocalDateTime dischargeDateAndTime) {
		this.dischargeDateAndTime = dischargeDateAndTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public List<MedOrder> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}

}
