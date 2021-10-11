package com.company.design1;


import com.company.design1.adapter.*;
import com.company.design1.aop.AopBrowser;
import com.company.design1.decorator.*;
import com.company.design1.facade.Ftp;
import com.company.design1.facade.IntelliJ.SftpClient;
import com.company.design1.facade.Reader;
import com.company.design1.facade.Writer;
import com.company.design1.observer.Button;
import com.company.design1.observer.IButtonListener;
import com.company.design1.proxy.Browser;
import com.company.design1.proxy.BrowserProxy;
import com.company.design1.proxy.IBrowser;

import javax.print.DocFlavor;
import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

//        Ftp ftpClient = new Ftp("www.foo.co.kr",22,"/home/etc");
//        ftpClient.connect();
//        ftpClient.moveDirectory();
//
//        Writer writer = new Writer("text.tmp");
//        writer.fileConnect();
//        writer.write();
//
//        Reader reader = new Reader("text.tmp");
//        reader.fileConnect();
//        reader.fileRead();
//
//        reader.fileDisconnect();
//        writer.fileDisconnect();
//        ftpClient.disConnect();

        SftpClient sftpClient = new SftpClient("www.foo.co.kr",22, "/home/etc", "text.tmp");

        sftpClient.connect();

        sftpClient.write();

        sftpClient.read();

        sftpClient.disConnect();
    }
}
