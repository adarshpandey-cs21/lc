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
    int max=1;
    public int[] findMode(TreeNode root) {
  HashMap<Integer,Integer> hm=new HashMap<>();
        dfs(root,hm);
        Stack<Integer> st=new Stack<>();
        for(Map.Entry<Integer,Integer> p: hm.entrySet()){
            if(p.getValue()==max){
                st.push(p.getKey());
            }
        }
        int ans[]=new int[st.size()];
        for (int i = 0; i <ans.length ; i++) {
            ans[i]=st.pop();
        }
        return ans;
    }
    public void dfs(TreeNode root,HashMap<Integer,Integer> hm){
        if(root==null){
            return;
        }
        dfs(root.left,hm);
        dfs(root.right,hm);
        if(hm.containsKey(root.val)){
            int n=hm.get(root.val);
            hm.put(root.val,n+1);
            max=Math.max(max,n+1);
        }else{
            hm.put(root.val,1);
        }
    }
}