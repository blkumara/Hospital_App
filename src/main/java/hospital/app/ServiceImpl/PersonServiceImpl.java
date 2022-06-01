package hospital.app.ServiceImpl;

import java.util.List;

import hospital.app.ServiceI.PersonServiceI;
import hospital.app.daoI.impl.PersonDaoImpl;
import hospital.app.dto.Person;

public class PersonServiceImpl implements PersonServiceI{
	PersonDaoImpl personDaoImpl=new PersonDaoImpl();
	public boolean savePerson(Person person) {
		if(personDaoImpl.savePerson(person)) {
			return personDaoImpl.savePerson(person) ;
		}else {
			System.out.println("person not saved ");
			return personDaoImpl.savePerson(person) ;
		}	}

	public Person getPersonByPhone(long phone) {
		return null;

			}

	public Person getPersonById(int person_id) {
		if(personDaoImpl.getPersonById(person_id) != null) {
			return personDaoImpl.getPersonById(person_id) ;
		}else {
			System.out.println("no person found ");
			return personDaoImpl.getPersonById(person_id) ;
		}	}

	public boolean removePerson(int person_id) {
		if(personDaoImpl.removePerson(person_id)) {
			return personDaoImpl.removePerson(person_id) ;
		}else {
			System.out.println("person not removed");
			return personDaoImpl.removePerson(person_id) ;
		}	}

	public boolean updatePerson(int person_id, Person person) {

		if(personDaoImpl.updatePerson(person_id, person)) {
			return personDaoImpl.updatePerson(person_id, person) ;
		}else {
			System.out.println("person not got modified ");
			return personDaoImpl.updatePerson(person_id, person) ;
		}	}

	public List<Person> getAllPerson() {
		if(personDaoImpl.getAllPerson() != null) {
			return personDaoImpl.getAllPerson() ;
		}else {
			System.out.println("no persons found");
			return personDaoImpl.getAllPerson() ;
		}	}
	

}
