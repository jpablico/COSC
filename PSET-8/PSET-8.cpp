#include <iostream>
#include <cstdlib>
#include <ctime>
#include <cmath>
#include <iomanip>

using namespace std;

int main() {

	int gameCount = 0;
	int numberOfGames;

	double playerWins = 0;
	double houseWins = 0;

	int gamePoint;

	int seed;
	srand(seed);

	cout << "How many games do you wish to play? ";
	cin >> numberOfGames;
	cout << endl;

	while (gameCount != numberOfGames) {
		int diceRoll = (rand() % 6) + (rand() % 6) + 2;

		
		cout << "Current dice roll total: " << diceRoll << endl;
			if (diceRoll == 7 || diceRoll == 11) {
				cout << "Player Wins" << endl;
				playerWins++;
				gameCount++;
			} else if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
				cout << "House Wins" << endl;
				houseWins++;
				gameCount++;
			} else {
				gamePoint = diceRoll;

				int gameSession = 1;
				while (gameSession != 0) {
					int newDiceRoll = (rand() % 6) + (rand() % 6) + 2;
					cout << "New Dice roll total " << newDiceRoll << endl;
						if (newDiceRoll == gamePoint) {
							cout << "New Session player wins" << endl;
							playerWins++;
							gameCount++;
							gameSession = 0;
						} else if (newDiceRoll == 7) {
							cout << "New Session house wins" << endl;
							houseWins++;
							gameCount++;
							gameSession = 0;
						} 
				}
			}
			cout << "Player Wins: " << playerWins << endl;
			cout << "House Wins: " << houseWins << endl;
	}

	double playerProbability = (playerWins/ numberOfGames) * 100;
	double houseProbability = (houseWins/ numberOfGames) * 100;

	cout << setprecision(2) << fixed;
	cout << "Number of games played: " << numberOfGames << endl;
	cout << "Number of games won by the Player: " << playerWins << endl;
	cout << "Number of games won by the House: " << houseWins << endl;
	cout << "Percent Probability the Player Wins: " << playerProbability << endl;
	cout << "Percent Probability the House Wins: " << houseProbability << endl;

	return 0;
}