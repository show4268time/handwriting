package com.showtime.jdk;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/12/26
 * @time: 15:51
 * @modified by:
 */
public class ProxyGeneratorUtils {
    public static void writeProxyClassToHardDisk(String path) {
        // 获取代理类的字节码
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", UserDaoImpl.class.getInterfaces());

        FileOutputStream out = null;

        try {
            out = new FileOutputStream(path);
            out.write(classFile);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        ProxyGeneratorUtils.writeProxyClassToHardDisk("D:/Downloads/$Proxy0.class");
    }
}
