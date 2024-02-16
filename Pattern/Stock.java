class Stock{
        public static void main(String args[]){
                int stockPrice[] = {7,1,5,3,6,4};

                int buyingPrice = stockPrice[0];
                for(int i = 1;i < stockPrice.length;i++){
                        if(stockPrice[i] <= buyingPrice){
                                buyingPrice = stockPrice[i];
                        }
                }

                int profit = 0;
                for(int i = 1;i < stockPrice.length;i++){                   
                        if((stockPrice[i] - buyingPrice) >= profit){
                                profit = stockPrice[i] - buyingPrice;          
                        }
                }

                System.out.print(profit);
        }
}