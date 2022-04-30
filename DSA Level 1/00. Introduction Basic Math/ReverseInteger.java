class ReverseInteger {
    public int reverse(int x) {
        int temp = x;
        if (temp < 0) {
            temp *= -1;
        }
        long ans = 0;
        while (temp > 0) {
            int l = temp % 10;
            ans = ans * 10 + l;
            temp /= 10;
        }
        // checking whether number is in range of int or not

        if (ans > Math.pow(2, 31)) {
            return 0;
        }
        if (x >= 0) {
            return (int) ans;
        } else {
            return -(int) ans;
        }

    }
}
