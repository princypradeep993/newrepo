package Inheritance;

public class Salarycomponants extends Employeedetails {
 double HRA;
 double PF;
public void calculate()
{
	HRA=0.05*Basicpay;
	PF=0.20*Basicpay;
}
}
