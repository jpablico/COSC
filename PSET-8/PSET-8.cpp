#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>

using namespace std;

int main() {

	int gameCount = 0;
	int numberOfGames;
	int playerWins = 0;
	int houseWins = 0;
	int gamePoint;
	int diceRollCount = 0;

	int seed;
	srand(seed);

	cout << "How many games do you wish to play? ";
	cin >> numberOfGames;
	cout << endl;

	while (gameCount != numberOfGames) {
		int diceRoll = (rand() % 6) + (rand() % 6) + 2;
		diceRollCount++;

		if (diceRoll == 7 || diceRoll == 11) {
			playerWins++;
		} else if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
			
		}
	}
	



	for (int i = 0; i <= numberOfGames; i++) {
		int gameValue = 1;

		int playerWins = 0;
		


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