package com.duanxin.zqls.demo.controller;

import com.duanxin.zqls.common.base.BaseResult;
import com.duanxin.zqls.dao.model.FeedbackInfo;
import com.duanxin.zqls.demo.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author duanxin
 * @version 1.0
 * @date 2019/9/16 15:40
 */
@RestController
public class FeedbackController {

    @Resource
    private FeedbackService feedbackService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/insert")
    public BaseResult insert() {

        FeedbackInfo feedbackInfo = FeedbackInfo.builder().uid(2).type(Byte.valueOf(0+"")).
                status(Byte.valueOf(0+"")).remark("食物太难吃了").isPic(Byte.valueOf(0+"")).
                createTime(new Date()).renewTime(new Date()).build();
        feedbackService.insertSelective(feedbackInfo);

        return BaseResult.success(feedbackInfo);
    }

    /*@GetMapping("/feedback/{id}")
    public BaseResult selectByPrimaryKey(@PathVariable("id") Integer id) {
        FeedbackInfo feedbackInfo = feedbackService.selectByPrimaryKey(id);

        return BaseResult.success(feedbackInfo);
    }*/

    @GetMapping("/feedback/{id}")
    public BaseResult deleteByPrimaryKey(@PathVariable("id") Integer id) {
        int key = feedbackService.deleteByPrimaryKey(id);

        return BaseResult.success("删除成功", key);
    }
}
