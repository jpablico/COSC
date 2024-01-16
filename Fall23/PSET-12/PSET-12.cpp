#include <iostream>
#include <cstdlib>
#include <cmath>
#include <iomanip>
#include <ctime>
#include <algorithm>

using namespace std;

int* arrayPntr = new int[200];

void createArray() {
    int randInt;
    for (int i = 0; i < 200; i++) {
        randInt = (rand() % 45) + 55;
        arrayPntr[i] = randInt;
    }
}

void sortArray(int size) {
    sort(arrayPntr, arrayPntr + size);
}

void printArray(int size) {
    for (int i = 0; i < size; i++) {
        cout << setw(3) << arrayPntr[i] << " ";
        if ((i + 1) % 10 == 0) {
            cout << endl;
        }
    }
}

int countScoreIntervals(int lowerBound, int upperBound, int size) {
    int count = 0;
    for (int i = 0; i < size; i++) {
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
    sortArray(200); 
    printArray(200);
	cout << endl;
	cout << endl;

	cout << "Score Intervals Histogram" << endl;
	cout << "55-59: ";
	IntervalsHistogram(countScoreIntervals(55, 59, 200));
	cout << "60-64: ";
	IntervalsHistogram(countScoreIntervals(60, 64, 200));
	cout << "65-69: ";
	IntervalsHistogram(countScoreIntervals(65, 69, 200));
	cout << "70-74: ";
	IntervalsHistogram(countScoreIntervals(70, 74, 200));
	cout << "75-79: ";
	IntervalsHistogram(countScoreIntervals(75, 79, 200));
	cout << "80-84: ";
	IntervalsHistogram(countScoreIntervals(80, 84, 200));
	cout << "85-89: ";
	IntervalsHistogram(countScoreIntervals(85, 89, 200));
	cout << "90-94: ";
	IntervalsHistogram(countScoreIntervals(90, 94, 200));
	cout << "95-99: ";
	IntervalsHistogram(countScoreIntervals(95, 99, 200));

	cout << "      |----|----|----|----|----|----|----|----|" << endl;
	cout << "      0    5    10   15   20   25   30   35   40" << endl;
	cout << "      (Numbers of values in an interval)" << endl;
	delete[] arrayPntr;
	return 0;
}