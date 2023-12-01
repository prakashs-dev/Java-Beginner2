public class Main {
    
    //MULTIPLY TWO STRINGS
    public static void main(String[] args) {
        String s1 = "3456789";
        String s2 = "9876543";
        String product = multiply(s1, s2);
        System.out.println(product);
    }

    public static String multiply(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[] result = new int[m + n];

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int product = (s1.charAt(i) - '0') * (s2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = product + result[p2];

                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit : result) {
            if (!(sb.length() == 0 && digit == 0)) {
                sb.append(digit);
            }
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}
