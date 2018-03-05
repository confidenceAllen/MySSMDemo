package com.cn.by.test;

import java.io.*;

public class Fun {

    public static void main(String[] args) {

        File file = new File("F://11.txt");

        try {
            InputStream is = new FileInputStream(file);
            byte b[] = new byte[1024];
            int a = is.read(b);
            String str[] = new String(b,0,a).split("");
            int count = 0;

            for(int i = 0;i<str.length;i++){

                if("a".equals(str[i]))count++;

            }

            System.out.println(count);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
