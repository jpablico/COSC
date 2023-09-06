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
	propertyTax = (assessmentValue / 100) * 0.75;

	std::cout << fixed << cout.precision(2);
	std::cout << "Assessment Value: $"<< assessmentValue << std::endl;
	std::cout << "Property Tax: $" << propertyTax << std::endl;
	return 0;
}