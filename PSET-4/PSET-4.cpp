#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
	double loanAmount;
	double interestRate;
	double numberOfPayments;

	cout << "Loan Amount: ";
	cin >> loanAmount;
	cout << "Annual Interest Rate: ";
	cin >> interestRate;
	cout << "Number of Payments: ";
	cin >> numberOfPayments;

	double interestRateMonthly = (interestRate / 100.0) / 12;
	double onePlusRate = pow(1 + interestRateMonthly, numberOfPayments);
	double payment = loanAmount * (( interestRateMonthly * onePlusRate ) / (onePlusRate - 1));
	double paymentLoan = payment * numberOfPayments;
	double interestPaid = paymentLoan - loanAmount;

	cout << setprecision(2) << fixed;
	cout << "Monthly Payment: $" << payment << endl;
	cout << "  Amount Paid Back: $" << paymentLoan << endl;
	cout << "  Interest Paid: $" << interestPaid << endl;

	return 0;
}