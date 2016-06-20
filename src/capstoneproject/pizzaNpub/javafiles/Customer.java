package capstoneproject.pizzaNpub.javafiles;

public class Customer {
	
	protected int customer_id;
	protected String customer_name;
	protected String customer_address_id;
	protected String customer_phone;
	
	public Customer(int customer_id, String customer_name,
			String customer_address_id, String customer_phone) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_address_id = customer_address_id;
		this.customer_phone = customer_phone;
	}
	
	public Customer(String customer_name, String customer_address_id,
			String customer_phone) {
		super();
		this.customer_name = customer_name;
		this.customer_address_id = customer_address_id;
		this.customer_phone = customer_phone;
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_address_id() {
		return customer_address_id;
	}
	public void setCustomer_address_id(String customer_address_id) {
		this.customer_address_id = customer_address_id;
	}
	public String getCustomer_phone() {
		return customer_phone;
	}
	public void setCustomer_phone(String customer_phone) {
		this.customer_phone = customer_phone;
	}
}
