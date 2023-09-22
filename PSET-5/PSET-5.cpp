#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main() {
	string Selection;
	int temperature;

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
					if(temperature )
			}
			else if(Selection == "B" || Selection == "b") {
				cout << "BMI" << endl;
			} else if(Selection == "C" || Selection == "c") {
				Selection = "C";
			}
	}
	return 0;
}