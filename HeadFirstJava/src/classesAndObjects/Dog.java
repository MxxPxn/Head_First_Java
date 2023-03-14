package classesAndObjects;

public class Dog {
	int size;
	String breed;
	String name;
	
	
	
	public Dog(int size, String breed, String name) {
		this.size = size;
		this.breed = breed;
		this.name = name;
	}



	void bark() {
		System.out.println("Ruff! Ruff!");
	}

}
