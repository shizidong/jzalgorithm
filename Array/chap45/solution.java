package code.Array.chap45;

import java.util.Arrays;
import java.util.Comparator;

public class solution {
	public String printMinNumber(int num[]){
		if(num==null||num.length==0){
			return "";
		}
		int len = num.length;
		//将数组元素转换为字符串数组中的元素，即用字符串表示数字，应对大数溢出问题
		String[] str = new String[len];
		for(int i=0;i<len;i++){
			//返回一个特定参数的字符串
			str[i] = String.valueOf(num[i]);
		}
		//java.util.Comparator（接口），对某个collection进行整体排序的比较函数，
		//可以将Comparator传递给sort方法，如Collections.sort()或Arrays.sort()。
		//Comparator有两个方法，int compare(T o1, T o2)和boolean equals(Object obj)，
		//如果想按指定的顺序排序，需要重写compare方法。

		Arrays.sort(str,new Comparator<String>() {
			//如果o1+o2大于o2+o1，返回正数，交换o1和o2的位置，
			//如果o1+o2小于o2+o1，返回负数，保持o1，o2的位置顺序.
			@Override
			public int compare(String c1, String c2) {
				return (c1+c2).compareTo(c2+c1);
			}
		});
		StringBuilder builder = new StringBuilder();
		for(int i=0;i<len;i++){
			builder.append(str[i]);
		}
		return builder.toString();
		
	}
}
