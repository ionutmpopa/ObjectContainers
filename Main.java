package com.iopo;

import java.util.*;

public class Main {
	
	public static void main (String[] args) {
		
		TreeSet<Person> nameComparator = new TreeSet<Person>(new NameComparator());
		nameComparator.add(new Person("George",24.3, "12345"));
		nameComparator.add(new Person("Sandu",33, "234345333"));
		nameComparator.add(new Person("Cami",20.8, "188123223"));
		nameComparator.add(new Person("Alex",14, "2546677678"));
        
        for(Person name : nameComparator){
            System.out.println(name);
        }
        
        System.out.println("########################################");

        TreeSet<Person> ageComparator = new TreeSet<Person>(new AgeComparator());
        ageComparator.add(new Person("George",24.3, "12345"));
        ageComparator.add(new Person("Sandu",33, "234345333"));
        ageComparator.add(new Person("Cami",20.8, "188123223"));
        ageComparator.add(new Person("Alex",14, "2546677678"));
        
        for(Person age : ageComparator){
            System.out.println(age);
        }

        System.out.println("########################################");
        
        Map<Person, List<Hobby>> myMappedPerson = new HashMap<Person, List<Hobby>>();
        List<Hobby> hobbyList = new ArrayList<>();

        Hobby hobby1 = new Hobby("Tennis", 3);
        Hobby hobby2 = new Hobby("Football", 3);

        hobby1.addAddress("Cluj-Napoca", "Romania");
        hobby2.addAddress("Viena", "Austria");

        hobbyList.add(hobby1);
        hobbyList.add(hobby2);

        myMappedPerson.put(new Person ("Vasile", 18, "1234567"), hobbyList);

        for (int i = 0; i < hobbyList.size(); i++) {

            for (List<Hobby> myPerson : myMappedPerson.values()) {
        	    System.out.println(myMappedPerson.keySet() + "; Hobbies: " + myPerson.get(i).getHobbyName() + " -> "
                                  + myPerson.get(i).getMyAddress().get(0).getCountry());
            }
        }
	}

}
