##小知识点

####配置日志系统

Hibernate 的日志系统是试用slf4j，就是说我们需要给出实现才能让Hibernate打印日志

1. 默认给的是最简单最垃圾的实现方式
```xml

	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-simple</artifactId>
		<version>1.7.5</version>
	</dependency>
```

2. 试用slf4j 自己比较高级点的实现，如果不配置默认就是使用这个，有点高级哦
```xml

	<dependency>
		<groupId>org.slf4j</groupId>
		<artifactId>slf4j-nop</artifactId>
		<version>1.7.5</version>
	</dependency>
```

3. 配置成log4j，这个时候需要添加适配器
```xml
	
	 <dependency>
	 	<groupId>org.slf4j</groupId>
		<artifactId>slf4j-log4j12</artifactId>
		<version>1.7.5</version>
	</dependency>
 	<dependency>
		<groupId>log4j</groupId>
		<artifactId>log4j</artifactId>
		<version>1.2.17</version>
	</dependency>
```

###配置好JUnit

1. @BeforeClass
2. @Test
3. @AfterClass


###hibernate.cfg.xml

1. hbm2ddl.auto
```xml

	<property name="hbm2ddl.auto">create</property>
	1. create -- 自动创建表
	2. update -- 自动更新表
	3. create-drop -- 临时表，在显式关闭 SessionFactory 时，将删除掉数据库
	4. validate
```

2. show_sql，format_sql -- 显示SQL 语句
```xml

	<property name="hbm2ddl.auto">create</property>
	1. create -- 自动创建表
	2. update -- 自动更新表
	3. create-drop -- 临时表，在显式关闭 SessionFactory 时，将删除掉数据库
	4. validate
```

