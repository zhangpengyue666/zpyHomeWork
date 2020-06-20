package day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 通过IO流，将a.txt文件中的内容复制到b.txt
 */
public class demo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("a.txt");
        FileOutputStream fos=new FileOutputStream("b.txt");
        int d=-1;
        while((d=fis.read())!=-1){
            char c=(char)d;
            fos.write(c);
        }
    }
}
