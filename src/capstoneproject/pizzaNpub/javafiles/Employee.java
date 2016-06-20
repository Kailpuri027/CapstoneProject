package capstoneproject.pizzaNpub.javafiles;

public class Employee {
	protected int emp_id;
	protected String emp_name;
	protected String emp_phone;
	
	public Employee(int emp_id, String emp_name, String emp_phone) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_phone = emp_phone;
	}
	public Employee(String emp_name, String emp_phone) {
		super();
		this.emp_name = emp_name;
		this.emp_phone = emp_phone;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_phone() {
		return emp_phone;
	}
	public void setEmp_phone(String emp_phone) {
		this.emp_phone = emp_phone;
	}	
}
