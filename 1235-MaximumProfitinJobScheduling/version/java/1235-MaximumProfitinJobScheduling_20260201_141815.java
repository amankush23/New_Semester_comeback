// Last updated: 01/02/2026, 14:18:15
1class Solution {
2    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
3        int numJobs = profit.length; // Number of jobs
4        Job[] jobs = new Job[numJobs];
5
6        for (int i = 0; i < numJobs; ++i) {
7            jobs[i] = new Job(endTime[i], startTime[i], profit[i]);
8        }
9
10        Arrays.sort(jobs, Comparator.comparingInt(job -> job.endTime));
11        int[] dp = new int[numJobs + 1];
12
13        for (int i = 0; i < numJobs; ++i) {
14            int endTimeValue = jobs[i].endTime;
15            int startTimeValue = jobs[i].startTime;
16            int profitValue = jobs[i].profit;
17
18            int latestNonConflictJobIndex = upperBound(jobs, i, startTimeValue);
19            dp[i + 1] = Math.max(dp[i], dp[latestNonConflictJobIndex] + profitValue);
20        }
21
22        return dp[numJobs];
23    }
24
25    private int upperBound(Job[] jobs, int endIndex, int targetTime) {
26        int low = 0;
27        int high = endIndex;
28
29        while (low < high) {
30            int mid = (low + high) / 2;
31            if (jobs[mid].endTime <= targetTime) {
32                low = mid + 1;
33            } else {
34                high = mid;
35            }
36        }
37
38        return low;
39    }
40
41    private static class Job {
42        int endTime;
43        int startTime;
44        int profit;
45
46        public Job(int endTime, int startTime, int profit) {
47            this.endTime = endTime;
48            this.startTime = startTime;
49            this.profit = profit;
50        }
51    }
52}