package com.test.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.GreetingService;

import java.util.Date;

import java.text.SimpleDateFormat;
@RestController
public class GreetingController {
    String result;
    
    @GetMapping("/greeting")
    public String greeting() {
        result = GreetingService.greeting();
        return result;
    }

    @RequestMapping(value="/getNow", method=RequestMethod.GET)
    public String getNow() {
        return "현재 시간은" + new Date() + "입니다";
    }

    @RequestMapping(value="/testGetNow", method=RequestMethod.GET)
    public String testGetNow() {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy년 MM월 dd일");
        return String.format("현재 날짜는 %s", dateformat.format(new Date()));
    }
    
}
