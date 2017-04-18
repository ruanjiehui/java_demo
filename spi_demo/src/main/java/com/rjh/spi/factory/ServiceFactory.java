package com.rjh.spi.factory;

import java.util.Iterator;
import java.util.ServiceLoader;

import com.rjh.spi.service.Service;
/**
 * 获取Service对象的工厂类
 * @author RJH
 * @since 2017-4-13 上午9:34:57
 */
public class ServiceFactory {
	/**
	 * 根据传入的服务实现名(简单类名，非权限定类名)获取一个Service对象，如果对应实现不存在则返回null
	 * @param serviceName 简单类名，非权限定类名
	 * @return
	 */
	public static Service getService(String serviceName) {
		ServiceLoader<Service> loader=ServiceLoader.load(Service.class);
		Iterator<Service> iterator=loader.iterator();
		while (iterator.hasNext()) {
			Service service=iterator.next();
			if(service.getClass().getSimpleName().equals(serviceName)){
				return service;
			}
		}
		return null;
	}
	
}
