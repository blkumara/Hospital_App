package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.daoI.ItemI;
import hospital.app.daoI.impl.ItemDaoImpl;
import hospital.app.dto.Item;

public class ItemServiceImpl implements ItemI{
	ItemDaoImpl itemDaoImpl=new ItemDaoImpl();

	public boolean saveItem(int medorder_id, Item item) {
		if (itemDaoImpl.saveItem(medorder_id, item)) {
			return itemDaoImpl.saveItem(medorder_id, item);
		} else {
			System.out.println("Item  not saved");
			return false;
		}	}

	public Item getItemById(int item_id) {
		if (itemDaoImpl.getItemById(item_id) != null) {
			return itemDaoImpl.getItemById(item_id) ;
		} else {
			System.out.println("Item not found");
			return null;
		}	}

	public boolean removeItem(int item_id) {
		if (itemDaoImpl.removeItem(item_id)) {
			return itemDaoImpl.removeItem(item_id);
		} else {
			System.out.println("Item not removed");
			return false;
		}	}

	public boolean updateItem(int item_id, Item item) {
		if (itemDaoImpl.updateItem(item_id, item)) {
			return itemDaoImpl.updateItem(item_id, item);
		} else {
			System.out.println("Item not updated");
			return false;
		}	}

	public List<Item> getAllItemByOrder(int order_id) {
		if (itemDaoImpl.getAllItemByOrder(order_id) != null) {
			return itemDaoImpl.getAllItemByOrder(order_id);
		} else {
			System.out.println("Items empty");
			return itemDaoImpl.getAllItemByOrder(order_id);
		}	}

	public List<Item> getAllItem() {
		if (itemDaoImpl.getAllItem() != null) {
			return itemDaoImpl.getAllItem();
		} else {
			System.out.println("Items empty");
			return itemDaoImpl.getAllItem();
		}	}
	
}
