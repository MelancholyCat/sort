package straight_insertion;

/**
 * 直接插入排序：
 * 1.将整个待排序的记录序列划分成有序区和无序区，初始时有序区为待排序记录序列的第一个记录，无序区包括所有剩余待排序的记录
 * 2.将无序区的第一个记录插入到有序区的合适位置中，从而使无序区减少一个记录，有序区增加一个记录
 * 3.重复执行2，直到无序区中没有记录为止。
 */
public class InsertSort {
    public void insertSort(int r[],int n){     //0号单元用作暂存单元和监视哨
        int i,j;
        for (i = 1;i<n;i++){
            r[0] = r[i];                //暂存待插关键码，设置哨兵
            for (j = i-1; r[j] > r[0]; j--) //寻找插入位置
                r[j+1]=r[j];            //记录后移
            r[j+1] = r[0];
        }
    }
}