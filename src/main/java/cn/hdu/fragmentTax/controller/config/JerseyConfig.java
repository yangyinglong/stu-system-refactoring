package cn.hdu.fragmentTax.controller.config;

import cn.hdu.fragmentTax.controller.*;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * 配置Jersey
 *
 */
@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(UserController.class);
		register(ScoreController.class);
		register(PrizeController.class);
        register(MultiPartFeature.class);
		register(FileController.class);
		register(AdminController.class);
//		register(ProjectController.class);
//		register(BaseController.class);
	}
//
//	@Bean
//	public ServletRegistrationBean jerseyServlet() {
//		ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/api/*");
//		// our rest resources will be available in the path /rest/*
//		registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, JerseyResourceConfig.class.getName());
//		return registration;
//	}
}
