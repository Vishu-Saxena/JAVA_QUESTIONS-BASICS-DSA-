package Arrays;

public class BuySellStocks {
    public static int buyAndSellStocks(int price[]){
        // as first day we can only buy the stocks 
        int buyPrice = price[0];
        int maxProfit = 0;
        for(int i =1 ; i<price.length ; i++){
            // from day second we can sell stock if bought any;
            int sellingprice = price[i];

            // if stock price on ith day is higher than that of the price we bought we can sell stocks .
            if(sellingprice > buyPrice){
                int profit = sellingprice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{ // when profit is negatice i.e stock price of ith day is less than the previouse one we bought in that case we update our buying price.
                buyPrice = sellingprice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};

        System.out.println(buyAndSellStocks(price));
        
    }
}
