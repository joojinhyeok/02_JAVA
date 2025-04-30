package main.java.basic.ch13.sec01;

public class Box <T>{
    public T content;

    public T getValue(){
        return content;
    }

    public void setValue(T content){
        this.content = content;
    }
}
