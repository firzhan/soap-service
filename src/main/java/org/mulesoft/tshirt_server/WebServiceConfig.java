package org.mulesoft.tshirt_server;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.ws.wsdl.wsdl11.SimpleWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@EnableWs
@Configuration
public class WebServiceConfig extends WsConfigurerAdapter {

    @Bean
    public ServletRegistrationBean messageDispatcherServlet(ApplicationContext applicationContext) {
        MessageDispatcherServlet servlet = new MessageDispatcherServlet();
        servlet.setApplicationContext(applicationContext);
        servlet.setTransformWsdlLocations(true);
        return new ServletRegistrationBean(servlet, "/ws/*");
        //return new ServletRegistrationBean(servlet, "/*");
    }

    @Bean(name = "tshirt")
    public SimpleWsdl11Definition defaultWsdl11Definition(XsdSchema tShirtSchema) {
        //DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        SimpleWsdl11Definition s = new SimpleWsdl11Definition();
        s.setWsdl(new ClassPathResource("tshirt.wsdl"));
        return s;
    /*    wsdl11Definition.se
        wsdl11Definition.setServiceName("TshirtServicePortTypeService");
        wsdl11Definition.setPortTypeName("TshirtServicePortTypePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://mulesoft.org/tshirt-service");
        wsdl11Definition.setSchema(tShirtSchema());
        return wsdl11Definition;*/
    }

    @Bean
    public XsdSchema tShirtSchema() {
        return new SimpleXsdSchema(new ClassPathResource("tshirt.xsd"));
    }
}
