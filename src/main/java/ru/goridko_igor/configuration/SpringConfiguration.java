package ru.goridko_igor.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("ru.goridko_igor")
@EnableWebMvc
public class SpringConfiguration {

}
