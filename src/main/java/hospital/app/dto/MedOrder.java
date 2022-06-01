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
public class MedOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int medOrder_id;
	private LocalDateTime orderTimeAndDate;
	private String status;
	private double total;

	@ManyToOne
	@JoinColumn
	private Encounter encounter;
	
	@OneToMany(mappedBy = "medOrder")
	private List<Item> items;
	
	
	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getMedOrder_id() {
		return medOrder_id;
	}

	public void setMedOrder_id(int medOrder_id) {
		this.medOrder_id = medOrder_id;
	}

	public LocalDateTime getOrderTimeAndDate() {
		return orderTimeAndDate;
	}

	public void setOrderTimeAndDate(LocalDateTime orderTimeAndDate) {
		this.orderTimeAndDate = orderTimeAndDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

}
