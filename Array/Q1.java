/*
  Q => Check the divisible by sum and product
 */

package Data_26_jully;

public class Q1 {
    public static void main(String[] args) {
        int n = 99;
        int orignal = n;
        int sum = 0;
        int mult = 1;

        while (n != 0){
            int last = n % 10;

            sum = sum + last; //18
            mult = mult * last;

            n = n / 10;
        };

        int Total = sum + mult;

        if(Total == orignal){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
