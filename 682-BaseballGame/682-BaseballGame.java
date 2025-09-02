// Last updated: 9/2/2025, 11:21:47 PM
class Solution {
    int index=-1,total=0;
    List<Integer>list=new ArrayList();
    public int calPoints(String[] operations) {
        for(String str:operations){
            index = list.size()-1;
            boolean flag=true;
            if(str.matches("-?\\d+"))
                list.add(Integer.parseInt(str));
            else if(str.equals("+"))
                list.add(list.get(index)+list.get(index-1));
            else if(str.equals("D"))
                list.add(list.get(index)*2);
            else{
                flag=false;
                total-=list.get(index);
                list.remove(index);
                }
            if(flag)
                total+=list.get(index+1);
        }
        return total;
    }
}