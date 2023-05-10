package com.app.tester;

import static utils.ValidateRules.validateAllInputs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static utils.Employee_io.store;
import static utils.Employee_io.restore;
import com.app.emp.Employee;

public class TesterEmployee {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			Map<String, Employee> maps = new HashMap<>();
			boolean exit = false;

			try {				
				while (!exit) {
					System.out.println("1.add employee 2.display employee");
					System.out.println("enter choice");
					switch (sc.nextInt()) {
					case 1:
						System.out.println("please enter empid,fname,lname,dept,jdate,salary");
						Employee e=validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(), maps);
						maps.put(e.getId(), e);
						System.out.println("employee added");
						System.out.println("enter file name");
						store(sc.next(),maps);
						break;
					case 2:
						
						System.out.println("enter file name");
						Map<String, Employee> map = restore(sc.next());
						map.values().forEach(v -> System.out.println(v));
						
						break;
					case 0:
						exit = true;

					}//switch

				}//while

			} catch (Exception e) {
				e.printStackTrace();
			}//try with res

		}
	}

	

}
