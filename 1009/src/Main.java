import java.util.Scanner;

class Node{
	Node left;
	Node right;
	int data;
	public Node(int data) {
		super();
		this.data = data;
	}
	
}

public class Main {
	
	public static void insert(Node node,int x){
		if(x<node.data){
			if(node.left==null){
				node.left = new Node(x);
			}
			else {
				insert(node.left,x);
			}
		}
		if(x>node.data){
			if(node.right==null){
				node.right = new Node(x);
			}else {
				insert(node.right,x);
			}
		}
	}

	public static void preOrder(Node root,StringBuilder sb){
		sb.append(root.data);
		if(root.left!=null){
			preOrder(root.left, sb);
		}
		if(root.right!=null){
			preOrder(root.right, sb);
		}
	}
	public static void inOrder(Node root,StringBuilder sb){
		
		if(root.left!=null){
			inOrder(root.left, sb);
		}
		sb.append(root.data);
		if(root.right!=null){
			inOrder(root.right, sb);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			if(n==0){
				break;
			}
			String real = in.next();
			Node root = new Node(real.charAt(0)-'0');
			for (int i = 1; i < real.length(); i++) {
				insert(root, real.charAt(i)-'0');
			}
			StringBuilder sbPre = new StringBuilder();
			StringBuilder sbIn = new StringBuilder();
			preOrder(root, sbPre);
			inOrder(root, sbIn);
//			System.out.println("sbpre------>"+sbPre);
//			System.out.println("sbin------>"+sbIn);
			
			for (int i = 0; i <n; i++) {
				String real1 = in.next();
				Node root1 = new Node(real1.charAt(0)-'0');
				for (int j = 1; j < real1.length(); j++) {
					insert(root1, real1.charAt(j)-'0');
				}
				StringBuilder sbPre1 = new StringBuilder();
				StringBuilder sbIn1 = new StringBuilder();
				preOrder(root1, sbPre1);
				inOrder(root1, sbIn1);
				
//				System.out.println("sbpre1------>"+sbPre1);
//				System.out.println("sbin1------>"+sbIn1);
//				System.out.println(sbPre.equals(sbPre1));
				if(sbPre.toString().equals(sbPre1.toString())&&sbIn.toString().equals(sbIn1.toString())){
					System.out.println("YES");
				}else System.out.println("NO");
			}
		}
	}

}
