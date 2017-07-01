import java.util.Scanner;

class Node {
	Node lchild;
	Node rchild;
	char c;
}

public class Main {
	


	/**
	 * 后序遍历
	 * 
	 * @param node
	 */
	public void postOrder(Node node) {
		if (node.lchild != null) {
			postOrder(node.lchild);
		}
		if (node.rchild != null) {
			postOrder(node.rchild);
		}
		System.out.print(node.c);
	}
	
	public Node buildTree(int s1,int e1,int s2,int e2,char[] c1,char[] c2){
		//前序遍历为s1--->e1,中序遍历为s2---->e2
		Node root = new Node();
		//前序遍历第一个字符是root的数值
		root.c=c1[s1];
		//中序遍历中root节点的位置
		int rootId = 0;
		for(int i = s2;i<=e2;i++){
			if(c2[i]==c1[s1]){
				rootId=i;
				break;
			}
		}
		
		//之后便可知道左右子树的个数，递归
		if(rootId!=s2){
			//若左子树不为空
			root.lchild=buildTree(s1+1, s1+(rootId-s2), s2, rootId-1, c1, c2);
		}
		if(rootId!=e2){
			//若左子树不为空
			root.rchild=buildTree(s1+(rootId-s2)+1, e1, rootId+1, e2, c1, c2);
		}
		
		//返回根节点
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			String str1 = in.next();
			String str2 = in.next();

			//存储先序遍历和中序遍历
			char[] c1 = str1.toCharArray();
			char[] c2 = str2.toCharArray();
			
			Node node = new Main().buildTree(0, str1.length()-1, 0, str2.length()-1, c1, c2);
			new Main().postOrder(node);
			System.out.println();
		}
	}

}
