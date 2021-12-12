package top.ulane.springtest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import top.ulane.logext.UlaneAutoConfigurationImportSelector;

//这里只要包名相同能扫描到(主要考虑到spring没有springboot的自动扫描)
@Configuration
@Import(UlaneAutoConfigurationImportSelector.class)
public class SpringtestAutoConfitguration {

}
