package by.maksim.configuration;

import com.fasterxml.classmate.TypeResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@EnableWebMvc
@Configuration
public class WebConfiguration {

//    @Bean
//    public TypeResolver typeResolver(){
//        return new TypeResolver();
//    }
//
//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping(){
//        return new RequestMappingHandlerMapping();
//    }
}
