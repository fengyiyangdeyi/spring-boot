//package com.lyf.fastjson.config;
//
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.alibaba.fastjson.support.config.FastJsonConfig;
//import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
//import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
//import org.springframework.context.anno.Bean;
//import org.springframework.context.anno.Configuration;
//import org.springframework.http.converter.HttpMessageConverter;
//
///**
// * @Author: LYF
// * @Date: 2019/5/13 17:23
// */
//@Configuration
//public class MassageConverConfiguration {
//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//// 1、需要先定义一个 convert 转换消息的对象;
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//// 2、添加fastJson 的配置信息，比如：是否要格式化返回的json数据;
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//// 3、在convert中添加配置信息.
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        HttpMessageConverter<?> converter = fastConverter;
//        return new HttpMessageConverters(converter);
//    }
//}
