#include <iostream>
#include <cstdlib>
#include <cmath>
#include <iomanip>
#include <ctime>

using namespace std;

int testArray[20][10];

void createArray() {
	int randInt;
	for (int i = 0; i < 20; i++) {
		for (int j = 0; j < 10; j++) {
			randInt = (rand() % 45) + 55;
			testArray[i][j] = randInt;
		}
	}
}

void sortArray() {
	int n = sizeof(testArray[0]) / sizeof(testArray[0][0]);
	for (int i = 0; i < 20; i++) {
		sort(testArray[i], testArray[i] + n);
	}
}

void printArray() {
	int n = sizeof(testArray[0]) / sizeof(testArray[0][0]);
	for (int i = 0; i < 20; i++) {
		for (int j = 0; j < 10; j++) {
			cout << setw(3) << testArray[i][j] << " ";
		}
		cout << endl;
	}
}

int calculateMean() {
	int sum = 0;
	int mean = 0;
	for (int i = 0; i < 20; i++) {
		for (int j = 0; j < 10; j++) {
			sum += testArray[i][j];
		}
	}
	mean = sum / 200;
	return mean;
}

int calculateVarience() {
	int varience = 0;
	int mean = calculateMean();
	int sum = 0;
	int n = sizeof(testArray[0]) / sizeof(testArray[0][0]);
	for (int i = 0; i < 20; i++) {
		for (int j = 0; j < 10; j++) {
			sum += pow((testArray[i][j] - mean), 2);
		}
	}
	varience = sum / 200;
	return varience;
}	

int calculateMedian() {
	int median = 0;
	int n = sizeof(testArray[0]) / sizeof(testArray[0][0]);
	for (int i = 0; i < 20; i++) {
		median += testArray[i][n / 2];
	}
	median = median / 20;
	return median;
}

int main() {
	srand((unsigned)time(0));

	createArray();
	sortArray();

	int mean = calculateMean();
	int varience = calculateVarience();
	int median = calculateMedian();

	printArray();

	cout << "The average of the distribution in the array is: " << mean << endl;
	cout << "The varience of the distribution in the array is: " << varience << endl;
	cout << "The median of the distribution in the array is: " << median << endl;
	return 0;
}