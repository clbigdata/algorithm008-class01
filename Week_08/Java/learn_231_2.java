public class learn_231_2 {
    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 0) return false;
            while (n % 2 == 0) n /= 2;
            return n == 1;
        }
    }

}
