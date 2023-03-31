public class Counting {
    public static void main(String [] args){
        int element = 691789876;
        System.out.println(countNumbsEven(element));
    }
    public static boolean countNumbsEven(int count){
        int countNum = (int) Math.log10(count) + 1;
        return ((countNum & 1) == 0); //bitwise operation to optimize performance
    }
}
