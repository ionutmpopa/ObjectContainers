package com.iopo;

import java.util.Comparator;

public class AgeComparator implements Comparator<Person> {
	
    @Override
    public int compare(Person p1, Person p2) {
    	
    	double person = p1.getAge() - p2.getAge();
    	
    	if(person > 0){
            return 1;
        } else {
            return -1;
        }
    }

}
