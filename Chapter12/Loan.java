




/*12.4 (IllegalArgumentException) Modify the Loan class in Listing 10.2 tothrow IllegalArgumentException if the loan amount, interest rate, ornumber of years is less than or equal to zero.*/package Chapter12;public class Loan { private double annualInterestRate; private int numberOfYears; private double loanAmount; private java.util.Date loanDate; public Loan() { this(2.5,1,1000); } public Loan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException{ setAnnualInterestRate(annualInterestRate); setLoanAmount(loanAmount); setNumberOfYears(numberOfYears); loanDate = new java.util.Date(); } public double getAnnualInterestRate() { return annualInterestRate; } public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException{ if(annualInterestRate>0){ this.annualInterestRate = annualInterestRate; }else{ throw new IllegalArgumentException("Interest rate cannot be negative."); } } public int getNumberOfYears() { return numberOfYears; } public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException{ if(numberOfYears>0){ this.numberOfYears = numberOfYears; }else{ throw new IllegalArgumentException("Number of Years cannot be negative."); } } public double getLoanAmount() { return loanAmount; } public void setLoanAmount(double loanAmount) throws IllegalArgumentException{ if(loanAmount>0){ this.loanAmount = loanAmount; }else{ throw new IllegalArgumentException("Loan amount cannot be negative"); } } public double getMonthlyPayment() { double monthlyInterestRate = annualInterestRate / 1200; double monthlyPayment = loanAmount * monthlyInterestRate / (1 -(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12))); return monthlyPayment; } public double getTotalPayment() { double totalPayment = getMonthlyPayment() * numberOfYears * 12; return totalPayment; } public java.util.Date getLoanDate() { return loanDate; } public static void main(String[] args){ try{ Loan loan1 = new Loan(2.5, 1, -1000); } catch(IllegalArgumentException ex){ System.out.println(ex.getMessage()); } }} 