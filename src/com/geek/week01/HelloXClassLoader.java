package com.geek.week01;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class HelloXClassLoader extends ClassLoader{
    public static void main(String[] args) {
        HelloXClassLoader loader = new HelloXClassLoader();
        Class<?> aClass = loader.findClass("Hello");
        try {
            Object obj = aClass.newInstance();
            Method method = aClass.getMethod("hello");
            method.invoke(obj);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    protected Class<?> findClass(String name) {
        byte[] xclassByte = null;
        try {
            xclassByte = toByteArray("D:/Hello.xlass");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        if(xclassByte != null){
            for (int i = 0; i < xclassByte.length; i++) {
                xclassByte[i] = (byte) (0xff - xclassByte[i]);
            }
            return defineClass(name,xclassByte,0,xclassByte.length);
        }
        return null;



    }

    /**
     *
     * @param filename
     * @return
     * @throws IOException
     */
    public static byte[] toByteArray(String filename) throws IOException {

        File f = new File(filename);
        if (!f.exists()) {
            throw new FileNotFoundException(filename);
        }
        ByteArrayOutputStream bos = new ByteArrayOutputStream((int) f.length());
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream(f));
            int buf_size = 1024;
            byte[] buffer = new byte[buf_size];
            int len = 0;
            while (-1 != (len = in.read(buffer, 0, buf_size))) {
                bos.write(buffer, 0, len);
            }
            return bos.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            bos.close();
        }
    }
}

