package ch14.ch01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//������̼� ����@interface ������̼� ��{}
//���� ���
@Target(ElementType.METHOD)
//������̼� ���� �Ⱓ(�ҽ�, ������, runtime)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";

	int number() default 15;
}