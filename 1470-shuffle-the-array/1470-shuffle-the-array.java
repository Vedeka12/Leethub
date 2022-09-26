class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[2*n];
        for(int i=0;i<2*n;i++){
            if(i%2==0){
                shuffle[i]= nums[i/2];
            }
            else{
                shuffle[i] = nums[n+i/2];
            }
            
        }
        return shuffle;
    }
}