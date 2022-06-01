package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.UserServiceI;
import hospital.app.daoI.impl.UserDaoImpl;
import hospital.app.dto.User;

public class UserServiceImpl implements UserServiceI {
	UserDaoImpl userDaoImpl = new UserDaoImpl();

	public boolean saveUser(User user) {

		if (userDaoImpl.saveUser(user)) {
			return userDaoImpl.saveUser(user);
		} else {
			System.out.println("user not saved");
			return false;
		}
	}

	public User getUserById(int id) {
		if (userDaoImpl.getUserById(id) != null) {
			return userDaoImpl.getUserById(id);
		} else {
			System.out.println("user not found");
			return userDaoImpl.getUserById(id);
		}
	}

	public User validateUser(String email, String password) {

		if (userDaoImpl.validateUser(email, password) != null) {
			return userDaoImpl.validateUser(email, password);
		} else {
			System.out.println("invalid user");
			return userDaoImpl.validateUser(email, password);
		}
	}

	public boolean removeUser(int id) {
		if (userDaoImpl.removeUser(id)) {
			return userDaoImpl.removeUser(id);
		} else {
			System.out.println("user not get removed");
			return userDaoImpl.removeUser(id);
		}
	}

	public boolean updateUser(int id, User user) {
		if (userDaoImpl.updateUser(id, user)) {
			return userDaoImpl.updateUser(id, user);
		} else {
			System.out.println("user not updated");
			return userDaoImpl.updateUser(id, user);
		}
	}

	public List<User> getAllUser() {
		if (!(userDaoImpl.getAllUser().isEmpty())) {
			return userDaoImpl.getAllUser();
		} else {
			System.out.println("no users found");
			return userDaoImpl.getAllUser();
		}
	}

}
