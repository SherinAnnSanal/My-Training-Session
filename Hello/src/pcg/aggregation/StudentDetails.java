package pcg.aggregation;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		Address obj2=new Address();
		obj1.setName("Sherin");
		obj1.setRollNo(10001);
		obj2.setStreetName("Pathanamthitta");
		obj2.setState("Kerala");
		obj2.setHouseNo(22);
		obj2.setStObj(obj1);
		obj2.display();
		

	}

}
