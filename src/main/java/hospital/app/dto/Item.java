package hospital.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int item_id;
private String name;
private double cost;
private String type;
@ManyToOne
@JoinColumn
private MedOrder medOrder;
public int getItem_id() {
	return item_id;
}
public void setItem_id(int item_id) {
	this.item_id = item_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public MedOrder getMedOrder() {
	return medOrder;
}
public void setMedOrder(MedOrder medOrder) {
	this.medOrder = medOrder;
}


}
