class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        Arrays.sort(strs);
        String fir=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<fir.length()&&i<last.length()&&fir.charAt(i)==last.charAt(i)){
            i++;
        }
        return fir.substring(0,i);
    }
}