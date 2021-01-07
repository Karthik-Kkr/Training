package com.capg.login;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {		
		return new Class[] {WebConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {		
		return new Class[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {	
		return new String[] {"/"};
	}

}
