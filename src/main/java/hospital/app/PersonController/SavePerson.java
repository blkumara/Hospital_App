package hospital.app.PersonController;

import java.time.LocalDate;

import hospital.app.ServiceImpl.PersonServiceImpl;
import hospital.app.dto.Person;

public class SavePerson {
	public static void main(String[] args) {
		Person dto=new  Person();
		dto.setAge(20);
		dto.setDob(LocalDate.of(1999, 05, 30));
		dto.setEmail("balajitirupathi@gmail.com");
		dto.setGender("male");
		dto.setName("balaji devasety");
		dto.setPhone(7894561230l);
		
		PersonServiceImpl impl=new PersonServiceImpl();
		impl.savePerson(dto);
	}
}
