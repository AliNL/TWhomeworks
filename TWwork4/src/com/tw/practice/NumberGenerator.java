package com.tw.practice;

import java.util.Collections;
import java.util.Random;

/**
 * Created by 思念 on 2015/12/26.
 */
public class NumberGenerator {
    public String generate() {
        String string = new String();
        Random random = new Random();
        int number;
        for(int i = 0; i <4; i++) {
            for (; ; ) {
                number = random.nextInt(10);
                if (string.indexOf(number+48) == -1) {
                    string += String.valueOf(number);
                    break;
                }
            }
        }
        return string;
    }
}
