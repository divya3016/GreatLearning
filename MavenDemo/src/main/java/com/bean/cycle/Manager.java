package com.bean.cycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
@Component
public class Manager implements Employee, InitializingBean, DisposableBean {

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("perform task while destroying bean ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
    System.out.println("perform task while initiaLIZING BEAN");
	}

	@Override
	public void job() {
		// TODO Auto-generated method stub
      System.out.println("employee do their own work  like manage office ");
	}

}
