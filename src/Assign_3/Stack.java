package Assign_3;

public class Stack {
    private String[] stack;
    private int top;
    private int size;

    public Stack(int size){
        this.size=size;
        this.top=-1;
        this.stack=new String[size];
    }
    public void push(String item){
        System.out.println(top);
        if(top!=stack.length-1){
            top++;
            System.out.println(top);
            stack[top]=item;
            System.out.println("Pushed successfully");
        }else{
            System.out.println("Stack over-follow");
        }
    }
    public void check_Bracket(String[] arr){
        int flag=0,count1=0,count2=0;
        if(arr.length%2 ==0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]=="("||arr[i]=="{"||arr[i]=="["){
                    push(arr[i]);
                }else{
                    String pop = stack[top];
                    top--;
                    if(arr[i]==")"&&pop!="(") {
                        System.out.println("UnMatched");
                        flag++;
                        break;
                    }else if(arr[0]=="}"&&pop!="{"){
                        System.out.println("UnMatched");
                        flag++;
                        break;
                    }else if(arr[i]=="]"&&pop!="["){
                        System.out.println("UnMatched");
                        flag++;
                        break;
                    }
                }
            }
            if(top==-1 && flag==0){
                System.out.println("Balanced");
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]=="("||arr[i]=="{"||arr[i]=="["){
                    count1++;
                }
                else{
                    count2++;
                }
            }
            if(count1>count2){
                System.out.println("Opening bracket overFlowed!");
            }else{
                System.out.println("Closing bracket overFlowed!");
            }

        }
    }

}
