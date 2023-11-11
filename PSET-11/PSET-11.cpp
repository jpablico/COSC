#include <iostream>
#include <cstdlib>
#include <cmath>
#include <iomanip>
#include <ctime>

using namespace std;

int testArray[20][10];

int main() {
	srand((unsigned)time(0));
	int randInt;

	for (int i = 0; i < 20; i++) {
		for (int j = 0; j < 10; j++) {
			randInt = (rand() % 45) + 55;
			testArray[i][j] = randInt;
		}
	}

	int n = sizeof(testArray)/sizeof(testArray[0]);
	for (int i = 0; i < 19; i++) {
		sort(testArray[i], testArray[i] + n);
	}

	for (int i = 0; i < 20; i++) {
		for (int j = 0; j < 10; j++)
			cout << setw(3) << testArray[i][j] << " ";
		cout << endl;
	}


	
	return 0;
}