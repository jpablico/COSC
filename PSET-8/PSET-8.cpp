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
		cout << diceRoll << endl;
		diceRollCount++;


			if (diceRoll == 7 || diceRoll == 11) {
				playerWins++;
				gameCount++;
			} else if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
				houseWins++;
				gameCount++;
			} else {
				gamePoint = diceRoll;

				int gameSession = 1;
				while (gameSession != 0) {
					diceRoll;
					cout << "New Dice roll " << diceRoll << endl;
					gameSession = 0;
				}
			}
	}

	return 0;
}