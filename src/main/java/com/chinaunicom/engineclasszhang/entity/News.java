package com.chinaunicom.engineclasszhang.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;


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
    //@JsonProperty("content") //可重命名字段
    private String context;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",locale = "zh",timezone = "UTC") //格式化时间，指定时区
    @JsonInclude(JsonInclude.Include.NON_NULL)//非空时引入
    private Date createDate;


    @JsonIgnore //格式化输出时忽略该字段
    private Integer versionId;

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getVersionId() {
        return versionId;
    }

    public void setVersionId(Integer versionId) {
        this.versionId = versionId;
    }
}
