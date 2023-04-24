package aufgabe;

import java.util.Date;

public class GenericTest {
	
	/*
	 * Attribute
	 */
	private String name;
	private Date time;
	
	/*
	 * Konstruktor
	 */
	public GenericTest(String name){
		this.name = name;
	}
	
	/*
	 * Methods
	 */
	public void print() {
		System.out.print(name);
	}
	
	
	
	
	/*
	 * Getters & Setters
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
