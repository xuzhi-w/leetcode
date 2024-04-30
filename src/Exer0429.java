package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exer0429 {
    static class Solution {
        //56.Merge Intervals
        public int[][] merge(int[][] intervals) {
            //1.sort
            Arrays.sort(intervals,(a, b) -> a[0]-b[0]);
//            for(int i = 0; i < intervals.length; i++){
//                System.out.println("[" + intervals[i][0] + "," + intervals[i][1]+"]");
//            }
            List<int[]> ans = new ArrayList<>();
            ans.add(intervals[0]);
            //2.iterate
            for(int i = 1; i <intervals.length; i++){
                int[] current = ans.get(ans.size()-1);
                if(current[1] >= intervals[i][0]){
                    current[1] = Math.max(current[1],intervals[i][1]);
                    ans.set(ans.size()-1,current);
                }else{
                    ans.add(intervals[i]);
                }
            }
            //transfer to Array
           return ans.toArray(new int[ans.size()][]);
        }

        //57. Insert Interval
        public int[][] insert(int[][] intervals, int[] newInterval) {
            //
            int[][] merged = new int[intervals.length+1][];
            int c = 0;
            for(int[] i : intervals){
                merged[c++] = i;
            }
            merged[intervals.length] = newInterval;
            Arrays.sort(merged,(a,b) -> a[0] - b[0]);
            List<int[]> ans = new ArrayList<>();
            for(int []arr : merged){
                if(ans.size() == 0) ans.add(arr);
                else{
                    int[] pre = ans.get(ans.size()-1);
                    if(arr[0] <= pre[1]){
                        pre[1] = Math.max(arr[1],pre[1]);
                        ans.set(ans.size()-1,pre);
                    }else{
                        ans.add(arr);
                    }
                }
            }
            return ans.toArray(new int[ans.size()][]);
        }
    }

    public static void main(String[] args) {
//       int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
       int[][] intervals = {{1,4},{0,2},{3,5}};
//       int[][] ans = new Solution().merge(intervals);
//       for(int i = 0; i < ans.length; i++){
//           System.out.println("[" + ans[i][0] + "," + ans[i][1]+"]");
//       }
        int[][] ans = new Solution().insert(intervals,new int[]{10,12});
        for(int i = 0; i < ans.length; i++){
            System.out.println("[" + ans[i][0] + "," + ans[i][1]+"]");
        }

    }


}
