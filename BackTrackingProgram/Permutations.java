package Data_Structure.BackTrackingProgram;

public class Permutations {

    static String swap(String str, int i, int j) {
        char[] charArr = str.toCharArray();

        char temp  = charArr[i];
        charArr[i] = charArr[j];
        charArr[j] = temp;

        return String.valueOf(charArr);
    }

    static void permute(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);

        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);

                permute(str, l + 1, r);

                // Back Tracking
                str = swap(str, l, i);

            }
        }
    }

    public static void main(String[] args) {

        permute("abc", 0, "abc".length() - 1);

    }
}

