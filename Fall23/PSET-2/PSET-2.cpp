#include <iostream>

using namespace std;

int main() 
{
    double meal;
    double total;
    double tax = 0.0675;
    double tip = 0.2;
    
    std::cout << "Enter meal cost: ";
    std::cin >> meal;
    
    double taxed = meal * tax;
    double tipped = taxed * tip;
    total = meal + taxed + tipped;
	
    std::cout.precision(3);
    std::cout << "Meal cost: " << meal <<std::endl;
    std::cout << "Taxed amount: " << taxed <<std::endl;
    std::cout << "Tipped amount: " << tipped <<std::endl;
    std::cout << "Total amount: " << total <<std::endl;
    return 0;
}