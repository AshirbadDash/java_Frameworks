package objectsandclasses;

class obj {
	int age;
	String color;

	public void eat() {

		System.out.println("i am eating");
	}

	public static void main(String[] args) {
		System.out.println("1");
		obj dog = new obj();
		dog.eat();
		dog.run();
		dog.age=12;
		dog.color="white";
	}

	public void run() {
		System.out.println("2"); 	 	
	}
	// object initialization with the help of referene variable

}