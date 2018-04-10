package com.netkumar.code.one;

import com.netkumar.processApi.code.ProcessAPIDemo;

public class Print {
    public static void printMessage(String str){
        ProcessAPIDemo processAPIDemo = new ProcessAPIDemo();
        processAPIDemo.printAllDetails();
        System.out.println(str);
    }
}
