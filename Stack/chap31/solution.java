package code.Stack.chap31;

import java.util.Stack;

public class solution {
	public boolean isPopOreder(int []pPush,int []pPop){
		 // 都为空 返回false
		if(pPush==null||pPop==null){
			return false;
		}
		// 长度不一致返回false
		if(pPush.length==0||pPop.length==0||pPush.length!=pPop.length){
			return false;
		}
		// 利用一个栈缓存入栈元素
		Stack<Integer> stackData = new Stack<Integer>();
		// 已经入栈的元素在pushA中的最大索引
		int pushIndex = 0;
		// 遍历弹出序列
		for(int j=0;j<pPop.length;j++){
			// 当前要弹出的元素
			int cur = pPop[j];
			// 查看栈顶是否为该元素，不是则入栈剩余元素，直到栈顶是该元素，找不到则返回false
			if(!stackData.isEmpty()&&stackData.peek()==cur){
				stackData.pop();
			}else{
				// 余下未入栈的元素中是否有要弹出的元素
				while(pushIndex<pPush.length&&pPush[pushIndex]!=cur){
					stackData.push(pPush[pushIndex]);
					pushIndex++;
				}
				// 遍历完序列未找到
				if(pushIndex==pPush.length){
					return false;
				}else{
					// 找到了目标元素，此时需要入栈元素，然后弹出元素，计算器+1
					pushIndex++;
				}
			}
		}
		return true;
		
	}
}
