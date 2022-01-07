package com.ysliu.learn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger3Config {
    @Bean
    public Docket createRestApi() {
        // 建造者模式构建Docket
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .groupName("YSL")
                .select()
                // 需要放出的接口
                .apis(RequestHandlerSelectors.any())
                // 过滤
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口文档")
                .description("描述")
                .contact(new Contact("learn", "ysliu.com", "ysliu@163.com"))
                .version("1.0")
                .build();
    }
}
