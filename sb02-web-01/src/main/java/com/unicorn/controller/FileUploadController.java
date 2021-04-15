package com.unicorn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * </p>
 * Created on 2021/04/15 14:40
 *
 * @author Unicorn
 */
@RestController
public class FileUploadController {

    @PostMapping("upload")
    public Map<String, Object> upload(@RequestParam("name") String username,
                                      @RequestParam("age") Integer age,
                                      @RequestPart("avatar") MultipartFile avatar,
                                      @RequestPart MultipartFile[] album) throws IOException {
        Map<String, Object> map= new HashMap<>();
        map.put("用户名",username);
        map.put("年龄",age);
        map.put("头像大小", avatar.getSize());
        map.put("相册数量", album.length);
        if (!avatar.isEmpty()){
            String avatarOriginalFilename = avatar.getOriginalFilename();
            avatar.transferTo(new File("D://"+avatarOriginalFilename));
        }
        return map;
    }
}
