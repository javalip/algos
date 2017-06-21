package practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.id=1;
		Employee employee2 = new Employee();
		employee2.id=2;
		Employee employee3= new Employee();
		employee3.id=3;
		Employee employee4 = new Employee();
		employee4.id=4;
		Employee employee5= new Employee();
		employee5.id=5;
		
		
		
	List<Employee> employeeList = new ArrayList(); 
	employeeList.add(employee2);
	employeeList.add(employee);
	employeeList.add(employee3);
	employeeList.add(employee4);
	employeeList.add(employee5);
	System.out.println("BeforeSorting");
	for(int i=0;i<employeeList.size();i++){
		System.out.println(employeeList.get(i).id);
		
	}
	Collections.sort(employeeList);
	System.out.println("AfterSorting");
	for(int i=0;i<employeeList.size();i++){
		System.out.println(employeeList.get(i).id);
	}
	System.out.println("AfterReverseSorting");
	Comparator comp = Collections.reverseOrder();
	Collections.sort(employeeList, comp);
	for(int i=0;i<employeeList.size();i++){
		System.out.println(employeeList.get(i).id);
	}
	
	 

	
	}
	
	
	

	@Override
	public int compareTo(Employee employee) {
		if(this.id<employee.id){
			return -1;
		}else if (this.id>employee.id){
			return 1;
		}else{
			return 0;
		}
		
	}
	
	
	
	
	


}
