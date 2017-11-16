package io.watts.SpringZapierDemo;

import org.h2.server.web.WebServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories
public class SpringZapierDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringZapierDemoApplication.class, args);
	}

	@Bean
	ServletRegistrationBean h2servletRegistration(){
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new WebServlet());
		servletRegistrationBean.addUrlMappings("/console/*");
		return servletRegistrationBean;
	}
}
