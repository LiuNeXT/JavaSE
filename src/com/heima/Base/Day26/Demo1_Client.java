package com.heima.Base.Day26;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Demo1_Client {
    /**
     * * 1.客户端
     * 创建Socket连接服务端(指定ip地址,端口号)通过ip地址找对应的服务器
     * 调用Socket的getInputStream()和getOutputStream()方法获取和服务端相连的IO流
     * 输入流可以读取服务端输出流写出的数据
     * 输出流可以写出数据到服务端的输入流
     * @throws IOException
     * @throws UnknownHostException
     */
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",12580);

        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();


        byte[] arr = new byte[1024];
        int len = inputStream.read(arr);  //读取服务器发过来的数据
        System.out.println(new String(arr, 0, len));  //将数据转换成字符串并打印

        outputStream.write("你好".getBytes());

        socket.close();


    }
}
