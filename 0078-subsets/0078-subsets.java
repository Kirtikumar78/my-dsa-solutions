class Solution {
    static void solve(int nums[],int index,List<List<Integer>> ans,List<Integer>output){
        if(index==nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        int curruntValue=nums[index];
        output.add(curruntValue);
        solve(nums,index+1,ans,output);

        // backtraking ,we have to empty the array, remove the right most element
        output.remove(output.size()-1);
        //exclude
        solve(nums,index+1,ans,output);


    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        int index=0;
        solve(nums,index,ans,output);
        return ans;

    }
}