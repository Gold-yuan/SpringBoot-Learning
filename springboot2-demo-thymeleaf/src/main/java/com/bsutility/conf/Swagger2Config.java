package com.bsutility.conf;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 * @author adminytf
 *
 */
@Configuration
@EnableSwagger2 //	启用S​​pringfox Swagger 2
public class Swagger2Config {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2) // Docket，Springfox的主API配置机制初始化为swagger规范2.0
                .apiInfo(apiInfo())
                .select()  // 选择那些路径和api会生成document// select()返回一个实例，ApiSelectorBuilder进行精细控制。
//                .apis(RequestHandlerSelectors.basePackage("com.abs.controller"))
                .apis(RequestHandlerSelectors.any())// 对所有api进行监控// apis()允许选择RequestHandler使用谓词。这里的例子使用any谓词（默认）。可用的词为：any，none，withClassAnnotation，withMethodAnnotation和 basePackage。
                .paths(paths())
//                .paths(PathSelectors.any())// 对所有路径进行监控
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("节点管理")
                .description("容器节点管理api")
                .termsOfServiceUrl("#")
                .version("1.0")
                .build();
    }
    
    //Here is an example where we select any api that matches one of these paths
	private Predicate<String> paths() {
      return or(
		  regex("/.*"),
		  regex("/.*")
          );
    }

}
