#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {

	const double carbonDioxide = 258.0;
	const double air = 331.5;
	const double helium = 972.0;
	const double hydrogen = 1270.0;

	int selection;
	double time;
	double meters;

	cout << "Menu of Gases" << endl;
		cout << "1. Carbon Dioxide" << endl;
		cout << "2. Air" << endl;
		cout << "3. Heliulm" << endl;
		cout << "4. Hydrogen" << endl;
		cout << "5. End program" << endl;

		cout << "\nPlease choose one of the gases: ";
		cin >> selection;
		cout << endl;
	while(selection != 1 && 2 &&  3 && 4 && 5) {
		cout << "Menu of Gases" << endl;
		cout << "1. Carbon Dioxide" << endl;
		cout << "2. Air" << endl;
		cout << "3. Heliulm" << endl;
		cout << "4. Hydrogen" << endl;
		cout << "5. End program" << endl;

		cout << "\nPlease choose one of the gases: ";
		cin >> selection;
		cout << endl;
	}
		cout << "Please indicate the time in seconds for the sound to travel in this medium: ";
		cin >> time;

			switch (selection) {
				case 1:  
						meters = time * carbonDioxide;
						cout << "Sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 2:  
						meters = time * air;;
						cout << "Sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 3:  
						meters = time * helium;
						cout << "Sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 4:  
						meters = time * hydrogen;;
						cout << "Sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 5:
					break;
			}
	
	
	return 0;
}