package com.log4dark;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // TCP Server start...
        // TcpServer tcpServer = new TcpServer("127.0.0.1", 9100);
        TcpThreadServer tcpThreadServer = new TcpThreadServer("127.0.0.1", 9100);
    }
}