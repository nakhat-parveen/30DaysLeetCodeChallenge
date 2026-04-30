package leetCodeProblems;

/* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store. */

public class ContainerWithMostWater {
	
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length-1;
		int maxArea = 0;
		while(left < right) {
			int width = right - left;
			int hgt = Math.min(height[right], height[left]);
			int currentArea = width * hgt;
			maxArea = Math.max(maxArea, currentArea);
			if(height[left] < height[right]) {
				left ++;
			} else {
				right --;
			}
		}
		return maxArea;
	}

	public static void main(String[] args) {
		
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		int maxArea= maxArea(height);
		System.out.println("The maximum amount of water a container can store is : " + maxArea);

	}

}
