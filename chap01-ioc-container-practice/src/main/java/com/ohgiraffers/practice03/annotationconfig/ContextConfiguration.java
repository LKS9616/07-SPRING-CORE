package com.ohgiraffers.practice03.annotationconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackages = "com.ohgiraffers.practice03.annotationconfig",
        //기본 어노테이션( @Component, @Service, @Repository, @Controller )를 가진 클래스들이 자동으로 스캔된다.
        useDefaultFilters = false,
        includeFilters = {
                // includeFilters : 기본필터 이외에 추가로 포함시키고 싶은 클래스를 스캔할 수 있다.
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {BoardDAO.class}
                )
        }
)
@Configuration("contextConfiguration3")
public class ContextConfiguration {

}
