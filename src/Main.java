public class Main {
    public static void main(String[] args) {
        System.out.println("Determining whether " +
                "a string has unique characters without using " +
                "extra data structures");
        String str = "hellouniquestring?#";
        System.out.println(uniqueString(str));

        System.out.println("Permutation");
        String str1 = "toc";
        String str2 = "cot ";
        System.out.println(permutation(str1,str2));

    }

    private static boolean permutation(String str1, String str2) {
        /*Given two strings, determine whether one is a permutation of the other*/
        if (str1.length() != str2.length()) return  false;
        int [] char_count = new int[128];
        char[] str1_Array = str1.toCharArray();
        for (char c : str1_Array){
            char_count[c]++;
        }
        for (int i = 0; i < str2.length(); i++){
            int c = (int) str2.charAt(i);
            char_count[c]--;
            if (char_count[c] < 0){
                    return false;
            }
        }

        return true;
    }

    private static boolean uniqueString(String str) {
        if (str.length() > 128) return false; // a string with more than 128 characters cannot be unique
        boolean [] charSet = new boolean[128]; // ASCII character set

        for (int i = 0; i < str.length(); i++){
            int val = str.charAt(i);
            if(charSet[val]){
                return false;
            }
            charSet[val] = true;
        }
        return true;
    }
}