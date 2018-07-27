package com.showtime.ioc.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 *
 * @description: Resource是spring内部定位资源的接口
 * @author: yaoweihao
 * @date: 2018/7/27
 * @time: 14:50
 * @modified by:
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
