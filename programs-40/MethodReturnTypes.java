package com.Shivangani;

public class MethodReturnTypes {
    public static void main(String[]args){
        int mul = multiplynumbers(12, 6);
        System.out.println(mul);
        float d= divide(65,7);
        System.out.println(d);
        Void voidmethod =new Void();
        voidmethod.print();
        String str= returnString();
        System.out.println(str);
    }
    private static int multiplynumbers(int a, int b) {
        int z = a * b;
        return z;
    }

    int val = 150;
    //int return type
    int operation(int val) {
        val = val * 10 / 100;
        return (val);

    }
    //return typ is float
    private static float divide(float a, float b){
        float res=a/b;
        return res;
    }

    private static String returnString() {
        return "Hi,I am a string return type method and returning this String";
    }
}
class Void{
    static void print(){
        System.out.println("This is a void method");
    }

}