package projectemployee.springprojectemployee;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;


@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeservice;
	
	@GetMapping("/Hi")
	public String HI()
	{
	return "Hi";
	}
	
	//get all employee data
	@GetMapping("/employees")
	public ArrayList<EmployeeModule> getAllEmployee()
	{
		return  employeeservice.getAllEmployee();
	}
	
	//get employee by id 
	@GetMapping("/employees/{id}")
	public EmployeeModule getEmployee(@PathVariable int id)
	{
		return (EmployeeModule) employeeservice.getEmployee(id);
	}
 
	//add employee
	@PostMapping("/employees")
	public  void addEmployee(@RequestBody EmployeeModule employee)
	{
		employeeservice.addEmployee(employee);
	}
	
	//update employee
	@PutMapping("/employees/{id}")
	public void updateEmployee(@RequestBody EmployeeModule employee,@PathVariable int id)
	{
		employeeservice.updateEmployee(employee, id);
	}
	
	//delete employee
	@DeleteMapping("/employees")
	public void deleteEmployee()
	{
		employeeservice.deleteAllEmployee();
	}
	
	//delete employee by id
	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable int id)
	{
		employeeservice.deleteEmployeeById(id);
		
	
	}
	
	
	//update employee by id
	@PatchMapping("/employees/{id}")
	public Object patchEmployeeById(@RequestBody EmployeeModule employee,@PathVariable int id)
	{
		return employeeservice.patchEmployeeById(employee, id);
	}
}
