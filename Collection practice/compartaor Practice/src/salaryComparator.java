import java.util.Comparator;
public class salaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
	
		return (int) ((int) o1.salary-o2.salary);
	}

}
