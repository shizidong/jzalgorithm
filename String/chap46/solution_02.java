package code.String.chap46;

public class solution_02 {
	    public int getTranslationCount(String s) {
	        int[] dp = new int[s.length()+1];
	        dp[0] = 1;  // 为空字符串1种解码方法
	        dp[1] = 1;	// 长度为1时也是一种
	        for(int i = 2; i <= s.length(); i++){
	            dp[i] += dp[i-1];
	            // 判断能否组成合法的 dp[i-2]
	            if(s.charAt(i-2) == '1' || (s.charAt(i-2) == '2' && s.charAt(i-1) <= '5'))
	            dp[i] += dp[i-2];
	        }
	        return dp[s.length()];
	    }
	

}
