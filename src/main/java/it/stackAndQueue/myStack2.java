package it.stackAndQueue;

import java.util.Stack;

/**
 * @author : mark
 * @Date : 2021/10/3 下午5:18
 */
public class myStack2 {

    private Stack<Integer> stackData;
    private Stack<Integer> stackMin;

    public void MyStack1(){
        this.stackData = new Stack<Integer>();
        this.stackMin = new Stack<Integer>();
    }

    //压入元素
    public void push(int newNum){
        if (this.stackMin.isEmpty()){
            this.stackMin.push(newNum);
        } else if (newNum < this.getMin()){
            this.stackMin.push(newNum);
        } else {
            int newMin = this.stackMin.peek();
            this.stackMin.push(newMin);
        }
        this.stackData.push(newNum);
    }


    public int pop(){
        if (this.stackData.isEmpty()) {
            throw new RuntimeException("");
        }
        this.stackMin.pop();
        return this.stackData.pop();
    }


    public int getMin(){
        if (this.stackMin.isEmpty()) {
            throw new RuntimeException("");
        }
        return this.stackMin.peek();
    }
}
