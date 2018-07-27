package com.showtime.ioc.io;

import java.net.URL;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/27
 * @time: 14:56
 * @modified by:
 */
public class ResourceLoader {
    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
