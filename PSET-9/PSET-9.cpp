#include <iostream>
#include <cstdlib>
#include <cmath>
#include <iomanip>

using namespace std;

string packageSelection;
int hours;

const int MIN_HOURS = 0;
const int MAX_HOURS = 720;

string getPackage() {
	cout << "Which subscription package are you subscribed to? \n";
	cout << "Package A \nPackage B \nPackage C\nPackage: ";
	cin >> packageSelection;
	return packageSelection;
}

bool validPackage(string packageSelection) {
    if (packageSelection == "A" || packageSelection == "a") {
        return true;
    } else if (packageSelection == "B" || packageSelection == "b") {
        return true;
    } else if (packageSelection == "C" || packageSelection == "c") {
        return true;
    } else {
        return false;
    }
}

int getHours(int hours) {
	cout << "Please enter the amount of hours: ";
	cin >> hours;
}

bool validHours(int hours) {
	return hours>=MIN_HOURS && hours <=MAX_HOURS;
}

int main() {
	getPackage();
	validPackage(packageSelection);
	cout << validPackage(packageSelection);
	return 0;
}
