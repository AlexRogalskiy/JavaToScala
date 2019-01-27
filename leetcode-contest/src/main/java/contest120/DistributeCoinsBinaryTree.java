package contest120;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        this.val = x;
    }
}


public class DistributeCoinsBinaryTree {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode leftChild = new TreeNode(0);
        root.left = leftChild;
        TreeNode rightChild = new TreeNode(0);
        root.right = rightChild;

        // find > 1 --
        // find 0
        // find distance
        // increase distance
        // tranact count

        int[] X1 = {3, 0, 0};






    }

    static int distance;

    static TreeNode findNearestZeroValueNode(TreeNode root){
        if (root.val == 0){
            return root;
        };
        if (root.right.val == 0){
            return root.right;
        } ;
        if (root.left.val == 0){
            return root.left;
        }

        TreeNode result = findNearestZeroValueNode(root.right);
        if (result != null) return  result;

        result = findNearestZeroValueNode(root.left);
        if(result != null) return result;

        return null;
    }
}