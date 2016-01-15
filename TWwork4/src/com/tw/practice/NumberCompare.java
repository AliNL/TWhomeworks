package com.tw.practice;

import java.util.Collections;

/**
 * Created by 思念 on 2016/1/15.
 */
public class NumberCompare {
    public String compare(String s1, String s2){
        int a=0,b=0;
        for(int i=0;i<4;i++) {
            if(s1.charAt(i)==s2.charAt(i))
                a++;
            else if(s1.indexOf(s2.charAt(i))>-1)
                b++;
        }
            return a+"A"+b+"B";
    }
}
