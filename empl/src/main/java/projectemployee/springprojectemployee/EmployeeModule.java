package projectemployee.springprojectemployee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeModule {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	public EmployeeModule() {
		
	}
	
	public EmployeeModule(String name, int id) {
		super();
		this.id = id;
		this.name = name;		
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return id;
	}

	public void setEmployeeId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString(){
		return String.format("Employee [id = %d, name = %s, id, name]");
	}

}
