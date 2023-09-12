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
	cin >> interestRate;
	cin >> numberOfPayments;

	double interestRateMonthly = (interestRate / 100.0) / 12;
	double onePlusRate = pow(1 + interestRateMonthly, numberOfPayments);
	double payment = loanAmount * (( interestRateMonthly * onePlusRate ) / (onePlusRate - 1));
	double paymentLoan = payment * numberOfPayments;
	cout << setprecision(2) << fixed;
	cout << "Interest rate: "<< interestRateMonthly << endl;
	cout << "1+r "<<onePlusRate << endl;
	cout << "Payment " <<  payment << endl;
	cout << "Total " << paymentLoan;
	return 0;
}