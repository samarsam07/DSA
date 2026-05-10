package DynamicProgramming;
public class TrapRainWater {
    public static void main(String[] args) {
        int []heights={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapRainWater(heights));
    }
    static int trapRainWater(int[] heights){
        if(heights.length==0){
            return 0;
        }
        int left=0;
        int ans=0;
        int right=heights.length-1;
        int maxleft=heights[left];
        int maxRight=heights[right];
        while(left<right){
            if(maxleft<maxRight){
                left++;
                maxleft=Math.max(maxleft,heights[left]);
                ans+=maxleft-heights[left];
            }else{
                right--;
                maxRight=Math.max(maxRight, heights[right]);
                ans+=maxRight-heights[right];
            }
        }/
        return ans;
    }
}
