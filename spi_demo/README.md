## SPI简介 ##
1. 创建SPI需要的接口,其实就是常见的接口文件
2. 实现创建的接口
3. 如果是Java项目，则在src下增加META-INF/services目录；如果是Maven项目则在src/main/resources下增加META-INF/services目录
4. 在META-INF/services创建一个以接口的全限定名为文件名的文件，在这个文件中添加接口实现类的全限定名。
5. 使用java.util.ServiceLoader类的load方法加载以接口的全限定名为文件名的文件声明的服务，使用迭代器(java.util.ServiceLoader的iterator方法)遍历。


> java.util.ServiceLoader只会在META-INF/services目录下加载配置是因为这个类中已经声明了加载的前缀为META-INF/services