package objectsandclasses;

public class Constructor {
	int a;
	int b;

	public Constructor(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public Constructor() {

	}

	public static void main(String[] args) {
		Constructor c = new Constructor(10, 15);
		System.out.println(c.a);
		System.out.println(c.b);
	}

}
