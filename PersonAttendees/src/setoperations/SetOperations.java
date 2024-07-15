package setoperations;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import person.Person;

public class SetOperations {
	
	private HashSet<Person> hashSet;
    private LinkedHashSet<Person> linkedHashSet;

    public SetOperations()  {
        this.hashSet = new HashSet<>();
        this.linkedHashSet = new LinkedHashSet<>();
    }

    public boolean addPersonToHashSet(Person person) {
        return hashSet.add(person);
    }

    public boolean addPersonToLinkedHashSet(Person person) {
        return linkedHashSet.add(person);
    }

    public Set<Person> getHashSet() {
        return hashSet;
    }

    public Set<Person> getLinkedHashSet() {
        return linkedHashSet;
    }

}
