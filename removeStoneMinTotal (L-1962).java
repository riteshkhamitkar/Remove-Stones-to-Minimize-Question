class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());//add all elements in descending order
        for(int i:piles){
            pq.add(i);
        }
        while(!pq.isEmpty() && k-->0){
            int x=pq.poll();
            int a=x-(int)Math.floor(x/2);// divide the element and add again to queue
            pq.add(a);
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();//sum the total answer
        }
        return sum;
    }
}
