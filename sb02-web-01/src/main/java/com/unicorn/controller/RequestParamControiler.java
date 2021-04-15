package com.unicorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * </p>
 * Created on 2021/04/14 13:51
 *
 * @author Unicorn
 */
@RestController
@RequestMapping("/param")
public class RequestParamControiler {

    @GetMapping("/user/{id}")
    public Map<String,Object> testPathVariable1(@PathVariable("id") Integer id){
        Map<String, Object> map = new HashMap<>();
        map.put("id", id);
        return map;
    }

    @GetMapping("/user/{name}/{age}")
    public Map<String,Object> testPathVariable2(@PathVariable("age") Integer myAge, @PathVariable("name") String myName,
                                                @PathVariable Map<String, String> pv){
        Map<String, Object> map = new HashMap<>();
        map.put("myAge", myAge);
        map.put("myName", myName);
        map.put("pv", pv);
        return map;
    }


    @GetMapping("/user")
    public Map<String,Object> testRequestParam1(@RequestParam("age") Integer myAge,
                                                @RequestParam("name") String myName,
                                                @RequestParam Map<String, String> params){
        Map<String, Object> map = new HashMap<>();
        map.put("myAge", myAge);
        map.put("myName", myName);
        map.put("params", params);
        return map;
    }

    @GetMapping("/header")
    public Map<String,Object> testRequestHeader1(@RequestHeader("user-agent") String userAgent,
                                                 @RequestHeader("Accept-Language") String acLang){
        Map<String, Object> map = new HashMap<>();
        map.put("userAgent", userAgent);
        map.put("acLang", acLang);
        return map;
    }

    @GetMapping("/header2")
    public Map<String,Object> testRequestHeader2(@RequestHeader Map<String, String> header){
        Map<String, Object> map = new HashMap<>();
        map.put("header", header);
        return map;
    }

    @GetMapping("/cookie")
    public Map<String,Object> testCookieValue(@CookieValue("csrftoken") Cookie cookie){
        Map<String, Object> map = new HashMap<>();
        map.put("csrftoken", cookie);
        return map;
    }

    @PostMapping("/user")
    public Map<String,Object> testRequestBody(@RequestBody(required = false) String body){
        System.out.println("body = " + body);
        Map<String, Object> map = new HashMap<>();
        map.put("body", body);
        return map;
    }



}
