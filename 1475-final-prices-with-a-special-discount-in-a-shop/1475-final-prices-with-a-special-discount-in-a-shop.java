// class Solution {
//     public int[] finalPrices(int[] prices) {
//         int i=0;
//         int j=0;
//         while(i<prices.length && j<prices.length){
//             if(i==j){
//                 j++;
//             }
//             else if(prices[j] <= prices[i]){
//                 prices[i]-=prices[j];
//                 i++;
//                 j=i;
//             }
//             else{
//                 j++;
//             }
            
//         }
//         return prices;
//     }
// }
class Solution {
    public int[] finalPrices(int[] prices) {
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j] <= prices[i]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}