package com.user.annotation;

import com.user.common.ResourceImport;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ResourceImport.class)
public @interface EnableImportSelector {
}
