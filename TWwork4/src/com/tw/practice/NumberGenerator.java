package com.tw.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by 思念 on 2015/12/26.
 */
public class NumberGenerator {
    public String generate() {
        List<String> list = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        Collections.shuffle(list);
        return String.join("", list.subList(0, 4));
    }
}
