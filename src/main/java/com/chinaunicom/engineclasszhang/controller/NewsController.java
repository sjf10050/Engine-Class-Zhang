package com.chinaunicom.engineclasszhang.controller;

import com.chinaunicom.engineclasszhang.entity.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NewsController
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-05-31 11:45
 * @Description
 */
@RestController
@RequestMapping(value = "/news")
public class NewsController {
    @GetMapping(value = "/getall")
    public List<News> getAll() {
        return new ArrayList<>();
    }

}
