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
	if(selection <= 0) {
		cout << "Please enter a valid option." << endl;
	} else if(selection >= 1 && selection <= 4) {
		cout << "Please indicate the time in seconds for the sound to travel in this medium: ";
		cin >> time;

		if(time <= 0) {
			cout << "Time is invalide." << endl;
		} 
		else if(time >= 1 && time <=30) {
			switch (selection) {
				case 1:  
						meters = time * carbonDioxide;
						cout << "Within a medium of carbon dioxide, sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 2:  
						meters = time * air;
						cout << "Within a medium of air, sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 3:  
						meters = time * helium;
						cout << "Within a medium of helium, sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
				case 4:  
						meters = time * hydrogen;;
						cout << "Within a medium of hydrogen, sound traveled " << meters << " meters from the source in " << time << " seconds." << endl;
					break;
			}
		} else {
			cout << "Time is invalide." << endl;
		}
	} else if(selection == 5) {
		return 0;
	} else {
		cout << "Please enter a valid option." << endl;
	}
	return 0;
}