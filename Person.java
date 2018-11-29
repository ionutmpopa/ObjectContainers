package com.iopo;

public class Person{
	
	private String name;
    private double age;
    private String cnp;
     
    public Person(String name, double age, String cnp){
        this.name = name;
        this.age = age;
        this.cnp = cnp;
    }
     
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }
    
    public String getCnp() {
        return cnp;
    }

    public String toString(){
        return "Name: " + this.name + " -> Age: " + this.age;
    }
    
    @Override
    public boolean equals(Object obj) {
        Person p = (Person) obj;
        return cnp.equals(p.getCnp());
    }
}
