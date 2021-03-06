package org.weka.web.application.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.weka.web.application.service.FileService;
import org.weka.web.application.service.SMOService;
import org.weka.web.application.service.impl.FileServiceImpl;
import org.weka.web.application.service.impl.SMOServiceImpl;

/**
 * Created by suad on 8/31/2014.
 */
@Import(value = {WebAppConfiguration.class,RepositoryConfig.class})
@ComponentScan
@Configuration
public class RootAppConfiguration {


    @Bean
    public SMOService smoService(){return new SMOServiceImpl();}
}