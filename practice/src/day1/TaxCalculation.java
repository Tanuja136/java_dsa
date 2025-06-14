package day1;

import java.util.Scanner;
/*
 Algorithm :
		First we have read the corresponding inputs.
		Level 1 :
			call the all argument constructor
			if location == cosmopolitin :
				HRA = (15 / 100) * EmployeeSalary
			else if location == semi urban :
				HRA = (10 / 100)* EmployeeSalary
			else
				HRA = (5 / 100)* EmployeeSalary
				
			monthlyBonus = (20 / 100 )* EmployeeSalary
			DA = (12 / 100)*EmployeeSalary
			
			MonthlySalaryWithoutBonus = HRA + DA + EmployeeSalary
			MonthlyGrossSalary = MonthlySalaryWithoutBonus + monthlyBonus
			AnnualGrossSalary = MonthlyGrossSalary * 12
			BonusEarnedForTheYear = monthlyBonus*12
 */

class Calculator {
	public float Level1(String EmployeeName,String LocationName,String EmployeeDesignation,float EmployeeSalary){
		float HRA = 0.0f;
		
		if (LocationName.equalsIgnoreCase("cosmopolitin")) {
			HRA =  (15.0f / 100) * EmployeeSalary;
		}
		else if (LocationName.equalsIgnoreCase("semi urban")) {
			HRA =  (10.0f / 100) * EmployeeSalary;
		}
		else if (LocationName.equalsIgnoreCase("rural")) {
			HRA =  (5.0f / 100) * EmployeeSalary;
		}
		else {
			System.out.println("Invalid location name");
		}
		
		float monthlyBonus = (20.0f / 100 )* EmployeeSalary;
		float DA = (12.0f / 100) * EmployeeSalary ; 
		
		float MonthlySalaryWithoutBonus = HRA + DA + EmployeeSalary ;
		float MonthlyGrossSalary = MonthlySalaryWithoutBonus + monthlyBonus;
		float AnnualGrossSalary = MonthlyGrossSalary * 12 ;
		float BonusEarnedForTheYear = monthlyBonus * 12;
		
		System.out.println("Employee Details");
		System.out.println("Name of the Employee : " + EmployeeName);
		System.out.println("Location of the Employee : " + LocationName);
		System.out.println("Designation of the Employee : " + EmployeeDesignation);
		System.out.println("Basic Salary of the Employee : " + EmployeeSalary);
		System.out.println("-----------------------------------------");
		System.out.println("Monthly Salary Without Bonus : " + MonthlySalaryWithoutBonus);
		System.out.println("Monthly Gross Salary : " + MonthlyGrossSalary);
		System.out.println("Annual Gross Salary : " + AnnualGrossSalary);
		System.out.println("Bonus Earned For the Year : " + BonusEarnedForTheYear);
		
		return BonusEarnedForTheYear;
		
	}
}

public class TaxCalculation {

	public static void main(String[] args) {
		String EmployeeName = "";
		String LocationName = " ";
		String EmployeeDesignation = "";
		float EmployeeSalary = 0.0f;
		float IncomeTax = 0.0f;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the Employee Name :");
		EmployeeName = scanner.nextLine();
		System.out.print("Enter the Location Name (cosmopolitin / semi urban / rural) :");
		LocationName = scanner.nextLine();
		System.out.print("Enter the Employee Designation :");
		EmployeeDesignation = scanner.nextLine();
		System.out.print("Enter the Employee Salary :");
		EmployeeSalary = scanner.nextFloat();
		
		Calculator calculator = new Calculator();
		calculator.Level1(EmployeeName, LocationName, EmployeeDesignation, EmployeeSalary);
		calculator.Level2(IncomeTax);

	}

}
