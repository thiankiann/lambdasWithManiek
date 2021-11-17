package stackTrace;

public class StackTraceExample {
    public static void main(String[] args) {
        printLine(repeat("hello!"));

    }
    public static void printLine(String str){
        System.out.println("inside printLine() method");
        System.out.println(str);
    }
    public static String repeat(String s){
        System.out.println("inside repeat() method");
        return s + s ;
    }
}
/**
 * stack calling order
 *
 * 1st
 * repeat //line 6
 * main
 *
 * 2nd
 * printLine //line 6 after repeat ends
 * main
 *
 */
