#include <iostream>
#include <cstdlib>
#include <cmath>
#include <iomanip>
#include <ctime>

using namespace std;

int* arrayPntr = new int[200];

void createArray() {
	int randInt;
	for (int i = 0; i < 200; i++) {
		randInt = (rand() % 45) + 55;
		arrayPntr[i] = randInt;
	}
}

void sortArray() {
	int n = sizeof(arrayPntr) / sizeof(arrayPntr[0]);
	sort(arrayPntr, arrayPntr + n);
}

void printArray() {
	for (int i = 0; i < 200; i++) {
		cout << setw(3) << arrayPntr[i] << " ";
		if (i % 10 == 0) {
			cout << endl;
		}
	}
}

int countScoreIntervals(int lowerBound, int upperBound) {
	int count = 0;
	for (int i = 0; i < 200; i++) {
		if (arrayPntr[i] >= lowerBound && arrayPntr[i] <= upperBound) {
			count++;
		}
	}
	return count;
}

void IntervalsHistogram(int count) {
	for (int i = 0; i < count; i++) {
		cout << "*";
	}
	cout << endl;
}


int main() {
	srand(time(NULL));
	createArray();
	sortArray();
	printArray();
	cout << endl;
	cout << endl;

	cout << "Score Intervals Histogram" << endl;
	cout << "55-59: ";
	IntervalsHistogram(countScoreIntervals(55, 59));
	cout << "60-64: ";
	IntervalsHistogram(countScoreIntervals(60, 64));
	cout << "65-69: ";
	IntervalsHistogram(countScoreIntervals(65, 69));
	cout << "70-74: ";
	IntervalsHistogram(countScoreIntervals(70, 74));
	cout << "75-79: ";
	IntervalsHistogram(countScoreIntervals(75, 79));
	cout << "80-84: ";
	IntervalsHistogram(countScoreIntervals(80, 84));
	cout << "85-89: ";
	IntervalsHistogram(countScoreIntervals(85, 89));
	cout << "90-94: ";
	IntervalsHistogram(countScoreIntervals(90, 94));
	cout << "95-99: ";
	IntervalsHistogram(countScoreIntervals(95, 99));

	cout << "      |----|----|----|----|----|----|----|----|----|" << endl;
	cout << "      0   5    10   15   20   25   30   35   40" << endl;
	delete[] arrayPntr;
	return 0;
}