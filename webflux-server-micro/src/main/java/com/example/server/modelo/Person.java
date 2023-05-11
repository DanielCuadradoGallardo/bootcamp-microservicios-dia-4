package com.example.server.modelo;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;
    private Integer age;
    
	public Person() {
	}
	
	public Person(String firstname, String lastname, Integer age) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, firstname, lastname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && Objects.equals(firstname, other.firstname)
				&& Objects.equals(lastname, other.lastname);
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + "]";
	}

	
    
}

