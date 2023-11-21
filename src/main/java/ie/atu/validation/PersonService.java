package ie.atu.validation;
import org.springframework.stereotype.Service;
@Service
public class PersonService {
    // Placeholder method to save a person (add to Db in the next two weeks)
    public void savePerson(Person person) {
        System.out.println("Person saved: " + person);
    }
    public Person getPersonByEmployeeId(String employeeId) {
        Person someOne = new Person();
        someOne.getEmployeeId();
        return someOne;
    }
}
