#include <iostream>

using namespace std;

int main()
{
	double actualValue;
	double assessmentValue;
	double propertyTax;
	
	std::cout << "Enter the actual value of the property: ";
	std::cin >> actualValue;
	std::cout << "\n";

	assessmentValue =  actualValue * 0.6;
	propertyTax = (assessmentValue / 100) * .075;

	std::cout << "Assessment Value: "<< cout.precision(2) << fixed << assessmentValue << std::endl;
	std::cout << "Property Tax: $" << cout.precision(2) << fixed << propertyTax << std::endl;
	return 0;
}