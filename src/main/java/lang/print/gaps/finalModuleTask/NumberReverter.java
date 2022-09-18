package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        System.out.println(reverseNumber(number);
    }
    public static int reverseNumber(int reverse){
        int k = reverse%10;
        int g = (int) String.valueOf(reverse).chars().count();
        if (reverse/10 < 1){
            return k;
        }
        return (int) (k*Math.pow(10,g-1)+reverseNumber(reverse/10));
    }
}
