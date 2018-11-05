package com.showtime.ioc.io;

import java.net.URL;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/9/29
 * @time: 16:48
 * @modified by:
 */
public class ResourceLoader {
    public Resource getResource(String location){
        URL url = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(url);
    }
}
