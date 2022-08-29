package Final_Prac_Problm.Q4;

import java.util.Scanner;
import java.util.Stack;

public class Binary_Tree {
    Node root;
    Binary_Tree(){
        this.root=null;
    }
    public void inorder_Stack(){
        if(root==null){
            return;
        }
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
        while (curr!=null || s.size()>0){
            while (curr!=null){
                s.push(curr);
                //System.out.print(curr.data + " ");preorder traversal
                curr=curr.left;
            }
            curr = s.pop();
            //System.out.print(curr.data + " ");inorder traversal
            curr=curr.right;

        }

    }
    public void inorder_Loop(){
        Node current, pre;

        if (root == null)
            return;

        current = root;
        while (current != null)
        {
            if (current.left == null)
            {
                System.out.print(current.data + " ");
                current = current.right;
            }
            else {
                pre = current.left;
                while (pre.right != null && pre.right != current) {
                    pre = pre.right;
                }
                if (pre.right == null) {
                    pre.right = current;
                    current = current.left;
                }
                else
                {
                    pre.right = null;
                    System.out.print(current.data + " ");
                    current = current.right;
                }
            }
        }
    }
    public void create_Tree(int value){
        Node newnode = new Node(value);
        if(root==null){
            root=newnode;
        }else{
            Scanner sc = new Scanner(System.in);
            Node current = root;
            Node parent = null;
            while (true) {
                parent = current;
                System.out.println("Which side you want to insert value?");
                int x=sc.nextInt();
                if (x==1) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newnode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newnode;
                        return;
                    }
                }
            }
        }
        }

}

