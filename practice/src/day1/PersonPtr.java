package day1;

class Person{
	private int id;
	private String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public Person() {
		super();
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

public class PersonPtr {

	public static void main(String[] args) {
		
	}
}