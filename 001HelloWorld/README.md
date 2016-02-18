##Hello World

####配置文件方式

1. 新建model（entity）类Hello
2. 在resources 的同包名下新建对应的配置文件Hello.hbm.xml
```xml

	<!-- table 不写对应数据库的表名就和name 一样 -->
	<class name="Hello" table="Hello">
		<!-- 不写column 那么表里面的字段就和name 一样 -->
		<id name="id" column="id" ></id>
		<property name="title"></property>
	</class>
```

3. 在hibernate.cfg.xml 添加映射
```xml

	<mapping resource="com/vector/hibernate/hello/model/Hello.hbm.xml" />
```

####配置文件方式

1. 新建model 类HelloAnnotation
2. 添加@Entity @Id 注解
```java

	import javax.persistence.Entity;
	import javax.persistence.Id;
```
3. 添加映射
```xml

	<mapping class="com.vector.hibernate.hello.model.HelloAnnotation" />
```







