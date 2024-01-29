package serviceimpl;

import service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	Scanner s1 = new Scanner(System.in);
	
	ArrayList<Employee> l1=new ArrayList<Employee>();

	@Override
	public void addEmp() {

		System.out.println("+++++++Enter Employee Details+++++++");
		System.out.println("Enter Employee id:-");
		int eid=s1.nextInt();
		System.out.println("Enter Employee Name:-");
		String ename=s1.next();
		System.out.println("Enter Employee Designation");
		String edesignation=s1.next();
		System.out.println("Enter Employee Salary");
		double esal=s1.nextDouble();
		System.out.println("Enter Employee Phone Number");
		long ephno=s1.nextLong();
		System.out.println("Enter Employee Age");
		int eage=s1.nextInt();
		l1.add(new Employee(eid,ename,edesignation,esal,ephno,eage));
		System.out.println("Employee Added Succesfully..!!!");
	}
	@Override
	public void getAllEmp() {
		System.out.println("+++++++Enter Employee Details+++++++");
		if(l1.size()==0) { //l1.isEmpty();
			System.out.println("No Employees Yet !!!");
		}
		else {
			for(Employee ele:l1) {
				System.out.println(ele);
			}
		}
	}
	@Override
	public Employee getEmpByEId(int n) {
		boolean flag=false;
			for(Employee ele:l1) {
				if(ele.getEid()==n) {
					flag=true;
					return ele;
				}
			}
		if(flag==false) {
			System.err.println("Invalid ID, Employee not found !!! ");
		}
		return null;
	}
	@Override
	public void getEmpByRangeSal() {
		boolean flag=false;
		System.out.println("Please enter salary starting range");
		double lowRange=s1.nextDouble();
		System.out.println("Please enter salary Ending range");
		double highRange=s1.nextDouble();
		for(Employee ele:l1) {
			if(ele.getEsal()>=lowRange && ele.getEsal()<=highRange) {
				System.out.println(ele);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Such Employees Found");
		}
	}
	@Override
	public void getEmpBySal() {
		boolean flag=false;
		System.out.println("Please enter salary");
		double sal=s1.nextDouble();
		for(Employee emp: l1) {
			if(sal==emp.getEsal()) {
				System.out.println(emp);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Such Employees found");
		}
	}
	
	public void getEmpByDesignation() {
		boolean flag=false;
		System.out.println("Please enter Designation");
		String designation=s1.next();
		for(Employee emp: l1) {
			if(designation==emp.getEdesignation()) {
				System.out.println(emp);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Such Employees found");
		}
		
	}
	
	public void getEmpByAge() {
		boolean flag=false;
		System.out.println("Please enter Age");
		int age=s1.nextInt();
		for(Employee emp: l1) {
			if(age==emp.getEage()) {
				System.out.println(emp);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Such Employees found");
		}
		
	}
	
	public void getEmpByPhone() {
		boolean flag=false;
		System.out.println("Please enter Phone Number");
		long phone=s1.nextLong();
		for(Employee emp: l1) {
			if(phone==emp.getEphno()) {
				System.out.println(emp);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Such Employees found");
		}
		
	}
	
	public void getEmpByName() {
		boolean flag=false;
		System.out.println("Please enter Name");
		String name=s1.next();
		for(Employee emp: l1) {
			if(name==emp.getEname()) {
				System.out.println(emp);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("No Such Employees found");
		}
	}
	
	public void updateEmpByEId() {

		System.out.println("Please Enter the id whose details needs to updated ");
		int n=s1.nextInt();
		Employee e=getEmpByEId(n);
		System.out.println("+++++++++++ UPDATE MENU ++++++++++++");
		System.out.println("1.Name\n2.Designation\n3.Salary\n4.Phone Number\n5.Age");
		System.out.println("Please Select the field to be updated");
		int op=s1.nextInt();
		
		switch(op) {
			case 1: System.out.println("Please enter the name");
					String name=s1.next();
					e.setEname(name);
					break;
			case 2: System.out.println("Please enter the Designation");
					String desig=s1.next();
					e.setEdesignation(desig);
					break;
			case 3: System.out.println("Please enter the salary");
					double sal=s1.nextDouble();
					e.setEsal(sal);
					break;
			case 4: System.out.println("Please enter the Phone number");
					long phno=s1.nextLong();
					e.setEphno(phno);
					break;
			case 5: System.out.println("Please enter the age");
					int age=s1.nextInt();
					e.setEage(age);
					break;
			default:System.err.println("Invalid choice");
					break;
		}
	}
	
	public void removeEmpByEId() {
		System.out.println("Please Enter the id whose details needs to REMOVED ");
		int n=s1.nextInt();
		Employee e=getEmpByEId(n);
		l1.remove(e);
		System.out.println("Employee has been removed!!!");
	}

}
