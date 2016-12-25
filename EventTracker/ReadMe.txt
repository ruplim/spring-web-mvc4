Rest service : http://localhost:8080/EventTracker/events.json
To load PDF : http://localhost:8080/EventTracker/pdfs/helloworld.pdf



To use web.xml
====================

1. Create a folder WEB-INF under webapp
2. Create web.xml under it to define dispatcher servlet

<?xml version="1.0" encoding="UTF-8"?>
<web-app version="3.0" xmlns="http://java.sun.com/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/javaee 
	http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd">

	<servlet>
		<servlet-name>springDispatcherServlet</servlet-name>
		<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
		<init-param>
		   <param-name>contextClass</param-name>
		   <param-value>org.springframework.web.context.support.AnnotationConfigWebApplicationContext</param-value>
		</init-param>
		<init-param>
			<param-name>contextConfigLocation</param-name>
			<param-value>com.samples.WebConfig</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>springDispatcherServlet</servlet-name>
		<url-pattern>*.html</url-pattern>
	</servlet-mapping>
</web-app>

3. Controller

@Controller
public class HelloController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model) {
		model.addAttribute("greeting", "HelloWorld");
		return "hello.jsp";
	}
}


4. WebConfig

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.samples")
public class WebConfig {

}

 
