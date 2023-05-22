package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;

import com.app.core.Department;
import com.app.core.Employee;

import exception.EmployeeHandlingException;

public class ValidationRulesEmployee {
//int empId, String email, String salary, LocalDate joiningDate, Department dept
	public static Employee validateAllInputs(int empId,String email,Double salary,String joiningDate,String dept,Map<Integer,Employee>maps) throws EmployeeHandlingException
	{
		Department d1= parseAndValidateDepartment( dept);
		 LocalDate parsedDate = parseAndValidateDate( joiningDate); 
		 checkForDuplicates( empId,maps);
		 return new Employee(empId, email,salary,parsedDate,d1);
	}
	
	
	
	public static Department parseAndValidateDepartment(String dept) {
		return Department.valueOf(dept.toUpperCase());
	}
	
	public static LocalDate parseAndValidateDate(String date) throws EmployeeHandlingException {
		LocalDate date1=LocalDate.parse(date);
		int difference=Period.between(date1, LocalDate.now()).getYears();
		if(difference>5)
			throw new EmployeeHandlingException("you r not eligible date expired");
		return date1;
	}
	
	public static void checkForDuplicates(int id,Map<Integer,Employee>maps) throws EmployeeHandlingException {
	    if(maps.containsKey(id))
	    	throw new EmployeeHandlingException("duplicate employee id,you r not allowed");
	}
}
