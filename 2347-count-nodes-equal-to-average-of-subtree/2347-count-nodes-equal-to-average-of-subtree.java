/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count =0;
    public int averageOfSubtree(TreeNode root) {
        
   average(root);
        return count;
    }
    class Pair{
        int total=0;
        int sum=0;

    }
    public  Pair average(TreeNode root){
        if(root==null){
            return new Pair();
        }
        Pair lh=average(root.left);
        Pair rh=average(root.right);
        
        Pair self=new Pair();
        self.total=1+rh.total+ lh.total;
        self.sum=root.val+ lh.sum+rh.sum;
        if(self.sum/ self.total== root.val){
            count++;
        }
        return self;

    }

}