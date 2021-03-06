package com.github.scompo.planner.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.github.scompo.planner.web.Urls;
import com.github.scompo.planner.web.ViewNames;

@Configuration
public class WebConfiguration extends WebMvcConfigurerAdapter{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {

		registry.addViewController(Urls.ROOT).setViewName(ViewNames.INDEX);
		registry.addViewController(Urls.HOME).setViewName(ViewNames.INDEX);
	}

}
