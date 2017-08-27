package config;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.ClassUtils;

import java.util.Map;

public class OnAClassCondition implements Condition {

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String,Object> attributes = annotatedTypeMetadata.getAnnotationAttributes(ConditionalOnAClass.class.getName());
        String className = (String) attributes.get("className");
        return ClassUtils.isPresent(className,conditionContext.getClassLoader());
    }
}
