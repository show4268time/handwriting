package com.showtime.test.io;

import com.showtime.spring.ioc.io.Resource;
import com.showtime.spring.ioc.io.ResourceLoader;
import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/9/29
 * @time: 16:58
 * @modified by:
 */
public class ResourceLoaderTest {
    @Test
    public void test() throws Exception{
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
