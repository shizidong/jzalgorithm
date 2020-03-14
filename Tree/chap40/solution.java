package code.Tree.chap40;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class solution {
	public  ArrayList<Integer> getLeastNumbers(int []nums, int k){
		ArrayList<Integer> list = new ArrayList<Integer>();
		int lens = nums.length;
		if(nums == null || lens == 0 || k > lens || k <= 0){
			return list;
		}
		//红黑树的底层是TreeSet，TreeSet会自动按升序排序
		TreeSet<Integer> kSet = new TreeSet<Integer>();
		for (int i = 0; i < lens; i++) {
			//如果set中的数量小于k的值，就直接添加进去
			if(kSet.size() < k){
				kSet.add(nums[i]);
				//大于k的值，和set中最顶层的数据进行比较
			}else if(nums[i] < kSet.last()){
				kSet.remove(kSet.last());
				kSet.add(nums[i]);
			}
		}
		//调用iterator迭代set中的数据
		Iterator<Integer> iterator = kSet.iterator();
		//只要还有元素就输出，添加到链表中
		while(iterator.hasNext()){
			list.add(iterator.next());
		}
		return list;
	}
}
