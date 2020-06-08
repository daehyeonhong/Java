package ch14.ch01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//어노테이션 선언@interface 어노테이션 명{}
//적용 대상
@Target(ElementType.METHOD)
//어노테이션 유지 기간(소스, 컴파일, runtime)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";

	int number() default 15;
}