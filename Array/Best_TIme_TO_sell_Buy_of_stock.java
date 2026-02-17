//Best Time to Sell and Buy Stock
import static java.lang.Math.max;

/************************************************************************
 Developer Name : Harshvardhan Vathare
 Developer Content : harsh1234vathare@gmail.com
 Created On : 2/17/2026 1:25 PM
 Project Name : demo
 ************************************************************************/
public class Best_TIme_TO_sell_Buy_of_stock {
    public static void main(String[] args) {
        int[]price = {7,1,5,3,6,7,4};

       int max = maxProfit(price);

       //Optimal approch
       int maxprice = maxRrofit_Optimal_solution(price);
        System.out.println(max);

        System.out.println(maxprice);
    }

    //max profit i iteration and j iteration so Time/Complexity == O(n)squere
    //and Space/Complexity=> O(1)
    // Not optimal solution
    public static int maxProfit(int [] price) {
        int maxProfit = 0;
        for(int i=0; i<price.length; i++) {
            for (int j=i+1; j<price.length; j++) {
                int currPrice = price[j] - price[i];
                maxProfit = max(maxProfit, currPrice);
            }
        }
        return maxProfit;
    }


    //Best optimal solution
    // lenear travels in the array
    // Time/Complexity == O(n)squere
    //and Space/Complexity=> O(1)
    public static int maxRrofit_Optimal_solution(int [] price) {
        int minprice = Integer.MAX_VALUE;//7
        int maxProfit = 0;

        for(int i=0; i<price.length; i++) {
            if(price[i] < minprice) {
                minprice = price[i];
            } else if (price[i] - minprice > maxProfit) {
                maxProfit = price[i] - minprice;
            }
        }
        return maxProfit;
    }
}
