package com.company.design1.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz(){
      this.socketClient = SocketClient.getInstance();
      //this.socketClient = new SocketClient(); false
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
