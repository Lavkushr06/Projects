package controller;
import java.util.Scanner;

import service.EmployeeService;
import serviceimpl.EmployeeServiceImpl;


public class EmployeeApp {

	public static void main(String[] args) {
		EmployeeService e=new EmployeeServiceImpl();
		Scanner s=new Scanner(System.in);
		System.out.println("====Welcome to Employee DB====");
		while(true) {
			System.out.println("========Menu=========");
			System.out.println("1.Add Employee\n2.Display All Employee Details"
					+ "\n3.Search Employee by ID"
					+ "\n4.Search Employee by Salary range"
					+"\n5.Search Employee by Salary"
					+"\n6.Search Employee by Designation"
					+"\n7.Search Employee by Age"
					+"\n8.Search Employee by Phone Number"
					+"\n9.Search Employee by Name"
					+ "\n10.Update employee details using ID"
					+ "\n11.Remove Employee detials using ID"
					+ "\n12.Exit");
			System.out.println("Please enter your option");
			int op=s.nextInt();
			switch(op) {
				case 1: e.addEmp();
						break;
				case 2: e.getAllEmp();
						break;
				case 3: System.out.println("Enter Employee ID");
						int n=s.nextInt();
						System.out.println(e.getEmpByEId(n));
						break;
				case 4: e.getEmpByRangeSal();
						break;
				case 5: e.getEmpBySal();
						break;
				case 6: e.getEmpByDesignation();
						break;
				case 7: e.getEmpByAge();
						break;
				case 8: e.getEmpByPhone();
						break;
				case 9: e.getEmpByName();
						break;
				case 10: e.updateEmpByEId();
						break;
				case 11: e.removeEmpByEId();
						break;		
				case 12: System.out.println("Thank you Visit Again");
						s.close();
						System.exit(0);
				default: System.err.println("Invalid Option");
			}
		}
	}
}