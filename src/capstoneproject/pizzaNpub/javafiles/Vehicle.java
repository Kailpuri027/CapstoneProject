package capstoneproject.pizzaNpub.javafiles;

public class Vehicle {
	protected int vehicle_id;
	protected int reg_no;
	
	public Vehicle(int vehicle_id, int reg_no) {
		super();
		this.vehicle_id = vehicle_id;
		this.reg_no = reg_no;
	}
	
	public Vehicle(int reg_no) {
		super();
		this.reg_no = reg_no;
	}
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public int getReg_no() {
		return reg_no;
	}
	public void setReg_no(int reg_no) {
		this.reg_no = reg_no;
	}
	
}
