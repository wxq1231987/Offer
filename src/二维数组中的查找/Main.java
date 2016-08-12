package 二维数组中的查找;

public class Main {
    public static boolean Find(int [][] array,int target) {
    	boolean result = false;
    	for(int i=0;i<array.length;i++) {
    		for(int j=0;j<array[i].length;j++) {
    			if(array[i][j]==target) {
    				result = true;
    			}
    		}
    	}
    	return result;
	}
	public static void main(String[] args) {
		System.out.println(Find(new int[][]{{1,2,3},{4,5,6},{7,8,9}},7));
	}
}
