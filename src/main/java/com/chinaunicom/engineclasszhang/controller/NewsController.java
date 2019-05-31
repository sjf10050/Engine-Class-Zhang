package com.chinaunicom.engineclasszhang.controller;

import com.chinaunicom.engineclasszhang.config.NewsList;
import com.chinaunicom.engineclasszhang.entity.News;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName NewsController
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-05-31 11:45
 * @Description 新闻控制类
 */
@RestController
@RequestMapping(value = "news")
@Api(tags = "新闻模块")
public class NewsController {
    @Autowired
    private NewsList newsList;

    @GetMapping(value = "getall")
    @ApiOperation(value = "获取所有新闻")
    public List<News> getAll() {
        return newsList.getNewsList();
    }

    @ApiOperation(value = "获取指定新闻")
    @GetMapping(value = "/detail/{newsId}")
    @ApiImplicitParam(name = "newsId",value = "新闻编号",dataType ="Integer",required =true)
    public News getNewsDetail(@PathVariable(name = "newsId") Integer newsId) {
        return newsList.getNewsById(newsId);
    }

    @ApiOperation(value = "新增新闻")
    @PostMapping(value = "/addNews")
    public Integer addNews(@RequestBody News news){
        newsList.getNewsList().add(news);
        return 0;

    }
}
