package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        System.out.println(sumNum(number));
    }
    public int sumNum(int num){
        int k = num%10;
        if (num/10 < 1){
            return k;
        }
        return k+sumNum(num/10);
    }
}
