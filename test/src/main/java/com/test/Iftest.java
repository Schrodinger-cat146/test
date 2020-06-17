package com.test;

public class Iftest {
    public static void main(String[] args) {

        String str = null;

        if (str==null) {
            System.out.println("字符串长度大于3");
        } else if (str.length() < 3) {
            System.out.println("小于3");
        }
    }
}
