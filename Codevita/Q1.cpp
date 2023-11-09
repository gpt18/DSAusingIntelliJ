#include <iostream>
#include <vector>

using namespace std;

int main() {
    int M, N;
    cin >> M >> N;

    vector<vector<char>> screen(M, vector<char>(N));
    for (int i = 0; i < M; ++i) {
        for (int j = 0; j < N; ++j) {
            cin >> screen[i][j];
        }
    }

    int totalCoins = 0;
    int totalCalories = 0;
    int jumpHeight = 0;

    for (int j = 0; j < N; ++j) {
        int coinCount = 0;
        int holeHeight = -1;

        for (int i = 0; i < M; ++i) {
            if (screen[i][j] == 'C') {
                ++coinCount;
            } else if (screen[i][j] == 'H') {
                if (holeHeight == -1) {
                    holeHeight = i;
                } else {
                    int holeSize = i - holeHeight - 1;
                    totalCalories += 2 * holeSize;
                    jumpHeight = holeSize;
                    holeHeight = i;
                }
            }
        }

        totalCoins += coinCount;
        totalCalories += 2 * jumpHeight;

        // Reset jump height for the next column
        jumpHeight = 0;
    }

    cout << "Total Coins Collected: " << totalCoins << endl;
    cout << "Total Calories Expended: " << totalCalories << endl;

    return 0;
}
