class Solution {
    public static void main(String[] args){
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target=5;
        System.out.println(searchMatrix(arr,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int lo=0;
        int hi=matrix[0].length-1;
        while(lo<matrix.length && hi>=0){
            if(matrix[lo][hi] == target)return true;
            else if(matrix[lo][hi]<target)lo++;
            else hi--;
        }
        return false;
    }
}