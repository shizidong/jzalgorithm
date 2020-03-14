package code.String.chap20;

public class solution {
	public boolean isNumeric(char[] str) {
		if(str==null||str.length==0) return false;
		// signal表示符号，decimal表示小树点，hasE表示含有符号e
		boolean signal = false, decimal = false, hasE = false;
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'e' || str[i] == 'E') {
				if (i == str.length - 1)
					return false; // e或E后面必须跟数字
				if (hasE)
					return false; // 不能有两个e
				hasE = true;
			} else if (str[i] == '+' || str[i] == '-') {
				// 不是第一次出现，那么后面只能出现在e后面
				if (signal && str[i - 1] != 'e' && str[i - 1] != 'E') {
					return false;
				}
				// 第一次出现，还要判断是不是在e后面
				if (!signal && i > 0 && str[i - 1] != 'e' && str[i - 1] != 'E') {
					return false;
				}
				signal = true;
			} else if (str[i] == '.') {
				// e后面不能接小数点,小数点不能出现两次
				if (hasE || decimal)
					return false;
				decimal = true;
			}else if (str[i] < '0' || str[i] > '9') // 不合法字符
                return false;
		}
 
		return true;
	}
}
