package com.showtime.ioc.io;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 访问网络资源的实现类
 * @author: yaoweihao
 * @date: 2018/7/27
 * @time: 14:55
 * @modified by:
 */
public class UrlResource implements Resource {
    private final URL url;

    public UrlResource(URL url){
        this.url = url;
    }
    @Override
    public InputStream getInputStream() throws IOException {
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return urlConnection.getInputStream();
    }
}
