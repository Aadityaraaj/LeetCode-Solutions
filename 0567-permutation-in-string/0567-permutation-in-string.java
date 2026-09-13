class Solution {
    public boolean checkInclusion(String s1, String s2) {
       int[] ar1 = new int[128];
       int[] ar2 = new int[128];

       int l = 0; int r = 0;

       int k = s1.length();
       
       if(s1.length() > s2.length()) return false;

       while(r<k) {
        ar1[s1.charAt(r)]++;
        ar2[s2.charAt(r)]++;
        r++;
       }
       if(Arrays.equals(ar1, ar2)) return true;

       while(r<s2.length()) {
        ar2[s2.charAt(r)]++;
        ar2[s2.charAt(l)]--;
        if(Arrays.equals(ar1, ar2)) return true;
        l++;r++;
       }
       
       return false;

       }
}