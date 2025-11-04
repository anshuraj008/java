import java.util.*;

public class TreeCalculation {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){ //O(n)
        if(root == null){    
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static int count(Node root){ //O(n)
        if(root == null){
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        return leftCount + rightCount + 1;
    }

    public static int sum(Node root){ //O(n)
        if(root == null){
            return 0;
        }
        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
    }

    public static int diameter1(Node root){ //O(n^2)
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameter1(root.left);
        int rightDiameter = diameter1(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(leftDiameter, rightDiameter));
    }

    static class Info{
        int diameter;
        int height;

        public Info(int diameter, int height){
            this.diameter = diameter;
            this.height = height;
        }
    }

    public static Info diameter2(Node root){ //O(n)
        if(root == null){
            return new Info(0, 0);
        }
        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diameter = Math.max(leftInfo.height + rightInfo.height + 1, Math.max(leftInfo.diameter, rightInfo.diameter));
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        return new Info(diameter, height);
    }

    public static boolean isIdentical(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        else if(root == null || subRoot == null){
            return false;
        }
        if(root.data != subRoot.data){
            return false;
        }

        if(!isIdentical(root.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(root.right, subRoot.right)){
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        
        // boolean leftAns = isSubtree(root.left, subRoot);
        // boolean rightAns = isSubtree(root.right, subRoot);
        // return leftAns || rightAns;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    static class Info2{
        Node node;
        int hd;

        public Info2(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    } 

    public static void topView(Node root){
        //Level order
        Queue<Info2> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info2(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info2 curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)){ //first time hd is seen, add to map
                 map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                  q.add(new Info2(curr.node.left, curr.hd - 1));
                  min = Math.min(min, curr.hd - 1);
                }
                if(curr.node.right != null){
                   q.add(new Info2(curr.node.right, curr.hd + 1));
                   max = Math.max(max, curr.hd + 1);
                }
            }  
        }

        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    //Kth level
    public static void KLevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
            return;
        }
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }

        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if(foundLeft || foundRight){
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2){ //O(n)
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(root, n1, path1);
        getPath(root, n2, path2);

        //LCA
        int i = 0;
        while(i < path1.size() && i < path2.size()){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
        }
        //last equal node -> i-1th index
        return path1.get(i - 1);
    }

    public static Node lca2(Node root, int n1, int n2){ //O(n)
        if(root == null){
            return null;
        }
        if(root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLCA = lca2(root.left, n1, n2);
        Node rightLCA = lca2(root.right, n1, n2);

        //leftLCA=val rightLCA = null
        if(leftLCA == null){
            return rightLCA;
        }
        if(rightLCA == null){
            return leftLCA;
        }
        return root;
    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        } else if(leftDist == -1){
            return rightDist + 1;
        } else {
            return leftDist + 1;
        } 
    }

    public static int minDist(Node root, int n1, int n2){
        Node lcaNode = lca2(root, n1, n2);
        int dist1 = lcaDist(lcaNode, n1);
        int dist2 = lcaDist(lcaNode, n2);
        return dist1 + dist2;
    }

    public static int KAncestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftDist = KAncestor(root.left, n, k);
        int rightDist = KAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if(max + 1 == k){
            System.out.println("Kth Ancestor: " + root.data);
        }
        return max + 1;
    }

     public static int transform(Node root){
        if(root == null){
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;

        root.data = newLeft + leftChild + newRight + rightChild;
        return data;
     }

     public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
     }

    public static void main(String[] args) {
        //Binary Tree Construction
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        //subtree calculations
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sum(root));
        System.out.println(diameter1(root));
        System.out.println(diameter2(root).diameter);
        System.out.println(diameter2(root).height);

        System.out.println(isSubtree(root, subRoot));

        topView(root); 

        //Kth level
        int k = 3;
        KLevel(root, 1, k);

        Node lcaNode = lca(root, 4, 6);
        System.out.println("\nLCA: " + lcaNode.data);

        Node lcaNode2 = lca2(root, 4, 5);
        System.out.println("LCA2: " + lcaNode2.data);

        int n1 = 4, n2 = 6;
        System.out.println("Min dist: " + minDist(root, n1, n2));

        int n = 5, K = 2;
        KAncestor(root, n, K); 

        transform(root);
        preorder(root);
    }
}
