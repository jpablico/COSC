#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <cmath>

using namespace std;

int main() {

	string gameStart = "Y";
	int guessNumber;

	srand(time(0));
	int randNumber = rand() % 100 + 1;

	if(gameStart == "Y") {
		cout << "I'm thinking of a number. Can you guess what it is? " << endl;
		cin >> guessNumber;

		while(guessNumber != randNumber) {
			if(guessNumber > randNumber){
				cout << "Sorry, that guess is too high." << 
			}
		} return 
	}

	cout << randNumber << endl;
	cout << randNumber;
	return 0;
}