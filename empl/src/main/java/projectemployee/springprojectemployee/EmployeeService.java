package projectemployee.springprojectemployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import antlr.collections.List;

import java.util.ArrayList;

@Service 
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeerepository;
	
	
	
	private ArrayList<EmployeeModule> emp = new ArrayList<>(Arrays.asList(
			new EmployeeModule("a",1),
			new EmployeeModule("b",2)
			
			));
 	
 	//get list of all Employee
	public ArrayList<EmployeeModule> getAllEmployee()
	{
		
		ArrayList<EmployeeModule> emp= new ArrayList<>();
		employeerepository.findAll()
		.forEach(emp::add);
		return emp;
//	List emp1  = (List)employeerepository.findAll();
	     
	
	}
	
	

	//get employee by id
	public Object getEmployee(int id)
	{
		return employeerepository.findById(id);
	}
	
	//add employee
	public void addEmployee(EmployeeModule emp)
	{
		employeerepository.save(emp);
		
	}
	
	//update employee
	public void updateEmployee(EmployeeModule emp,int id)
	{
		if(id==emp.getEmployeeId())
		{	employeerepository.save(emp);
			}
	}
	
	//delete all employee
	public void deleteAllEmployee()
	{
		employeerepository.deleteAll();
	}
	
	//delete employee by id 
	public void deleteEmployeeById(int id)
	{
		employeerepository.deleteById(id);
	}
	
	//patch/update employee
	public Object patchEmployeeById(EmployeeModule emp,int id)
	{
		if(id==emp.getEmployeeId()) {
			employeerepository.save(emp);
		}
		return id;
	}
	
}

	

