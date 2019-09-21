package com.duanxin.zqls.demo.service;

import com.duanxin.zqls.common.annotation.BaseService;
import com.duanxin.zqls.common.base.BaseServiceImpl;
import com.duanxin.zqls.dao.mapper.FeedbackInfoMapper;
import com.duanxin.zqls.dao.model.FeedbackInfo;
import com.duanxin.zqls.dao.model.FeedbackInfoExample;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 进行测试的service
 * @author duanxin
 * @version 1.0
 * @date 2019/9/16 15:37
 */
@Service
@BaseService
@Transactional
public class FeedbackService extends BaseServiceImpl<FeedbackInfoMapper, FeedbackInfo, FeedbackInfoExample> {

    @Resource
    private FeedbackInfoMapper feedbackInfoMapper;
}
