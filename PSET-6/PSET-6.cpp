#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

	const double carbonDioxide = 258.0;
	const double air = 331.5;
	const double helium = 972.0;
	const double hydrogen = 1270.0;

	string selection;

	cout << "Menu of Gases" << endl;
	cout << "A. Carbon Dioxide" << endl;
	cout << "B. Air" << endl;
	cout << "C. Heliulm" << endl;
	cout << "D. Hydrogen" << endl;

	cout << "\nPlease choose one of the gases: ";
	cin >> selection;
	cout << endl;

	switch(selection) {

	}
	return 0;
}