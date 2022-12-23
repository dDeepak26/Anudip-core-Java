class Employeeprac1
{ 
	int empid;
	String empname;
	double empsal;
	
	static int count = 0;
	
	public  void details(int empid, String empname, double empsal) 
	{
		this.empid = empid;
		this.empname = empname;
		this.empsal = empsal;			
		count++;
	}
	public  void display() 
	{
		System.out.println("Employee ID: " + empid);
		System.out.println("Employee Name: " + empname);
		System.out.println("Employee Salary: " + empsal);
	}

}
class UseEmployeeprac1
{
	public static void main(String args[])
	{
		Employeeprac1 e = new Employeeprac1();
	    e.details(101, "thor", 15000.00);
		e.display();
		System.out.println();
		e.details(101, "hulk", 18000.00);
		e.display();
		System.out.println();
		e.details(101, "stark", 1622827.28);
		e.display();


		System.out.println(Employeeprac1.count);
		
	}
}