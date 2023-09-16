class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] mapS1 = new int[26];
        int[] mapS2 = new int[26];

        for(char ch : s1.toCharArray()){
            mapS1[ch-'a']++;
        }
        // System.out.println(Arrays.toString(mapS1));
        int start = 0;
        int end = s1.length()-1;

        while(end < s2.length() && start < s2.length()){
         
            if(start > end){
                start = start - (s1.length()-1);
                end++;
                // int temp[] = new int[26];
                // mapS2 = temp;
                for(int i = 0; i < 26; i++){
                    mapS2[i] = 0;
                }
            }
            mapS2[s2.charAt(start)-'a']++;
            start++;
               if(Arrays.equals(mapS1,mapS2)){
                return true;
            }
            
        }
        return false;
    }
}