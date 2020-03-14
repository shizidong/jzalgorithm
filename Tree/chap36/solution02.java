package code.Tree.chap36;

import java.util.Stack;

public class solution02 {
    public TreeNode Convert(TreeNode pRootOfTree) {
          if(pRootOfTree==null)
              return null;
          Stack<TreeNode> stack = new Stack<TreeNode>();
          TreeNode p = pRootOfTree;
          TreeNode pre = null;// 用于保存中序遍历序列的上一节点
          boolean isFirst = true;
          while(p!=null||!stack.isEmpty()){
              while(p!=null){
                  stack.push(p);
                  p = p.left;
              }
              p = stack.pop();
              if(isFirst){
                  pRootOfTree = p;// 将中序遍历序列中的第一个节点记为pRootOfTree
                  pre = pRootOfTree;
                  isFirst = false;
              }else{
                  pre.right = p;
                  p.left = pre;
                  pre = p;
              }
              p = p.right;
          }
          return pRootOfTree;
    }
}
