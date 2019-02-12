package cn.psw.wdui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//    @RequestMapping("/test1")
//    public String index() {
//        return "test1";
//    }
//
//    @RequestMapping("/test")
//    public String test() {
//        return "test";
//    }
//
//    @RequestMapping("/header")
//    public String header(){
//        return "common/header";
//    }
    @RequestMapping("/index")
    public String shouye(){
        return "/pages/index.html";
    }
}
