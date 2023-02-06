package bank;
class Loan {

	int accountNumber;
	double accountBalance;
	double salary;
	String loanType;
	double loanAmount;
	double Emi;
	public Loan(int accountNumber, double accountBalance, double salary, String loanType, double loanAmount,double Emi) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.salary = salary;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.Emi = Emi;
		
}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getLoneType() {
		return loanType;
	}
	public void setLoneType(String loneType) {
		this.loanType = loneType;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmountAxpected(double loanAmountAxpected) {
		this.loanAmount = loanAmountAxpected;
	}
	public double getEmi() {
		return Emi;
	}
	public void setNoOfEmiExpected(double Emi) {
		this.Emi = Emi;
	}
	public void Conditions(){
	if(accountNumber>999&&accountNumber<2000)

	{
		if (accountBalance >= 1000) {
			if (salary > 25000 && loanType == "Car") {

				if (Emi <= 36 && loanAmount <= 500000) {
					System.out.println("Account number:" + accountNumber);
					System.out.println("Eligible loan amount:" + 5000000);
					System.out.println("Eligible EMIs :" + 36);
				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}
		} else if (accountBalance >= 1000) {
			if (salary > 50000 && loanType == "House") {

				if (Emi<= 60 && loanAmount <= 6000000) {
					System.out.println("Account number:" + accountNumber);
					System.out.println("The customer can avail the amount of Rs." + loanAmount);
					System.out.println("Eligible EMIs :" + 60);
					System.out.println("Requested loan amount:" + 6000000);
					System.out.println("Requested EMI's:" + Emi);
				} else {
					System.out.println("The customer is not eligible for the loan");
				}
			}
		} else if (accountBalance >= 1000) {
			if (salary > 75000 && loanType == "Business") {

				if (Emi <= 80 && loanAmount <= 7500000) {
					System.out.println("Account number:" + accountNumber);
					System.out.println("Eligible loan amount:" + 6000000);
					System.out.println("Eligible EMIs :" + 60);	
				}
				else 
				{
					System.out.println("The customer is not eligible for the loan");
				}
			}
		}
	}
	else
	{
		System.out.println("Invalid account number");
	}
	}
	}
public class customer{
	public static void main(String[] args) {
		Loan Customer=new Loan(1001,40000,250000,"Car",300000,30);
		Customer.Conditions();
	
	}
}