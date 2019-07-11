package com.user.annotation;

import com.user.common.MapperScanRegistar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(MapperScanRegistar.class)
public @interface MapperScan {
}
