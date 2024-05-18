package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public  void calculateSum(int number) {
        int sum = 0;
        int length = Integer.toString(number).length();
        while(length >0 ){
            sum += number % 10;
            number = (number - number %10 )/10;
            length--;
        }
        System.out.println(sum);
    }


}
