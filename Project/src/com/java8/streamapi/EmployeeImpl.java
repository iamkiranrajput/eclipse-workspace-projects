package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeImpl {
	public static void main(String[] args) {
		
		List<Integer> ar=Arrays.asList(null);
		System.out.println(ar);
		
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(111,"Karn",8963.34));
		emp.add(new Employee(222,"Veer",2324.11));
		emp.add(new Employee(333,"Shiv",7856.45));
		emp.add(new Employee(444,"Krishn",9834.87));
		emp.add(new Employee(555,"Dev",7865.65));

		
		List<Employee> eList=emp.stream().filter(e->e.eSalary<8400).collect(Collectors.toList());
		List<Employee> eList2=  emp.stream().filter(e->e.eSalary>1212).toList();
		
		List<Employee> startsWith=emp.stream().filter(e->e.geteName().toLowerCase().startsWith("k")).toList();
		System.out.println("Starts with K :"+startsWith);
		
		System.out.println("Emplloyee List 2 "+eList2);
		System.out.println(eList);
		for(Employee e:eList) {
			System.out.println(e.geteName());
//			System.out.println(e.geteId());
//			System.out.println(e.eSalary);
		}
		
		Iterator<Employee> Iter=eList.iterator();
		
		while(Iter.hasNext()) {
			System.out.println(Iter.next());
		}
		
		
	}
}
