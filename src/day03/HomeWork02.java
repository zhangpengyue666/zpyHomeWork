package day03;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        int [] arr=new int[8];
        Scanner sc=new Scanner(System.in);
        System.out.println("从键盘上依次输入8个整数");
        int [] result=new int[2];

        //键盘输入8个整数，并判断奇数和偶数的个数
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            if(arr[i]%2==0){
                result[0]++;
            }else{
                result[1]++;
            }
        }

        //定义奇、偶数组
        int[] even=new int[result[0]];   //偶数数组
        int[] odd=new int[result[1]];   //奇数数组
        divAndPrint(arr,even,odd);
    }
    //将arr中的元素值按奇数偶数放入对应的数组中,并交替输出
    private static void divAndPrint(int[] arr,int[] even,int[] odd){
        int m=0,n=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even[m++]=arr[i];
            }else{
                odd[n++]=arr[i];
            }
        }

        if(odd.length>even.length){//如果奇数的个数较多
            for(int i=0;i<even.length;i++)     //先交替输出（偶数数组长度）
                System.out.print(odd[i]+" "+even[i]+" ");
            for(int i=even.length;i<odd.length;i++) //在输出剩下的奇数
                System.out.print(odd[i]+" ");
        }else{                          //偶数个数多 或者 奇、偶数组长度相同
            for(int i=0;i<odd.length;i++)
                System.out.print(odd[i]+" "+even[i]+" ");
            for(int i=odd.length;i<even.length;i++)  //如果奇数数组与偶数数组长度相同，则不进行此循环。
                System.out.print(even[i]+" ");
        }

    }
}
