package pcg.aggregation;

public class Address {

	private String streetName,city,state;
	private int houseNo;
	private Student stObj;
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public Student getStObj() {
		return stObj;
	}
	public void setStObj(Student stObj) {
		this.stObj = stObj;
	}
	
	public void display()
	{
		System.out.println("Name:"+getStObj().getName());
		System.out.println("Id: "+stObj.getRollNo());//if no encpsulation established, call without getter method using the object.
		System.out.println("House No: "+houseNo);
		System.out.println("Street Name: "+streetName);
		System.out.println("State: "+getState());
	}
	

}
