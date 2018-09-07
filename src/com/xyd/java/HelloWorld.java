package com.xyd.java;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
        System.out.println("args = " + args);
        int m = 3;

        System.out.println(m);
        String[] arr = new String[]{"tom", "Jerry", "HanMeiMei"};
        for (int i = 0; i < arr.length; i++) {

        }
        for (String s : arr) {

        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }
        String[] b = new String[]{"tom", "Jerry", "HanMeiMei"};
        for (int i = 0; i < b.length; i++) {
            String s = b[i];

        }
        List<String> sdfdf = new ArrayList<>();
        for (String s : sdfdf) {

        }
        for (int i = 0; i < sdfdf.size(); i++) {

        }
        for (int i = sdfdf.size() - 1; i >= 0; i--) {

        }
        if (sdfdf == null) {

        }
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        if (list == null) {


        }

    }
}
