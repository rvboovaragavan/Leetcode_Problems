class Solution {
    public String largestEven(String s) {
        int res = s.lastIndexOf('2');
        return s.substring(0,res+1);
        
    }
}