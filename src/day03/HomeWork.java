package day03;

public class HomeWork {
    public static void main(String[] args) {
       //打印等腰三角形
        int n=5;//三角形的层数
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){//控制空格数量
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){//控制*的数量
                System.out.print("*");
            }
            System.out.println();    //打印完一行后，进行换行操作
        }

        System.out.println("\n\n");


        //求100以内所有质数的和
        int sum=0;
        for(int i=2;i<=100;i++){//所有可能为质数的数
            int flag=1;         //设falg=1为质数，而flag=0为非质数。
            for(int j=2;j<i;j++)
                if (i % j == 0) {    //只要i能被2~i-1中的任何一个整数 整除，它就不是质数。
                    flag = 0;
                    break;
                }

            if(flag==1){
                sum+=i;
            }

        }
        System.out.println("100以内的所有质数和:"+sum);
    }
}

