package javabasic;

public class StrinUtil {
    public static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) { // 마지막부터 0까지 순회
            reverseString = reverseString + str.charAt(i);// 문자열은 문자로 변환해서 접근
        }
        return reverseString;
    }

    public static String concat(String str1, String str2) {
        return str1 + str2; // 문자열끼리는 + 가능
    }
    public static String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3; // 문자열끼리는 + 가능
    }

    public static boolean contains(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }

        }
        return false;
    }

        public static boolean contains(String str1, String str2) {
            for (int i = 0; i < str2.length() - str1.length(); i++) {
                boolean currentStringisEqual = true;
                for (int j = i; j < i + str1.length(); j++) {
                    if (str2.charAt(j) != str1.charAt(j - 1)) {
                        currentStringisEqual = false;
                    }
                }
                if(currentStringisEqual) return true;
            }
            return false;
        }
}

