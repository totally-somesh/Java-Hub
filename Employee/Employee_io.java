package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;

import com.app.emp.Employee;
import com.app.exception.EmoloyeeHandlingException;

public interface Employee_io {
//ada static method to store the products from map using ser

	public static void store(String filename,Map<String,Employee>maps) throws IOException,NotSerializableException
	{
	//	app-->OOS-->fos-->bin file
		//primitive to binary
		try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream(filename))) {
			
		out.writeObject(maps);//write products using map
		}//try with res
	}
	
	@SuppressWarnings("unchecked")
	public static Map<String,Employee> restore(String filename) throws ClassNotFoundException, IOException, EmoloyeeHandlingException
	{
	//	javaApp	<--OOS <-- FOS <-- bin file
		//binary to primitive
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename))) {

		return (Map<String,Employee>)in.readObject();
		}
		
		
		//to check null condition
//		Map<String,Employee>maps = (Map<String,Employee>)in.readObject();
//		if(maps.isEmpty())
//		throw new EmoloyeeHandlingException(" file is empty");	
		
	}
	
	
	

}
