package Class_1_Array;

public class Insert_Middle {
    int[] a=new int[100];
    int value;
    int n;
    Insert_Middle(int a[],int value,int n){
        this.a = a;
        this.value = value;
        this.n = n;
    }
    void insert(int a[],int value,int n) {
        int position = 0;
        for (int i = 0; i < n; i++) {
            if (value > a[i]) {
                position = i + 1;
                System.out.println("Position-" + position);
            }
        }
        //int n1 = n+1;

        for (int j = n-1 ; j >= position; j--) {

            a[j + 1] = a[j];
        }
        a[position] = value;
        n++;
    }
    void print(){
        for (int i = 0; i <= n; i++) {
            System.out.println(a[i]);
        }
    }
}
