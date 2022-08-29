package ClassAfterMid_1.Stack_LinkedList;

public class LinkedList {
    int size;
    Node top;
    Node head;
    LinkedList(){
        this.top=null;
        this.head=null;
        this.size=0;
    }
    void push(Node newnode){
        if(this.isEmpty()) {
            head = newnode;
            top = newnode;
            size++;
        }
        else {
            top.next = newnode;
            top = newnode;
            size++;
        }
    }
    void find_Middle(){
        Node temp = head;
        if (size % 2 == 0) {
            for(int i=1;i<size/2;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }else{
            for(int i=1;i<=size/2;i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }

    }
    void delete_Middle(){
        Node temp = head;
        if(size==1){
            head=null;
        }else if(size==2){
            head=head.next;
            temp=null;
        }else if(size==3){
            head.next=head.next.next;
        }else{
            if(size%2==0) {
                Node temp1 = head;
                for (int i = 1; i <= size / 2 - 1; i++) {
                    temp1 = temp1.next;
                }
                temp1.next = temp1.next.next;
            }else {
                Node temp2 = head;
                for (int i = 1; i <= size / 2 - 1; i++) {
                    temp2 = temp2.next;
                }
                temp2.next = temp2.next.next;
            }
        }
    }

    public boolean isEmpty() {
        if(top == null)
            return true;
        return false;
    }
    void pop(){
        if(isEmpty()) {
            System.out.println("Stack Underflow\n");
        }
        else {
            int x = top.data;
            if(head == top) {
                top = null;
                head = null;
                size--;
            }
            else {
                Node temp = head;
                while(temp.next != top)
                    temp = temp.next;
                temp.next = null;
                top = temp;
                size--;
            }
        }
    }

    void print() {
        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data+"\t");
            temp = temp.next;
        }

        System.out.println("");
    }


}
