# springboot
# SpringBoot的最简示例，连service层都没写  
不需要 web.xml  

不需要 springmvc.xml  

不需要 tomcat，SpringBoot 内嵌了 tomcat  

不需要配置 JSON 解析，支持 REST 架构  

Spring扫包注解也不用（需要application.java启动类在所有子包同级，因为自动扫描就是从application.java开始，扫描子包的）
