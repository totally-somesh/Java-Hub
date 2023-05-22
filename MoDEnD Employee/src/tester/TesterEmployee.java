package tester;

import static utils.IOutils.restore;
import static utils.IOutils.store;
import static utils.ValidationRulesEmployee.validateAllInputs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.app.core.Employee;

public class TesterEmployee {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			Map<Integer, Employee> maps = new HashMap<>();
			boolean exit = false;
			System.out.println("enter filename ");
			String s = sc.next();

			while (!exit) {
				System.out.println(
						"0.exit,1.Add Employees,2.display Emp,3.display specific emp details,4.remove emp by id,5.natural sorting,6.custom sorting"
								+ "7.restore file");

				try {
					System.out.println("enter choice");
					switch (sc.nextInt()) {

					case 1:// add employees
							// int empId, String email, String salary, LocalDate joiningDate, Department
							// dept
						System.out.println("enter empId | email | salary | joiningdate | department");
						Employee e = validateAllInputs(sc.nextInt(), sc.next(), sc.nextDouble(), sc.next(), sc.next(),
								maps);
						maps.put(e.getEmpId(), e);
						store(s, maps);
						break;
					case 2:// display employees
						maps.values().stream().forEach(p -> System.out.println(p));

						break;
					case 3:// display specific emp details
						System.out.println("enter empId you want to display");
						int id = sc.nextInt();
//						List<Employee> s1=new ArrayList<Employee>(maps.values());
//						if(Map.Entry<Integer,Employee>e:maps.values())
//						{
//							
//						}
						maps.values().removeIf(p->p.getEmail().equalsIgnoreCase(sc.next()));
						store(s, maps);
						
						
						for(Employee c:maps.values())
						{
							if(c.getEmail().equalsIgnoreCase(s))
{
								c.setEmail(s);
							}
						}
//						else
//							throw new EmployeeHandlingException("empid is invalid");

						break;
					case 4:// remove emp bby id
						System.out.println("enter empid u want to remove");
						int id1 = sc.nextInt();
						if (maps.containsKey(id1))
							maps.remove(id1);
						System.out.println("employee removed");
						break;
					case 5:// natural sorting
						maps.values().stream().sorted().forEach(p->System.out.println(p));
						break;
					case 6:// custom sorting
						System.out.println("sorted list of employees according to date");
						maps.values().stream().sorted((e1, e2) -> (e1.getJoiningDate().compareTo(e2.getJoiningDate())));
						break;
					case 7:// restore
						System.out.println("enter file name u want to restore ");
						String s1 = sc.next();
						Map<Integer, Employee> maps1 = restore(s1);
						System.out.println("file restored");
						maps1.values().stream().forEach(p -> System.out.println(p));
						break;
					case 0:
						exit = true;
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}
	}

	// 11 prajyot@123 10000 2020-01-01 HR
	// 12 mohit@123 12000 2020-03-01 rnd
	// 13 shubs@123 10030 2020-06-01 sales
	// 14 omya@123 10330 2020-02-01 production
	// 15 somesh@123 60000 2020-09-01 HR
}
