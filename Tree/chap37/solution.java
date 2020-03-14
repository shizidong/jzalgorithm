package code.Tree.chap37;

class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int data) {
		this.data = data;
	}
}

public class solution {
	public String serialize(TreeNode root){
		if(root==null){
			return "";
		}
		StringBuilder builder = new StringBuilder();
		serializeCore(root,builder);
		return builder.toString();
	}

	private void serializeCore(TreeNode root, StringBuilder builder) {
		if(root==null){
			builder.append("#,");
			return;
		}
		builder.append(root.data).append(",");
		serializeCore(root.left, builder);
		serializeCore(root.right, builder);
	}
	
	public TreeNode deSerialize(String str){
		if(str.length()==0){
			return null;
		}
		String []strs = str.split(",");
		return deSerializeCore(strs);
	}

	int index = 0;
	TreeNode deSerializeCore(String[] strs) {
		
	       if(!strs[index].equals("#")) {
	           TreeNode root = new TreeNode(0);     
	           root.data = Integer.parseInt(strs[index++]);
	           root.left = deSerializeCore(strs);
	           root.right = deSerializeCore(strs);
	           return root;
	       }else{
	           index++;
	           return null;
	       }
	   }
	
	
}
