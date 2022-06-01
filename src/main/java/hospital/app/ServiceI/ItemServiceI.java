package hospital.app.ServiceI;

import java.util.List;

import hospital.app.dto.Item;

public interface ItemServiceI {
	boolean saveItem(int  medorder_id,Item item);

	Item getItemById(int item_id);

	boolean removeItem(int item_id);

	boolean updateItem(int item_id, Item item);

	List<Item> getAllItemByOrder(int order_id);

	List<Item> getAllItem();

}
