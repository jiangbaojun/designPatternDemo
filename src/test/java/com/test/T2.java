package com.test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class T2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(URLDecoder.decode("小明+小红 - 副本.jpg", "utf-8"));
    }
}
