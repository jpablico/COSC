#include <iostream>
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
    return (packageSelection == "A" || packageSelection == "a" ||
            packageSelection == "B" || packageSelection == "b" ||
            packageSelection == "C" || packageSelection == "c");
}

int getHours() {
    cout << "Please enter the amount of hours: ";
    cin >> hours;
    return hours;
}

bool validHours(int hours) {
    return (hours >= MIN_HOURS && hours <= MAX_HOURS);
}

double calculatePkg_A(int hours) {
    double basePrice = 15.00;

    if (hours <= 50) {
        return basePrice;
    } else {
        int additionalHours = hours - 50;
        double newPrice = basePrice + (additionalHours * 2.00);
        return newPrice;
    }
}

double calculatePkg_B(int hours) {
    double basePrice = 20.00;

    if (hours <= 100) {
        return basePrice;
    } else {
        int additionalHours = hours - 100;
        double newPrice = basePrice + (additionalHours * 1.50);
        return newPrice;
    }
}

double calculatePkg_C(int hours) {
    double basePrice = 25.00;

    if (hours <= 150) {
        return basePrice;
    } else {
        int additionalHours = hours - 150;
        double newPrice = basePrice + (additionalHours * 1.00);
        return newPrice;
    }
}

int main() {
    bool continueProgram = true;
    while (continueProgram) {
        getPackage();

        if (!validPackage(packageSelection)) {
            cout << "Invalid package selection. Please try again. \n";
            continue;
        }

        getHours();

        if (!validHours(hours)) {
            cout << "Invalid amount of hours. Please try again. \n";
            continue;
        }

        if (packageSelection == "A" || packageSelection == "a") {
            cout << "Your total amount due is: $" << calculatePkg_A(hours) << endl;
        } else if (packageSelection == "B" || packageSelection == "b") {
            cout << "Your total amount due is: $" << calculatePkg_B(hours) << endl;
        } else if (packageSelection == "C" || packageSelection == "c") {
            cout << "Your total amount due is: $" << calculatePkg_C(hours) << endl;
        }

        char continueChoice;
        cout << "Would you like to run the program again? (Y/N): ";
        cin >> continueChoice;
        if (continueChoice == 'N' || continueChoice == 'n') {
            continueProgram = false;
        }
    }
    return 0;
}
