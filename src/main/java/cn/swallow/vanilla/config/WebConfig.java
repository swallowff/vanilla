package cn.swallow.vanilla.config;

import cn.swallow.vanilla.common.handler.CustomRequestMappingHandlerMapping;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @author shenyu
 * @create 2019/10/9
 */
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurationSupport {
    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        return handlerMapping;
    }
}
