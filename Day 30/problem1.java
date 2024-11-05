class Solution {
    public boolean isAnagram(String s, String t) {
        int sl = s.length(), tl = t.length();

        if(sl != tl){
            return false;
        }
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
}