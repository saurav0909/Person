package conference;

import java.util.HashSet;
import java.util.Set;

import person.Person;

public class Conference {
	
	private Set<Person> attendance;
	
	public Conference() {
		this.attendance=new HashSet<>();
	}
	
	public boolean addAttendance(Person person) {
		return attendance.add(person);
	}
	
	public boolean removeAttendance(Person person) {
		return attendance.remove(person);
	}
	
	public Set<Person> listUniqueAttendees() {
        return new HashSet<>(attendance);
    }
	
	public Set<Person>findDuplicateAttendees(){
		
		Set<Person> duplicates=new HashSet<>();
        Set<Integer> seenIds = new HashSet<>();
        Set<Integer> duplicateIds = new HashSet<>();
        
        for(Person attendance:attendance) {
        	if(!seenIds.add(attendance.getId())) {
        		duplicateIds.add(attendance.getId());
        	}
        }
        
        for (Person attendee : attendance) {
            if (duplicateIds.contains(attendee.getId())) {
                duplicates.add(attendee);
            }
        }
        
        return duplicates;

	}
	
    public void printAllAttendees() {
        for (Person attendee : attendance) {
            System.out.println(attendee);
        }
    }

}
