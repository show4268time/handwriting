package com.test.ioc.xml;

import com.showtime.ioc.BeanDefinition;
import com.showtime.ioc.io.ResourceLoader;
import com.showtime.ioc.xml.XmlBeanDefinitionReader;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

/**
 * @program: handwriting-spring
 * @description: xml解析测试
 * @author: showtime
 * @create: 2018-07-27 23:42
 **/
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception{
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(registry.size() > 0);
    }
}
