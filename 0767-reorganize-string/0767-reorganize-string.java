
    class Solution {
    public String reorganizeString(String s) {
        
        Map<Character, Integer> hm = new HashMap();
        char[] arr = s.toCharArray();
        for(char c : arr){
            hm.put(c, hm.getOrDefault(c, 0)+1);
        }
        PriorityQueue<Character> pq = new PriorityQueue((a,b) -> hm.get(b) - hm.get(a));
        
        for(char c : hm.keySet()){
            pq.offer(c);
        }
        
        char cur = pq.poll();
        StringBuilder sb = new StringBuilder();
        sb.append(cur);
        hm.put(cur, hm.get(cur)-1);
        
        while(pq.size() > 0){
            sb.append(pq.peek());
            hm.put(pq.peek(), hm.get(pq.peek())-1);
            char temp = cur;
            if(hm.get(cur) == 0){cur = pq.poll(); continue;}
            else{ cur = pq.poll(); pq.add(temp);}
        }
        if(sb.length() != s.length()){return "";}
        return sb.toString();
    }
}