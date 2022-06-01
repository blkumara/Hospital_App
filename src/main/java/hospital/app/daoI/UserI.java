package hospital.app.daoI;

import java.util.List;

import hospital.app.dto.User;

public interface UserI {

	boolean saveUser(User user);

	User getUserById(int id);

	User validateUser(String email, String password);

	boolean removeUser(int id);

	boolean updateUser(int id, User user);

	List<User> getAllUser();

}
