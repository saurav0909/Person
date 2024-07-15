package app;

import java.util.Set;

import conference.Conference;
import person.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conference conference=new Conference();
		conference.addAttendance(new Person(1, "aaa", 30));
        conference.addAttendance(new Person(2, "bbb", 25));
        conference.addAttendance(new Person(3, "ccc", 35));
        conference.addAttendance(new Person(1, "ddd", 30));
        
        System.out.println("All Attence");
        conference.printAllAttendees();
        
        Set<Person>duplicates=conference.findDuplicateAttendees();
        System.out.println("Duplicate Attendees: " + duplicates);
        
        Set<Person> uniqueAttendees = conference.listUniqueAttendees();
        System.out.println("Unique Attendees: " + uniqueAttendees);


	}

}
