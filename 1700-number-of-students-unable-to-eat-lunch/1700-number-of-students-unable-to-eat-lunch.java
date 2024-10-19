class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int j=0;
        int count=0;
       while (true){
            if(q.peek()==sandwiches[j]){
                j++;
                q.remove();
                count=0;
            }
            else if(q.peek()!=sandwiches[j]){
                int front=q.remove();
                q.add(front);
                count++;
            }
            if(count==q.size()|| q.size()==0)
                break;

        }
        return q.size();
    }
}