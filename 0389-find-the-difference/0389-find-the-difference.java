class Solution {
    public char findTheDifference(String s, String t) {
        int f1[] = new int[256];
        int f2[] = new int[256];
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            f1[ch]++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            f2[ch]++;
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(f1[ch] != f2[ch])
                return ch;
        }
        return ' ';
    }
}