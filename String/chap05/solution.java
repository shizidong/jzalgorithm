package code.String.chap05;

public class solution {
	public String replaceSpace(StringBuilder str){
		if(str.length()<=0||str==null){
			return null;
		}
		int space = 0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				space++;
			}
		}
		int oldLength = str.length();
		int oldIndex = oldLength - 1;
		int newLength = oldLength + space * 2;
		int newIndex = newLength - 1;
		str.setLength(newLength);
		while(newIndex>-1){
			if(space==0){
				break;
			}
			if(str.charAt(oldIndex)==' '){
				oldIndex--;
				str.setCharAt(newIndex--, '0');
				str.setCharAt(newIndex--, '2');
				str.setCharAt(newIndex--, '%');
				space--;
			}else {
				str.setCharAt(newIndex--, str.charAt(oldIndex--));
			}
		}
		return str.toString();
		
	}
}
