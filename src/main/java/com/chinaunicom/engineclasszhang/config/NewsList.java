package com.chinaunicom.engineclasszhang.config;

import com.chinaunicom.engineclasszhang.entity.News;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName NewsList
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-05-31 14:38
 * @Description 数据持久层  模拟数据
 */
@Repository     //持久层
//为Bean注解的升级版，Service，Controller
public class NewsList {
    private List<News> newsList;

    public List<News> getNewsList() {
        return newsList;
    }

    public void setNewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public NewsList(List<News> newsList) {
        this.newsList = newsList;
    }

    public NewsList() {
        this.newsList = new ArrayList<>();
        //生成模拟数据
        for (int i = 0; i < 3; i++) {
            News news = new News();
            news.setId(i);
            news.setTitle("title:" + i);
            news.setContext("hhhh");
            this.newsList.add(news);
        }
    }

    public News getNewsById(Integer id) {
        for (News news : newsList) {
            if (news.getId().equals(id)) {
                return news;
            }
        }
        return null;
    }
}
