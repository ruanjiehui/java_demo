package com.rjh.spi.service.impl;

import com.rjh.spi.service.Service;
/**
 * Service的其中一个实现类
 * @author RJH
 * @since 2017-4-13 上午9:33:30
 */
public class DemoService implements Service{
	/**
	 * @see com.rjh.spi.service.Service#printServiceName()
	 */
	@Override
	public void printServiceName() {
		System.out.println(this.getClass().getName());
	}

}
