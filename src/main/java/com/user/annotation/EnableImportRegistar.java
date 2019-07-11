package com.user.annotation;

import com.user.common.ResourceImportRegistar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ResourceImportRegistar.class)
public @interface EnableImportRegistar {
}
