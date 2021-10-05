package it.stackAndQueue;

import java.util.Stack;

/**
 * @author : mark
 * @Date : 2021/10/3 下午4:05
 */
public class myStack1 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public void MyStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    //压入数据
    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        }else if (newNum <= this.getMin()){
            this.stackMin.push(newNum);
        }
        this.stackData.push(newNum);
    }

    //弹出数据
    public int pop(){

        if (this.stackData.isEmpty()){
            throw new RuntimeException("");
        }
        int value = this.stackData.pop();
        if (value == this.getMin()){
            this.stackMin.pop();
        }
        return value;
    }

    //查询当前最小值
    public int getMin(){
        if (this.stackMin.isEmpty()){
            throw new RuntimeException("");
        }
        return this.stackMin.peek();
    }
}
