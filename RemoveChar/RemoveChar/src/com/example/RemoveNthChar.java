package com.example;

public class RemoveNthChar {

    public static String remChar(String str, String str2) {
        if(str2 ==""){
            return "";
        }
        char [] arr =str2.toCharArray();
        char ch = arr[0];


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)!=ch) {
                sb.append(str.charAt(i));
            }
        }

        String res =sb.toString();
        return res;
    }
}




    

