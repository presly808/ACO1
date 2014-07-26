package week8.tree;

public class BinarySearchTree<T extends Comparable<T>> implements IBinaryTree<T> {

	private TreeNode root;
		
	@Override
	public void add(T element) {
		if(root == null){
			root = new TreeNode(element, null, null, null);
		} else {
			add(root, element);
		}
	}
	
	private void add(TreeNode node, T element){
		for(TreeNode temp = node; temp != null;){
			if(element.compareTo(temp.value) < 0){
				if(temp.lChild == null){
					temp.lChild = new TreeNode(element, temp, null,null);
					break;
				} else {
					temp = temp.lChild;
				}
			} else if(element.compareTo(temp.value) > 0) {
				if(temp.rChild == null){
					temp.rChild = new TreeNode(element, temp, null,null);
					break;
				} else {
					temp = temp.rChild;
				}
			}
		}
	}

	@Override
	public boolean remove() {
		return false;
	}

	@Override
	public boolean contains(T element) {
		return false;
	}
	
	public void showAll(){
		
	}

	
	private class TreeNode {
		
		T value;
		TreeNode root;
		TreeNode lChild;
		TreeNode rChild;
		
		public TreeNode(T value, TreeNode root, TreeNode lChild, TreeNode rChild) {
			super();
			this.value = value;
			this.root = root;
			this.lChild = lChild;
			this.rChild = rChild;
		}
		
	}
	
	
}
