//package com.SpringDemo.springConfig;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.annotation.Resource;
//import java.util.Properties;
//
//
//@Configuration
//@ComponentScan(basePackages = "com.SpringDemo")
//@EnableTransactionManagement
//@PropertySource(value = {
//        "classpath:database.properties"
//})
//
//public class MailConfiguration {
//
//    @Resource
//    private Environment environment;
//
//    @Bean
//    public JavaMailSender mailSender() {
//        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//        mailSender.setDefaultEncoding("UTF-8");
//        mailSender.setHost(environment.getProperty("mail.host"));
//        mailSender.setPort(Integer.parseInt(environment.getProperty("mail.port")));
//        mailSender.setUsername(environment.getProperty("mail.username"));
//        mailSender.setPassword(environment.getProperty("mail.password"));
//        Properties properties = new Properties();
//        properties.put("mail.smtp.auth", environment.getProperty("mail.properties.mail.smtp.auth"));
//        properties.put("mail.smtp.starttls.enable", environment.getProperty("mail.properties.mail.smtp.starttls.enable"));
//        mailSender.setJavaMailProperties(properties);
//        return mailSender;
//    }
//
//}
