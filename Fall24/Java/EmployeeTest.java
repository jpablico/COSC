import java.util.*;

public class EmployeeTest {
	
	public static void main(String[] args) {
		
		EMap employees = new EMap();
		Employee e1 = new Employee("Josh", 1);
		Employee e2 = new Employee("Joshua", 2);
		Employee e3 = new Employee("Jash", 3);

		employees.addEmployee(e1);
		employees.addEmployee(e2);
		employees.addEmployee(e3);

		Scanner kbd = new Scanner(System.in);
		EmployeeTest.findEmployeeById(kbd, employees);
	}

	public static void findEmployeeById(Scanner kbd, EMap employees) {
	    System.out.println("Enter an employee ID: ");
	    String input = kbd.nextLine();

	    Employee foundEmployee = employees.getEmployee(Integer.parseInt(input));
	    kbd.close();
	    if (foundEmployee != null) {
	        System.out.println("Employee found: " + foundEmployee);
			return;
	    }
	}
}
