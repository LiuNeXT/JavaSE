package com.heima.Base.Day23;

import java.io.File;

public class Test2 {

    public static void main(String[] args) {

        //deleteFile();

    }

    public  static void deleteFile(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()){
                file.delete();
            }else {
                deleteFile(file);
            }
        }
        dir.delete();
    }
}
