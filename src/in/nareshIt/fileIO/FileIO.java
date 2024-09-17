package in.nareshIt.fileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import in.nareshIt.beans.Student;

public class FileIO {
	private static final String FILE_PATH = "students.txt";

	// Save student list to file
	public static void saveToFile(List<Student> students) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
			oos.writeObject(students);
			System.out.println("Students saved to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Load student list from file
	public static List<Student> loadFromFile() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
			return (List<Student>) ois.readObject();
		} catch (FileNotFoundException e) {
			System.out.println("No saved students found.");
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
}
