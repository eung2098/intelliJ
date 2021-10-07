package com.company.design1.adapter;

public class SockectAdapter implements Electronic110V{

    private Electronic220V electronic220V;

    public SockectAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }
    @Override
    public void powerOn() {
        electronic220V.connect();
    }
}
