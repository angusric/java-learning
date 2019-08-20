package javatest;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

public class ContinueBreakRerunTest {

    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("1","d");



        //break test
        testBreak();
        System.out.println("--------DONE-------");
        //continue test
        testcontinue();
        System.out.println("-------DONE--------");
        //return test
        testReturn();
        System.out.println("-------DONE--------");

    }

    /**
     * break用于完全结束一个循环，跳出循环体。不管是哪种循环，一旦在循环体中遇到break，
     * 系统将完全结束循环，开始执行循环之后的代码。 break不仅可以结束其所在的循环，还可结束其外层循环。
     * 此时需要在break后紧跟一个标签，这个标签用于标识一个外层循环。Java中的标签就是一个紧跟着英文冒号（:）的标识符。
     * 且它必须放在循环语句之前才有作用。
     */
    public static void testBreak(){
        System.out.println("TEST break------");
        // 外层循环，outer作为标识符
        outflag:
        for (int i = 0; i < 5; i++) {
            System.out.println("i==="+i);

            for (int j = 0; j < 3; j++) {
                if (j==2){
                    break outflag;
                }
                System.out.println("j="+j);
            }
        }

    }

    /**
     *continue的功能和break有点类似，区别是continue只是中止本次循环，接着开始下一次循环。而break则是完全中止循环。
     */
    public static void testcontinue(){
        System.out.println("TEST continue------");
        for (int j = 0; j < 5; j++) {
            if (j==2){
                continue;
            }
            System.out.println("j="+j);
        }
    }
    /**
     * return的功能是结束一个方法。 一旦在循环体内执行到一个return语句，return语句将会结束该方法，循环自然也随之结束。
     * 与continue和break不同的是，return直接结束整个方法，不管这个return处于多少层循环之内。
     */
    public static void testReturn(){
        System.out.println("TEST return------");
        for (int i = 0; i < 5; i++) {
            System.out.println("i==="+i);
            for (int j = 0; j < 3; j++) {
                if (j==1){
                    return;
                }
                System.out.println("j="+j);
            }
            if (i==2) return;
        }
    }
}
