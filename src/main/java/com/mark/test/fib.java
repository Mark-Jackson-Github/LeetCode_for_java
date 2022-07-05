package com.mark.test;

/**
 * @author : mark
 * @Date : 2022/6/24
 */

public class fib {

    public static int fibTest(int n){

        
        public static int fib(int n){
            if(n<=0){
                return n;
            }
            int []Memo=new int[n+1];
            Memo[0]=0;
            Memo[1]=1;
            for(int i=2;i<=n;i++)
            {
                Memo[i]=Memo[i-1]+Memo[i-2];
            }
            return Memo[n];
        }
    }
}
