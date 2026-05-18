class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for(int[] interval : intervals){
            int start = interval[0];
            int end = interval[1];

            int lastEnd = result.get(result.size() - 1)[1];

            if(lastEnd >= start){
                int maxEnd = Math.max(lastEnd, end);
                result.get(result.size() - 1)[1] = maxEnd;
            }else{
                result.add(new int[]{start, end});
            }
        }
        
    return result.toArray(new int[result.size()][]);
    }
}
