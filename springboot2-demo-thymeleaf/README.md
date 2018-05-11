这是一个spring boot 2.0.1.RELEASE 的thymeleaf例子
============================================
## 默认配置
**Spring Boot默认提供静态资源目录位置需置于classpath下，目录名需符合如下规则：**
```
src/main/resources/static 静态文件,css、js、img...
src/main/resources/public 
src/main/resources/resources
WEB-INF/META-INF/resources
```
**thymeleaf模板默认目录**
```
src/main/resources/templates 静态html
```

## 依赖
maven
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.0.1.RELEASE</version>
</parent>
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-thymeleaf</artifactId>
    </dependency>
</dependencies>
```

## 绑定参数
java 代码，使用Model
```java
@Controller
public class HelloController {
    @RequestMapping("/")
    public String index(Model map) {
        // 加入一个属性，用来在模板中读取
        map.addAttribute("host", "http://blog.didispace.com");
        // return模板文件的名称，对应src/main/resources/templates/index.html
        return "index";  
    }

}
```
在html使用标签 th:+${}可获取变量值
```html
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8" />
    <title></title>
</head>
<body>
<h1 th:text="${host}">Hello World</h1>
</body>
</html>
```

## layout布局使用方式：
**需在pom.xml添加layout依赖**
```xml
<dependency>
    <groupId>nz.net.ultraq.thymeleaf</groupId>
    <artifactId>thymeleaf-layout-dialect</artifactId>
</dependency>
```
**在layout.html加入如下：**
```html
<body>
    <header></header>
    <div layout:fragment="content" id="content"></div>
    <footer></footer>
</body>
```
**使用方式： 在需要使用模板的demo.html页面加入**
```html
<html layout:decorator="layout" xmlns:th="http://www.thymeleaf.org">
    <div>此div将不会展示</div>
    <div layout:fragment="content">
                此div将展示
                在访问demo.html时，这个div里面的内容就会在layout.html中的content中展示
    </div>
</html>
```
### 常用标签：
    @{/} 获取context
    ${} 绑定对象
    #{} 获取内置对象


## spring对应thymeleaf默认属性
```properties
# Enable template caching.
spring.thymeleaf.cache=true 
# Check that the templates location exists.
spring.thymeleaf.check-template-location=true 
# Content-Type value.
spring.thymeleaf.content-type=text/html 
# Enable MVC Thymeleaf view resolution.
spring.thymeleaf.enabled=true 
# Template encoding.
spring.thymeleaf.encoding=UTF-8 
# Comma-separated list of view names that should be excluded from resolution.
spring.thymeleaf.excluded-view-names= 
# Template mode to be applied to templates. See also StandardTemplateModeHandlers.
spring.thymeleaf.mode=HTML5 
# Prefix that gets prepended to view names when building a URL.
spring.thymeleaf.prefix=classpath:/templates/ 
# Suffix that gets appended to view names when building a URL.
spring.thymeleaf.suffix=.html  spring.thymeleaf.template-resolver-order= # Order of the template resolver in the chain. spring.thymeleaf.view-names= # Comma-separated list of view names that can be resolved.
```





## 本项目说明
```
resources/model :是本项目的前台架构，侧边栏、头部、内容框
resources/plugin:是本项目前台插件，toastr 弹出警告框
resources/templates/layout.html:布局
resources/templates/cert/cert_list.html:使用布局例子

```