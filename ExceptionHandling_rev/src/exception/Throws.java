package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Throws {
	void readFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");

	}

	void saveFile() throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("d:/abc.txt");

	}

}

class Main {
	public static void main(String[] args) {
		Throws tw = new Throws();

		try {

			tw.readFile();
			tw.saveFile();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled");
		}
	}
}
