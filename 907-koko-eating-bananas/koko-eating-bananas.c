int minEatingSpeed(int* piles, int pilesSize, int h) {
    int left = 1, right = piles[0];

    // Find the maximum pile
    for (int i = 1; i < pilesSize; i++) {
        if (piles[i] > right)
            right = piles[i];
    }

    while (left < right) {
        int mid = left + (right - left) / 2;
        long long hours = 0;

        for (int i = 0; i < pilesSize; i++) {
            hours += (piles[i] + mid - 1) / mid;  
        }

        if (hours <= h)
            right = mid;
        else
            left = mid + 1;
    }

    return left;
}