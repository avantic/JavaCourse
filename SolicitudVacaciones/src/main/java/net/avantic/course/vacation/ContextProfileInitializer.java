package net.avantic.course.vacation;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class ContextProfileInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	public void initialize(ConfigurableApplicationContext ctx) {
		ConfigurableEnvironment environment = ctx.getEnvironment();
		environment.setActiveProfiles("production");
	}

}
