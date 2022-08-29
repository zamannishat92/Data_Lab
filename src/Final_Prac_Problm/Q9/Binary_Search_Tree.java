package Final_Prac_Problm.Q9;

public class Binary_Search_Tree {
     Node root;
    Binary_Search_Tree(){
        this.root=null;
    }
    void insert(int value){
        Node newnode = new Node(value);
        if(root==null){
            root=newnode;
        }else{
            Node current=root;
            Node parent=null;
            while (true){
                parent=current;
                if(value<current.data){
                    current=current.left;
                    if(current==null){
                        parent.left=newnode;
                        return;
                    }
                }else{
                    current=current.right;
                    if(current==null){
                        parent.right=newnode;
                        return;
                    }
                }
            }
        }
    }
    void search(int value){
        Node current=root;
        while(current!=null){
            if(value==current.data){
                System.out.println("Found Data.");
                break;
            }else if(value<current.data){
                current=current.left;
            }else{
                current=current.right;
            }
        }
    }
    public void delete(int value){
        Node current=root;
        Node parent=root;
        while(current.data!=value){
            parent = current;
            if(current==null){
                System.out.println("tree is empty.");
            }
            else if(value<current.data){
                current=current.left;
            }else{
                current=current.right;
            }
        }
        if(current.left==null && current.right==null){
            if(current==root){
                root=null;
            }if(current.data==value){
                current=null;
            }
        }
        else if(current.left==null ){
            if(current==root){
                root=current.right;
            }else if(parent.right==current){
                parent.right=current.right;
            }else{
                parent.left=current.right;
            }
        }
        else if(current.right==null ){
            if(current==root){
                root=current.left;
            }else if(parent.right==current){
                parent.right=current.left;
            }else{
                parent.left=current.left;
            }
        }
        else if(current.left!=null && current.right!=null){
            Node successsor=getSuccessor(current);
            if(current==root){
                root=successsor;
            }else if(parent.right==current){
                parent.right=successsor;
            }else{
                parent.left=successsor;
            }
            successsor.left = current.left;
        }
    }
    public Node getSuccessor(Node deleleNode){
        Node successsor =null;
        Node successsorParent =null;
        Node current = deleleNode.right;
        while(current!=null){
            successsorParent = successsor;
            successsor = current;
            current = current.left;
        }
        if(successsor!=deleleNode.right){
            successsorParent.left = successsor.right;
            successsor.right = deleleNode.right;
        }
        return successsor;
    }
    void print_Tree(Node root){
        if(root!=null){
            print_Tree(root.left);
            System.out.print(" "+root.data);
            print_Tree(root.right);
        }
    }
}
