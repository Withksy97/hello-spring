package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // localhost:8080에서 처음으로 스프링 컨테이너에서
    // 해당 url에 관련 컨트롤러(getMapping)가 있는지 먼저 찾는다.
    // 없는 경우 resources: static/hello-static.html
    @GetMapping("/")
    public String home(){
        return "home";
    }


}
