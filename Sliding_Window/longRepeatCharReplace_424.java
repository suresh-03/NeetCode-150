package Sliding_Window;

public class longRepeatCharReplace_424 {
    public static void main(String[] args) {
        System.out.println(characterReplacement("IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR",2));
    }
    public static int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int ans = 0;
        int check = Integer.MIN_VALUE;

        int[] map = new int[26];

        for(;right < s.length(); right++){
            map[s.charAt(right)-'A']++;
            check = Math.max(check,map[s.charAt(right)-'A']);
            // map[s.charAt(right)-'A']++;
            while((right-left+1)-check > k){
                map[s.charAt(left)-'A']--;
                // check = Math.max(check,map[s.charAt(right)-'A']);
                
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }

        return ans;   
    }
}
