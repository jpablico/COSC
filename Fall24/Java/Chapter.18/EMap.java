import java.util.*;

public class EMap {
	private List<Employee> employees;

	public EMap() {
		employees = new ArrayList<Employee>();
	}

	public void addEmployee(Employee employee) {
		employees.add(employee);
	}

	public Employee getEmployee(int id) {
		for (Employee employee : employees) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}
}
