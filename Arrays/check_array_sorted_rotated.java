class Solution {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) /* yeh wrap around(last and first element ko
             compare karte hai e.g 2,1,3,4 agar isme last and 1 compare nahi karenge tu yeh
              rotated and sorted batayega but esha nahi hai) case ke liye */
                count++;
            if (count > 1) 
                return false;
        }
        
        return true;
    }
}
