package code.String.chap46;

public class solution {
	 public static int getTranslationCount(int number){
	        if(number<0)return 0;
	        if(number==1)return 1;
	        
	        return getTranslationCount(Integer.toString(number));
	    }
	   
	    public static int getTranslationCount(String str) {
	        int f1 = 1;
	        int f2 = 1;
	        int g = 0;
	        int temp;
	        
	        //除去两个初始值
	        for(int i=str.length()-2;i >= 0;i--){
	            if(Integer.parseInt(str.charAt(i) + "" + str.charAt(i+1)) < 26)
	                g = 1;
	            else
	                g = 0;
	            temp = f2;
	            f2 = f2 + g*f1;
	            f1 = temp;
	        }
	        return f2;
	    }
}