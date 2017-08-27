package config;

import com.fasterxml.jackson.databind.util.ClassUtil;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

@Configuration
@ConditionalOnAClass(className = "org.apache.catalina")
public class TomcatConfiguration {
    @Bean
    EmbeddedServletContainerFactory servletContainerFactory(){
        return new TomcatEmbeddedServletContainerFactory();
    }
//    static class OnTomcatCondition implements Condition{
//
//        @Override
//        public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//            return ClassUtils.isPresent("org.apache.catalina",conditionContext.getClassLoader());
//        }
//    }
}
