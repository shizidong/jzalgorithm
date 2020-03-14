package code.List.chap41;

import java.util.*;
public class solution {
    private int count = 0;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->o2-o1);
    public void Insert(Integer num) {
        if(count % 2 == 0){
            //当数据总数为偶数时，新加入的元素，应当进入小根堆
            //不是直接进入小根堆，而是经大根堆筛选后取大根堆中最大元素进入小根堆
             //新加入的元素先入到大根堆，由大根堆筛选出堆中最大的元素
            maxHeap.offer(num);
            //弹出的元素和压入的元素可能不为同一个，用中间值来保存
            int elem = maxHeap.poll();
            minHeap.offer(elem);
        }
        else{
            //当数据总数为奇数时，新加入的元素，应当进入大根堆
            //注意不是直接进入大根堆，而是经小根堆筛选后取小根堆中最大元素进入大根堆
            //新加入的元素先入到小根堆，由小根堆筛选出堆中最小的元素
            minHeap.offer(num);
            int elem = minHeap.poll();
            maxHeap.offer(elem);
        }
        count++;
    }

    public Double GetMedian() {
        if(count % 2 == 0){//如果是偶数个数  就把小顶堆的根元素和大顶堆的根元素 拿出
            return (minHeap.peek() + maxHeap.peek())/2.0;
        }
        else{//如果是奇数个数 那说明中位数就在小顶堆的根的位置
            return minHeap.peek()/1.0;
        }
    }


}

