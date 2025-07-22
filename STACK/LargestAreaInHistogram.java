package STACK;


import java.util.Stack;

public class LargestAreaInHistogram {
    public static void main(String[] args) {
        int []nums={2,1,5,6,2,3};
        // System.out.println(Arrays.toString(nextSmallerElement(nums)));
        // int ans[]=nextSmallerElement(nums);
        // int ans[]=prevSmallerElement(nums);
        // System.out.println(Arrays.toString(nums));
        // for(int i=0;i<ans.length;i++){
        //     System.out.println(nums[i]+"-> " + ans[i]);
        // }
        System.out.println(area(nums));
    }
    static int area(int []heights){
        int n=heights.length;
        int[] prev=prevSmallerElement(heights);
        int next[]=nextSmallerElement(heights);
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int length=heights[i];
            if(next[i]==-1){
                next[i]=n;
            }
            int width=next[i]-prev[i]-1;
            int area=length*width;
            max=Math.max(max, area);
        }
        return max;
    }
    static int[] nextSmallerElement(int[] nums){
        int []ans=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        for(int i=nums.length-1;i>=0;i--){
            int cur=nums[i];
            while((s.peek()!=-1) && nums[s.peek()]>=cur){
                s.pop();
            }
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
    static int []prevSmallerElement(int []nums){
        int []ans=new int[nums.length];
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            while ((s.peek()!=-1) && nums[s.peek()]>=cur) {
                s.pop();
            }
            ans[i]=s.peek();
            s.push(i);
        }
        return ans;
    }
}
