class Solution {
    public int maxArea(int[] height) {
        int max = 0; 
        int n = height.length;
        int left = 0; 
        int right = n - 1;
        int st = 0;
        int end = 0;
        while (left < right) {
            int currAr = Math.min(height[left], height[right]) * (right - left);
            if (max < currAr) {
                st = left;
                end = right;
            }
            max = Math.max(max, currAr);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Left index: " + st);
        System.out.println("Right index: " + end);
        return max;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0; 
        int n = height.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }
}

class Solution {
    public int maxArea(int[] height) {
        int max = 0; 
        int n = height.length;
        int left = 0; 
        int right = n-1;
        while(left < right){
            if(height[left] < height[right]){
                max = Math.max(max, (right-left)*height[left]);
                left++;
            }else{
                max = Math.max(max, (right-left)*height[right]);
                right--;
            }
        }
        return max;
    }
}