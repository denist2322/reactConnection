package sbb.back.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public List<String> test(){
        return Arrays.asList("2시:점심식사","5시:저녁식사","??");
    }
}
