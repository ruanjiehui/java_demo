package com.rjh.spi.test;

import org.junit.Assert;
import org.junit.Test;

import com.rjh.spi.factory.ServiceFactory;
/**
 * 工厂类单元测试代码
 * @author RJH 
 * @date 2017年4月18日 上午9:32:47
 */
public class ServiceFactoryTest {
	
	@Test
	public void testSPIService(){
		ServiceFactory.getService("DemoService").printServiceName();
		ServiceFactory.getService("EasyService").printServiceName();
		Assert.assertNull(ServiceFactory.getService("Service"));
	}
}
