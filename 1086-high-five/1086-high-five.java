class Solution 
{
    public int[][] highFive(int[][] items) 
    {
       HashMap<Integer,ArrayList<Integer>> hm = new HashMap<>();
       ArrayList<Integer> values = new ArrayList<>();
       for(int i=0;i<items.length;i++)
       {
           ArrayList<Integer> temp;
           if(hm.containsKey(items[i][0]))
           {
               temp = hm.get(items[i][0]);
               temp.add(items[i][1]);
           }
           else{
               temp = new ArrayList<>();
               temp.add(items[i][1]);
               values.add(items[i][0]);
           }
           hm.put(items[i][0],temp);
       }
       Iterator<Integer> it = values.listIterator();
        int ans[][] = new int[values.size()][2];
        int i=0;
        while(it.hasNext())
        {
            int x = it.next();
            ArrayList<Integer> temp = hm.get(x);
            Collections.sort(temp, Collections.reverseOrder());
            int sum = temp.get(0)+temp.get(1)+temp.get(2)+temp.get(3)+temp.get(4);
            ans[i][0] = x;
            ans[i][1] = sum/5; 
            i++;
        }
        Arrays.sort(ans,(a,b)->a[0]-b[0]);
        return ans;
        
    }
}