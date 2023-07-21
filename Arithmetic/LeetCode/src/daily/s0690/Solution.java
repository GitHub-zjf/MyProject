package daily.s0690;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public int getImportance(List<Employee> employees, int id) {
		int result = 0;
		for (Employee employee : employees) {
			if (id == employee.id) {
				result += employee.importance;
				List<Integer> subordinates = employee.subordinates;
				if (subordinates.size() > 0) {
					for (int tempId : subordinates) {
						result += getImportance(employees, tempId);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Employee root = new Employee(1, 5, Arrays.asList(2, 3));
		Employee sub1 = new Employee(2, 3, new ArrayList<Integer>());
		Employee sub2 = new Employee(3, 3, new ArrayList<Integer>());
		
		List<Employee> employees = new ArrayList<>();
		employees.add(root);
		employees.add(sub1);
		employees.add(sub2);
		
		System.out.println(new Solution().getImportance(employees, 1));
	}
}