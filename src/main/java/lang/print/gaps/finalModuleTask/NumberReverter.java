package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public  void revert(int number) {
        int result  = 0;
        int length = Integer.toString(number).length();
        for(int i = length; i > 0; i--){
           result += number %10 * Math.pow(10, i);
           number = (number -  number %10)/10;
        }
        System.out.println(
                result/10
        );
    }

}
