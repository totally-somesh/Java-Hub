package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;

import com.app.emp.Department;
import com.app.emp.Employee;
import com.app.exception.EmoloyeeHandlingException;

public interface ValidateRules {
//
	
	static Employee validateAllInputs(String id, String firstName, String lastName, String dept, String jdate,
			double salary, Map<String, Employee> maps) throws EmoloyeeHandlingException {
		LocalDate dob = parseAndValidateDate(jdate);
		Department deptName = parseAndValidateDepartment(dept);

		return new Employee(id, firstName, lastName, deptName, dob, salary);
	}

	static LocalDate parseAndValidateDate(String date) throws EmoloyeeHandlingException {
		LocalDate d = LocalDate.parse(date);
		int years = Period.between(d, LocalDate.now()).getYears();
		if (years > 3)
			throw new EmoloyeeHandlingException("company shold be three years old");

		return d;

	}

	static Department parseAndValidateDepartment(String dept) {
		return Department.valueOf(dept.toUpperCase());
	}


	static String checkForDuplicate(String id, Map<String, Employee> maps) throws EmoloyeeHandlingException {
		if (maps.containsKey(id))
			throw new EmoloyeeHandlingException("duplicate empid");
		return id;
	}



}
