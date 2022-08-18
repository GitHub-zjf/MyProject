package s0690;

import java.util.List;

class Employee {
	public int id;
	public int importance;
	public List<Integer> subordinates;

	public Employee() {

	}

	public Employee(int id, int importance, List<Integer> subordinates) {
		this.id = id;
		this.importance = importance;
		this.subordinates = subordinates;
	}
};