public class Main {
    public static void main(String[] args) {
        VersionControl.ver = 4;
        int n = 11;
        System.out.println(Solution.firstBadVersion(n));
    }

    public static class Solution extends VersionControl {
        public static int firstBadVersion(int n) {
            return sort(1, n);
        }

        private static int sort(int i, int j) {
            if (i >= j)
                return i;
            int m = i + (j - i) / 2;
            if (isBadVersion(m)) {
                return sort(i, m);
            } else {
                return sort(m + 1, j);
            }
        }
    }
}

