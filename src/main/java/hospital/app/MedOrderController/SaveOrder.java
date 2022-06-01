package hospital.app.MedOrderController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import hospital.app.ServiceImpl.MedOrderServiceImpl;
import hospital.app.dto.Item;
import hospital.app.dto.MedOrder;

public class SaveOrder {
	public static void main(String[] args) {
		MedOrder medOrder =new MedOrder();
		medOrder.setOrderTimeAndDate(LocalDateTime.of(LocalDate.of(2022, 05, 28), LocalTime.now()));
		medOrder.setStatus("order placed");
		
		Item itemDto = new Item() ;
		itemDto.setName("PCT");
		itemDto.setCost(20);
		itemDto.setType("oral");
		itemDto.setMedOrder(medOrder);
		
		
		Item itemDto1 = new Item() ;
		itemDto1.setName("Dolo 650 ");
		itemDto1.setCost(18);
		itemDto1.setType("oral");
		itemDto1.setMedOrder(medOrder);
		
		Item itemDto2 = new Item() ;
		itemDto2.setName("CBD oil");
		itemDto2.setCost(500);
		itemDto2.setType("oil");
		itemDto2.setMedOrder(medOrder);
		
		List<Item> items = new ArrayList<Item>() ;
		items.add(itemDto) ;
		items.add(itemDto1) ;
		items.add(itemDto2) ;
		

		medOrder.setItems(items);
		
		MedOrderServiceImpl impl =  new MedOrderServiceImpl() ;
		impl.saveMedOrder(1, medOrder) ;
		
	}
}
