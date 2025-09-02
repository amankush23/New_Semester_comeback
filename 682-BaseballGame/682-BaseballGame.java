// Last updated: 9/2/2025, 11:22:43 PM
class Solution {
    int index=-1;
    List<Integer>list=new ArrayList();
    public int calPoints(String[] operations) {
        for(String str:operations){
            index = list.size()-1;
            if(str.matches("-?\\d+"))
                list.add(Integer.parseInt(str));
            else if(str.equals("+"))
                list.add(list.get(index)+list.get(index-1));
            else if(str.equals("D"))
                list.add(list.get(index)*2);
            else
                list.remove(index);
         
        }
        int total=0;
            for(int i:list)
                total+=i;
        return total;
    }
}