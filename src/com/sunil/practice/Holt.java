package com.sunil.practice;

interface BaseI{
    void method();
}

class BaseC{
    public void method(){
        System.out.println();
    }
}

class ImplC extends BaseC implements BaseI{

}

public class Holt extends Thread implements Runnable{
    int i=0;
    public void run(){
        while(true){
            i++;
            System.out.println("i="+i);
        } //End while
        //return 1;
    }//End run
}

