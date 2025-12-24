class Solution {
    public String optimalDivision(int[] nums) {
        if(nums.length==1){
            return Integer.toString(nums[0]);
        }
        StringBuilder sc=new StringBuilder();
        if(nums.length==2){
            
            sc.append(Integer.toString(nums[0]));
            sc.append("/");
            sc.append(Integer.toString(nums[1]));
            return sc.toString();
        }
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            sc.append(Integer.toString(nums[i]));
            sc.append("/");
            if(count ==1 ){
                sc.append("(");
            }
            count=0;
            
        }
        sc.append(Integer.toString(nums[nums.length-1]));
       sc.append(")");
        
        return sc.toString();
    }
}
