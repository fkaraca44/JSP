package usebean_01;

public class Person {
	int age;
	String name;
	String surname;
	
	public Person(){
		
	}
	public Person(int age,String name,String surname){
		this.age=age;
		this.surname=surname;
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
}
