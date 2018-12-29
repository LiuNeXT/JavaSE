package com.heima.Base.Day20;

import java.io.*;

public class Demo7_TrsnsIO {
    public static void main(String[] args) throws IOException {

        InputStreamReader isr =
                new InputStreamReader(new FileInputStream(new File("copy.jpg","uft-8")));
        OutputStreamWriter osw =
                new OutputStreamWriter(new FileOutputStream(new File("copy-outputstreamwriter.jpg","gbk")));

        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }

        isr.close();
        osw.close();
    }
}
