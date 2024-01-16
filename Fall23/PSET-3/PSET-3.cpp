#include <iostream>
#include <iomanip>

using namespace std;

int main()
{
	double actualValue;
	double assessmentValue;
	double propertyTax;
	
	cout << "Enter the actual value of the property: ";
	cin >> actualValue;
	cout << "\n";

	assessmentValue =  actualValue * 0.6;
	propertyTax = (assessmentValue / 100) * 0.75;

	cout << setprecision(2) << fixed;
	cout << "Assessment Value: $"<< assessmentValue << endl;
	cout << "Property Tax: $" << propertyTax << endl;

	return 0;
}