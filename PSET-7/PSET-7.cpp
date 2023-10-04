#include <iostream>
#include <iomanip>
#include <cstdlib>
#include <cmath>

using namespace std;

int main() {
	
	int guessNumber;
	int numberGuesses = 1;
	string gameStart;
	 do {
		srand(time(0));
		int randNumber = rand() % 100 + 1;

		cout << "I'm thinking of a number. Can you guess what it is? ";
		cin >> guessNumber;

		while (guessNumber != randNumber) {
			if (guessNumber > randNumber) {
				cout << "Sorry, that guess is too high" << endl;
				cout << "Guess again: ";
				cin >> guessNumber;
				numberGuesses++;
			} else if (guessNumber < randNumber) {
				cout << "Sorry, that guess is too low" << endl;
				cout << "Guess again: ";
				cin >> guessNumber;
				numberGuesses++;
			}
		}
		cout << endl;
		cout << "Congratulations! You guessed it!\nI was thinking of the number " << randNumber << "." << endl;
		cout << "You got it right in " << numberGuesses << " guesses.";
		cout << endl;
		cout << "Would you like to play another game? (Y or N): ";
		numberGuesses = 1;
		cin >> gameStart;
	} while (gameStart != "N");
	cout << "End of game.";
	return 0;
}