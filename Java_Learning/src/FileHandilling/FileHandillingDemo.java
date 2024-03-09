package FileHandilling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandillingDemo {
	public static void main(String[] args) {
		File f = new File("C:\\Users\\Sabuj\\OneDrive\\Desktop\\Java");
		if (f.mkdir()) {
			System.out.println("Folder exists");
		}

		if (f.exists()) {
			System.out.println("Folder Exists");
		} else {
			System.out.println("Need to create Folder");
		}

		try {
			FileWriter fw = new FileWriter("C:\\\\Users\\\\Sabuj\\\\OneDrive\\\\Desktop\\\\Java\\java.txt");
			fw.write("Hello World");
			fw.flush();
		} catch (IOException e) {
			System.out.println("Done");
		}

		if (f.delete()) {
			System.out.println("Folder deleted");
		}
	}
}
