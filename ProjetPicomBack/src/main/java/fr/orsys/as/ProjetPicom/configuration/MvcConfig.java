package fr.orsys.as.ProjetPicom.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("POST","GET","PUT","OPTIONS","DELETE")
                .allowedHeaders("*")
                .exposedHeaders("Authorization")
                .maxAge(3600);
    }
}
