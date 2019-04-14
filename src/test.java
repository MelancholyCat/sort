import straight_insertion.InsertSort;
import straight_insertion.ShellSort;

public class test {
    public static void main(String[] args) {
        int [] a = {59,20,17,36,98,14,23,83,13,28};
        for (int i = 1;i<a.length;i++)
            System.out.print(a[i]+"\t");
        System.out.println("");
//        InsertSort insertSort = new InsertSort();
        ShellSort shellSort = new ShellSort();
//        insertSort.insertSort(a,a.length);
        shellSort.shellSort(a,a.length);
        for (int i = 1;i<a.length;i++)
            System.out.print(a[i]+"\t");
    }
}
