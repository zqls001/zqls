package com.duanxin.zqls.ucenter.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.duanxin.zqls.common.base.BaseConstants;
import com.duanxin.zqls.common.base.BaseController;
import com.duanxin.zqls.common.base.BaseResult;
import com.duanxin.zqls.ucenter.api.UmsUserInfoService;
import com.duanxin.zqls.ucenter.model.UmsUserInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * 用户信息Controller层实现
 * @author duanxin
 * @version 1.0
 * @date 2019/9/20 9:02
 */
@RestController
@CrossOrigin(origins = "")
public class UmsUserInfoController extends BaseController {

    @Reference
    private UmsUserInfoService umsUserInfoService;

    @GetMapping("/UmsUser/{id}")
    public BaseResult getUmsUserInfoByPrimaryKey(@PathVariable("id") Integer id) {
        UmsUserInfo umsUserInfo = umsUserInfoService.selectByPrimaryKey(id);
        if (null != umsUserInfo) {
            String status = String.valueOf(umsUserInfo.getStatus());
            if (StringUtils.isNotBlank(status) && StringUtils.equals(status, BaseConstants.STATUS_CONSTANT)) {
                return BaseResult.success(umsUserInfo);
            }
        }
        return BaseResult.failed("该用户不存在");
    }

    @DeleteMapping("/UmsUser/{id}")
    public BaseResult deleteUserInfoByPrimaryKey(@PathVariable("id") Integer id) {
        umsUserInfoService.deleteUserInfoByPrimaryKey(id);

        return BaseResult.success("删除成功",id);
    }
}
