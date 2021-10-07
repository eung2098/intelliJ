package com.company.design1.adapter;

public class Cleaner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("220V 청소기 on");
    }
}
