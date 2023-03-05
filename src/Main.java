public class Main {
    public static void main(String[] args) {
        int [] arr = {1,4};
        long count =0;
        for (int i = 0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                System.out.println(arr[i]+" "+arr[j]+"END");
                long btw = arr[i] ^ arr[j];
                System.out.println(btw);
                long an = arr[i] & arr[j];
                System.out.println(an);
                if (btw > an) count++;
            }
        }
        System.out.println(count);



        System.out.println("Determining whether " +
                "a string has unique characters without using " +
                "extra data structures");
        String str = "hellouniquestring?#";
        System.out.println(uniqueString(str));

        System.out.println("Permutation");
        String str1 = "toc";
        String str2 = "cot ";
        System.out.println(permutation(str1,str2));

        System.out.println("String compression algorithm");
        String strToComp = "aabcccccaaa";
        System.out.println(compressString(strToComp));

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        int res = "cdecde".indexOf("cde");
        System.out.println(res);
        String str3 = new String("I AM A String & with numbers 1 and spaces ! .");
        str3=str3.replaceAll("[^a-zA-Z]"," ");
        System.out.println(str3);

    }

    private static String compressString(String str) {
        StringBuilder comp = new StringBuilder();
        int countChar = 0;
        for (int i = 0; i < str.length(); i++){
            countChar++;
            if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
                comp.append(str.charAt(i));
                comp.append(countChar);
                countChar = 0;
            }

        }
        return str.length() < comp.length() ? str: comp.toString();
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