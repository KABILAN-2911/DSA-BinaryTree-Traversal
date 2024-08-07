class TreeNode{
    int val;
    TreeNode left,right;
    TreeNode(int val)
    {
        this.val=val;
        left=right=null;
    }
}

class BinaryTreeCreation
{
    TreeNode root;

    public void inorder(TreeNode root)
    {
        if(root==null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
        
    }

    public void preorder(TreeNode root)
    {
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
    public void postorder(TreeNode root)
    {
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
        
    }
    
}

class BinaryTree2 extends BinaryTreeCreation
{
    TreeNode root;
}



public class BinaryTree {

    public static void main(String args[])
    {
        BinaryTreeCreation bt = new BinaryTreeCreation();
        bt.root = new TreeNode(1);
        bt.root.left = new TreeNode(2);
        bt.root.left.left = new TreeNode(4);
        bt.root.left.right = new TreeNode(5);
        bt.root.left.right.left = new TreeNode(8);
        bt.root.right = new TreeNode(3);
        bt.root.right.left = new TreeNode(6);
        bt.root.right.right = new TreeNode(7);
        bt.root.right.right.left = new TreeNode(9);
        bt.root.right.right.right = new TreeNode(10);
        System.out.println("BinaryTree Traversal");
        System.out.println("\nInorder");
        bt.inorder(bt.root);
        System.out.println("\nPreorder");
        bt.preorder(bt.root);
        System.out.println("\nPostorder");
        bt.postorder(bt.root);
        System.out.println("");

        BinaryTree2 bt1 = new BinaryTree2();
        bt1.root = new TreeNode(4);
        bt1.root.left = new TreeNode(2);
        bt1.root.left.left = new TreeNode(3);
        bt1.root.left.left.right = new TreeNode(9);
        bt1.root.left.left.right.left = new TreeNode(1);
        bt1.root.right = new TreeNode(5);
        bt1.root.right.left = new TreeNode(7);
        bt1.root.right.right = new TreeNode(6);
        bt1.root.right.right.left = new TreeNode(8);
        System.out.println("\nBinaryTree2 Traversal");
        System.out.println("\nInorder");
        bt1.inorder(bt1.root);
        System.out.println("\nPreorder");
        bt1.preorder(bt1.root);
        System.out.println("\nPostorder");
        bt1.postorder(bt1.root);

    }
    
}
