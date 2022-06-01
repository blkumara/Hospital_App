package hospital.app.daoI;

import java.util.List;

import hospital.app.dto.Person;

public interface PersonI {

	boolean savePerson(Person person);

	Person getPersonByPhone(long phone);

	Person getPersonById(int person_id);

	boolean removePerson(int person_id);

	boolean updatePerson(int person_id, Person person);

	List<Person> getAllPerson();

}
