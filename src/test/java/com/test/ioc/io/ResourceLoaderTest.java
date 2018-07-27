package com.test.ioc.io;

import com.showtime.ioc.io.Resource;
import com.showtime.ioc.io.ResourceLoader;
import junit.framework.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/27
 * @time: 16:30
 * @modified by:
 */
public class ResourceLoaderTest {
    @Test
    public void test() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tinyioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }
}
