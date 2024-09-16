package Arrays;

public class BuySellStocks {
    public static int buyAndSellStocks(int price[]){
        int buyPrice = price[0];
        int maxProfit = 0;
        for(int i =1 ; i<price.length ; i++){
            int sellingprice = price[i];
            if(sellingprice > buyPrice){
                int profit = sellingprice - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
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
