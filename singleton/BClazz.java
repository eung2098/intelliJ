package com.company.design1.singleton;

public class BClazz {

    private SocketClient socketClient;

    public BClazz(){
       this.socketClient = SocketClient.getInstance();
       //this.socketClient = new SocketClient(); false
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
