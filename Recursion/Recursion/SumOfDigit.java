public class SumOfDigit {
    static int SumDigit(int num){
        //break condition
        if(num == 0){
           return 0;
        }
        return num % 10 + SumDigit(num/10);
    }
    public static void main (String[] args){
        System.out.println(SumDigit(123));
     }


}
    

