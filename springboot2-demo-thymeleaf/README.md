这是一个spring boot 2.0.1.RELEASE 的thymeleaf例子
============================================
    1、静态文件放于static
    2、html模板文件放于templates

### layout布局使用方式：
    **在layout.html加入如下：**
```
	<body>
		<header></header>
		<div layout:fragment="content" id="content"></div>
		<footer></footer>
	</body>
```
    **使用方式： 在需要使用模板的demo.html页面加入**
```
	<div layout:fragment="content">
		<a>在访问demo.html时，这个div里面的内容就会在layout.html中的content中展示</a>
	</div>
```
### 常用标签：
    @{/} 获取context
    ${} 绑定对象
    #{} 获取内置对象

