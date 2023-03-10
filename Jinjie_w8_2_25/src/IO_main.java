import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class IO_main {
        public static void main(String[] args) {
        // byte[] buffer = new byte[1024];
        // try{
        //     int len = System.in.read(buffer);
        //     String s = new String(buffer,0,len);
        //     System.out.println("读到了"+len+"个字节");
        //     System.out.println(s);
        //     System.out.println("s的长度是："+s.length());
        // } catch(IOException e){
        //     e.printStackTrace();
        // }

        //文件流
        byte[] buf = new byte[10];
        System.out.println("Hello World");
        for(int i=0;i<buf.length;i++){
            buf[i]=(byte)i;
        }
        try{
            PrintWriter out = new PrintWriter(
                new BufferedWriter(
                    new OutputStreamWriter(
                        new FileOutputStream("a.txt"))));
            // int i = 0xcafebabe; //二进制形式 在终端用hexdump a.dat查看
            int i = 123456;
            out.println(i);
            // out.write(buf);
            out.close();

            BufferedReader in = new BufferedReader(
                new InputStreamReader(
                    new FileInputStream("/Users/hengchangqi/c_vscode/JavaPractice/Jinjie_w8_2_25/src/IO_main.java")));//里面是二进制数据
            String line;
            while ((line=in.readLine())!=null){
                System.out.println(line);
            }
            // int j = in.readInt();
            // System.out.println(j); //以十进制的方式输出

        } catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
