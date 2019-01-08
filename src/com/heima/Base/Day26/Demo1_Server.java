package com.heima.Base.Day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo1_Server {

    /**
     * * 2.服务端
     * 创建ServerSocket(需要指定端口号)
     * 调用ServerSocket的accept()方法接收一个客户端请求，得到一个Socket
     * 调用Socket的getInputStream()和getOutputStream()方法获取和客户端相连的IO流
     * 输入流可以读取客户端输出流写出的数据
     * 输出流可以写出数据到客户端的输入流
     *
     * @throws IOException
     */

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12580);

        Socket socket = serverSocket.accept(); //接收客户端的发送
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("百度一下，你就知道".getBytes());

        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, read));

        socket.close();


    }
}
