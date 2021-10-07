package com.company.design1.adapter;

public class AirConditioner implements Electronic220V {
    @Override
    public void connect() {
        System.out.println("220V 에어컨 on");
    }
}
