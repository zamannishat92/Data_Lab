package Class_1_Array;

public class Insert_First {
    int[] a = new int[100];
    int value;
    int n;

    Insert_First(int a[], int value, int n) {
        this.a = a;
        this.value = value;
        this.n = n;
    }

    void insert(int a[], int value, int n) {
        int temp = 0;
        temp = a[0];
        a[0] = value;
        for (int j = n - 1; j >= 1; j--) {

            a[j + 1] = a[j];
        }
        a[1] = temp;
        n++;
    }
    void print(){
        for (int i = 0; i <= n; i++) {
            System.out.println(a[i]);
        }

    }
}