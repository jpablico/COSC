#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
	string Selection;
	int temperature;
	double weight;
	double height;
	double BMI;

	while(Selection != "C") {
		cout << "Choose program to run: " << endl;
		cout << "A. Freezing & Boiling Points" << endl;
		cout << "B. Body Mass Index" << endl;
		cout << "C. Exit program" << endl;
		cout << endl;

		cout << "Selection: ";
		cin >> Selection;

		cout <<  endl;

			if(Selection == "A" || Selection == "a") {
				cout << "Please enter a temperature in Farenheight ";
				cin >> temperature; 
					if(temperature >= -306) {
						if(temperature >= 173) {
							if(temperature >= 212) {
								if(temperature >= 676) {
									cout << "Oxygen, Ethyl alcohol, water, and Mercury boils at that temperature." << endl;
								} else {
									cout << "Oxygen, Ethyl alcohol, and water boils at that temperature." << endl;
								}
							} else {
								cout << "Oxygen and Ethyl alcohol boils at that temperature." << endl;
							}
						} else {
							cout << "Oxygen boils at that temperature." << endl;
						}
					}
					if(temperature <= -32) {
						if(temperature <= -38) {
							if(temperature <= -173) {
								if(temperature <= -363) {
									cout << "Water, Mercury, Ethyl alcohol, and Oxygen freezes at that temperature." << endl;
								} else {
									cout << "Water, Mercury, and Ethyl alcohol freezes at that temperature." << endl;
								}
							} else {
								cout << "Water and Mercury freezes at that temperature." << endl;
							}
						} else {
							cout << "Water freezes at that temperature." << endl;
						}
					} 
				}
			
			else if(Selection == "B" || Selection == "b") {
				cout << "Please enter your weight in pounds: ";
				cin >> weight; 
				cout << "Please enter your height in inches: ";
				cin >> height;
				cout << endl;
				
				BMI = (weight * 703) / (height * height);

				if(BMI >= 18.5 && BMI <=25) {
					cout << "Optimal Weight" << endl;
				}
				else if(BMI <= 18.5) {
					cout << "Underweight" << endl;
				}
				else if(BMI >= 25) {
					cout << "Overweight" << endl;
				}


			} else if(Selection == "C" || Selection == "c") {
				Selection = "C";
			}
	}
	return 0;
}