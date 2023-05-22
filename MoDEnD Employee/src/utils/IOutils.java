package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.core.Employee;

public interface IOutils {

	// serilization //store //write
	static void store(String filename, Map<Integer, Employee> maps) throws FileNotFoundException, IOException {
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {

			out.writeObject(maps);

		}

	}

	// deserialization
	@SuppressWarnings("unchecked")
	static Map<Integer,Employee> restore(String filename) throws FileNotFoundException, IOException, ClassNotFoundException{
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename)))
		{
			return (Map<Integer,Employee>)in.readObject();
		}
	
		
	}
	
	
}
