class Solution {
    public boolean searchMatrix(int[][] m, int target) {
        int count=0;
        if(m[m.length-1][m[0].length-1]<target)
        return false;
        for(int i=0;i<m.length;i++){
            if((m[i][0]>= target) && (m[i][m[0].length-1]<=target))
            {
                count=i;
                break;
            }
            if(m[i][0]== target || m[i][m[0].length-1]==target)
            return true;

        }
        for(int i=0;i<m[0].length;i++){
            if(m[count][i]==target)
                return true;
        }
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==target)
                return true;
            }
        }
        return false;
    }
}