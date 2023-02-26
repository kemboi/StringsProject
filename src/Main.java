public class Main {
    public static void main(String[] args) {
        System.out.println("Determining whether " +
                "a string has unique characters without using " +
                "extra data structures");
        String str = "hellouniquestring?#";
        System.out.println(uniqueString(str));

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