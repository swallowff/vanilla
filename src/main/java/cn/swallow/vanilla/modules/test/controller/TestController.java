package cn.swallow.vanilla.modules.test.controller;

import cn.swallow.vanilla.annotation.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenyu
 * @create 2019/9/19
 */
@ApiVersion(1)
@RestController
@RequestMapping("{version}/hello")
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public Object test(){
        return "OK1";
    }

}
