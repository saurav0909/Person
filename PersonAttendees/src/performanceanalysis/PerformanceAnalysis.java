package performanceanalysis;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

import person.Person;

public class PerformanceAnalysis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=100000;
		
		Set<Person>hashSet=new HashSet<>();
		Set<Person>linkHashSet=new LinkedHashSet<>();
		
		// Adding elements
        long startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.add(new Person(i, "Person" + i, i % 100));
        }
        long endTime = System.nanoTime();
        System.out.println("HashSet add time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkHashSet.add(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet add time: " + (endTime - startTime) / 1e6 + " ms");

        // Contains elements
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.contains(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet contains time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkHashSet.contains(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet contains time: " + (endTime - startTime) / 1e6 + " ms");

        // Remove elements
        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            hashSet.remove(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("HashSet remove time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        for (int i = 0; i < size; i++) {
            linkHashSet.remove(new Person(i, "Person" + i, i % 100));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedHashSet remove time: " + (endTime - startTime) / 1e6 + " ms");

	}

}
