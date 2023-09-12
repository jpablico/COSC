#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

	double loanAmount;
	double annualPercentageRate;
	double durationOfLoan;

	double durationOfLoanYear = durationOfLoan / 12;
	double rate = (annualPercentageRate / 100) / 12;

	double b = (1 + rate);
	double e = (double) durationOfLoan;

	double pow = (double b, double e);

	double Payment;

	cout.precision(2);
	cout << "Loan amount: $";
	cin >> loanAmount;
	cout << "\n" << "Annual Interest Rate: ";
	cin >> annualPercentageRate; 
	cout << "% \n";
	cout << "Number of Payments: ";
	cin >> durationOfLoan;
	cout << "\n Monthly Payment: $";
	


	return 0;
}