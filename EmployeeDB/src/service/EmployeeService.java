package service;

import entity.Employee;

public interface EmployeeService {
	
	void addEmp();
	void getAllEmp();
	Employee getEmpByEId(int n);
	void getEmpByRangeSal();
	void getEmpBySal();
	void getEmpByDesignation();
	void getEmpByAge();
	void getEmpByPhone();
	void getEmpByName();
	void updateEmpByEId();
	void removeEmpByEId();
}
