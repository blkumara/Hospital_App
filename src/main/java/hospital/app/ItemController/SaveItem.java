package hospital.app.ItemController;

import hospital.app.ServiceImpl.ItemServiceImpl;
import hospital.app.dto.Item;

public class SaveItem {
	public static void main(String[] args) {
		
		
		Item  item=new Item();
		item.setName("paraacetol");
		item.setType("tablet");
		item.setCost(5);
		
		ItemServiceImpl itemServiceImpl=new ItemServiceImpl();
		itemServiceImpl.saveItem(1, item);
		
		
	}

}
