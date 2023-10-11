#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <cmath>

using namespace std;

int main() {

	int numberOfGames;

	cout << "How many games do you wish to play? ";
	cin >> numberOfGames;
	cout << endl;


	
	for (int i = 0; i <= numberOfGames; i++) {
		int gameValue = 1;

		int playerWins = 0;
		int houseWins = 0;
		int gamePoint;


		srand(time(0));
		int diceOne = rand() % 5 + 1;
		int diceTwo = rand() % 5 + 1;

		int sumRoll = diceOne + diceTwo;

		cout << "Dice one rolled a number of " << diceOne << endl;
		cout << "Dice two rolled a number of " << diceTwo << endl;
		cout << "The sum of the rolls are " << sumRoll << endl;

		if (sumRoll == 7 || sumRoll == 11) {
			playerWins++;
		}
	}

	return 0;
}