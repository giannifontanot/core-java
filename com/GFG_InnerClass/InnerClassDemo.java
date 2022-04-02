package com.GFG_InnerClass;

public class InnerClassDemo {

    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        outerObject.printClass();
        innerObject.printClass();
    }

}

class OuterClass{

    static int outer_x = 10;
    int outer_y = 20;
    private int outer_private = 30;

    void printClass(){
        System.out.println("Outer this.getClass(): " + this.getClass());
    }

    class InnerClass {
        public void display(){
            System.out.println("outer_x " + outer_x);
            System.out.println("outer_y " + outer_y);
            System.out.println("outer_private " + outer_private);
        }

        void printClass() {
            System.out.println("Inner this.getClass(): " + this.getClass());
        }
    }
}
