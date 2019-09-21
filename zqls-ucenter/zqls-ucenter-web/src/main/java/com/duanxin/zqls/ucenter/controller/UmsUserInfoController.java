package com.duanxin.zqls.ucenter.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.duanxin.zqls.common.base.BaseResult;
import com.duanxin.zqls.ucenter.UmsUserInfoService;
import com.duanxin.zqls.ucenter.model.UmsUserInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户信息Controller层实现
 * @author duanxin
 * @version 1.0
 * @date 2019/9/20 9:02
 */
@RestController
@CrossOrigin(origins = "")
public class UmsUserInfoController {

    @Reference
    private UmsUserInfoService umsUserInfoService;

    @GetMapping("/UmsUser/{id}")
    public BaseResult getUmsUserInfoByPrimaryKey(@PathVariable("id") Integer id) {
        UmsUserInfo umsUserInfo = umsUserInfoService.selectByPrimaryKey(id);
        if (null != umsUserInfo) {
            return BaseResult.success(umsUserInfo);
        }
        return BaseResult.failed("id不存在");
    }
}
