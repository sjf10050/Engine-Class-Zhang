package com.chinaunicom.engineclasszhang.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName News
 * @Author sjf
 * @mail sjf10050@outlook.com
 * @Date 2019-05-31 11:44
 * @Description News entity
 */
@ApiModel(value = "News",description = "新闻实体")
public class News {
    private Integer id;
    @ApiModelProperty(value = "新闻标题",required = false)
    private String title;
    private String context;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
