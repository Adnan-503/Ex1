package assignments.ex1;

public class Ex1 {

    public static int number2Int(String num) {
        int ans = -1;
        if (num == null || !isNumber(num)) {
            return ans;
        }
        if (!num.contains("b")){
            return Integer.parseInt(num);
        }
        else {
            String[] parts = num.split("b");
            String number = parts[0];
            int base = getBase(parts[1]);
            try {
                return Integer.parseInt(number, base);
            } catch (NumberFormatException e) {
                return -1;
            }
        }
    }

    private static int getBase(String baseStr) {
        if (baseStr.length() == 1) {
            char c = baseStr.charAt(0);
            if (c >= '2' && c <= '9') {
                return c - '0';
            } else if (c >= 'A' && c <= 'G') {
                return 10 + (c - 'A');
            }
        }
        return -1;
    }

    public static boolean isNumber(String a) {
        boolean ans = true;
        if (a == null || a.isEmpty()) return false;
        if (!a.contains("b")) return ans;

        String[] parts = a.split("b");
        if (parts.length != 2) return false;

        String number = parts[0];
        int base = getBase(parts[1]);

        if (base == -1) return false;

        for (char c : number.toCharArray()) {
            if (Character.isDigit(c)) {
                if (Character.getNumericValue(c) >= base) return false;
            } else if (c >= 'A' && c <= 'F') {
                if (10 + (c - 'A') >= base) return false;
            } else {
                return false;
            }
        }
        return ans;
    }

    public static String int2Number(int num, int base) {
        String ans = "";
        if (num < 0 || base < 2 || base > 16) return ans;
        return Integer.toString(num, base).toUpperCase() + "b" + baseToString(base);
    }

    private static String baseToString(int base) {
        if (base >= 2 && base <= 9) return String.valueOf(base);
        return String.valueOf((char) ('A' + (base - 10)));
    }

    public static boolean equals(String n1, String n2) {

        return number2Int(n1) != -1 && number2Int(n1) == number2Int(n2);

    }

    public static int maxIndex(String[] arr) {
        int ans = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int val = number2Int(arr[i]);
            if (val > maxVal) {
                maxVal = val;
                ans = i;
            }
        }
        return ans;
    }
}