// Last updated: 17/02/2026, 10:34:41
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        ArrayList<String> result = new ArrayList<>();
4        for(int i = 0;i < 12;i++){
5            for(int j = 0; j < 60; j++){
6                if(Integer.bitCount(i)+ Integer.bitCount(j) == turnedOn){
7                    if(j < 10){
8                        result.add(i +":0"+j);
9                    }
10                    else{
11                        result.add(i+":"+j);
12                    }
13                }
14            }
15        }
16        return result;
17    }
18}