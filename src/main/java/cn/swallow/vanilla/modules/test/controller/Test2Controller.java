package cn.swallow.vanilla.modules.test.controller;

import cn.swallow.vanilla.annotation.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenyu
 * @create 2019/9/19
 */
@ApiVersion(2)
@RestController
@RequestMapping("{version}/hello")
public class Test2Controller {

    @RequestMapping("test")
    @ResponseBody
    public Object test(){
        return "OK2";
    }

}
