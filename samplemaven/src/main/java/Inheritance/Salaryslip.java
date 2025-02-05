package Inheritance;

public class Salaryslip extends Salarycomponants {
	double Totalsalary;
	public void calculatesalary()
	{
		Totalsalary=Basicpay+HRA-PF-deduction+bonus;	
			
	}
	public void salaryslip()
	{
		System.out.println("Salaryslip");
		System.out.println("------------");
		System.out.println("Basic payment :"+Basicpay);	
		System.out.println("HRA :"+HRA);
		System.out.println("PF :"+PF);
		System.out.println("Deduction :"+deduction);
		System.out.println("Bonus :"+bonus);
		System.out.println("total Salary :"+ Totalsalary);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Salaryslip obj=new Salaryslip();
		obj.calculate();
		obj.calculatesalary();
		obj.salaryslip();

	}

}
