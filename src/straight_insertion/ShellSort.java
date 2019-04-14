package straight_insertion;

public class ShellSort {
    public void  shellSort(int r[],int n){
        int i = 0,d = 0,j = 0;
        for (d=n/2;d>=1;d=d/2){
            for (i=d+1;i<n;i++){
                r[0] = r[i];
                for (j=i-d;j>0&&r[0]<r[j];j=j-d)
                    r[j+d]=r[j];
                r[j+d] = r[0];
            }
        }
    }
}
