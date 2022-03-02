
public class Employee {

	int eno;
	String ename;
	double sal;
	boolean flag;
	long mobileNumber;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee emp = new Employee ();	
	System.out.println(emp.eno+"\t"+emp.ename);
	emp.eno = 100;
	emp.ename = "Rai";
	System.out.println(emp.eno+"\t"+emp.ename);

	}
}
