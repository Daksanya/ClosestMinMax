import java.util.Scanner;

public class MinMaxSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[n];
        for (int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        System.out.println(subArray(array,n));
    }
    static int subArray(int[] array,int n){
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,minIndex=-1,maxIndex=-1,count=0;
        for (int i=0;i<n;i++){
            if(array[i]<min){
                min=array[i];
                minIndex=i;
            }
            if(array[i]>max){
                max=array[i];
                maxIndex=i;
            }
        }
        for(int i=min;i<max;i++){
            count++;
        }
        return count;
    }
}
