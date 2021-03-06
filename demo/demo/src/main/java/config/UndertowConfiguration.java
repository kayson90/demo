package config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.undertow.UndertowEmbeddedServletContainerFactory;
import org.springframework.context.annotation.*;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

@Configuration
//@Conditional(UndertowConfiguration.OnUndertowCondition.class)
@ConditionalOnAClass(className = "io.undertow.Undertow")
public class UndertowConfiguration {
    @Bean
    public EmbeddedServletContainerFactory undertowContainerFactory(){
        return  new UndertowEmbeddedServletContainerFactory();
    }
//    static class OnUndertowCondition implements Condition{
//
//        @Override
//        public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
//                    return ClassUtils.isPresent("io.undertow.Undertow",conditionContext.getClassLoader());
//        }
//    }
}
