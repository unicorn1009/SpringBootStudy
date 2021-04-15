package com.unicorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *     注意:使用转发和重定向不能在类上使用@RestController
 * </p>
 * Created on 2021/04/14 15:44
 *
 * @author Unicorn
 */
@Controller
@RequestMapping("/request")
public class RequestController {
    @GetMapping("/goto")
    public String m1(HttpServletRequest request){
        request.setAttribute("msg", "来自/goto");
        request.setAttribute("code", 404);
        return "forward:/request/success";
    }

    @GetMapping("/success")
    @ResponseBody
    public Map<String,Object> m2(@RequestAttribute("msg") String msg,
                     @RequestAttribute("code") Integer code,
                     HttpServletRequest request){

        Map<String, Object> map = new HashMap<>();
        map.put("msg", msg);
        map.put("code", code);
        map.put("from", "转发到了/success");
        return map;
    }
}
