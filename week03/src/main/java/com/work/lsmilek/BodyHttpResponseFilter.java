package com.work.lsmilek;




public class BodyHttpResponseFilter {
    public String filter(String body) {
        System.out.println(body);
        return body.replaceAll("hello","****");


    }
}
