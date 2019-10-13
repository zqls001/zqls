package com.duanxin.zqls.ucenter.api;


import com.duanxin.zqls.common.base.BaseService;
import com.duanxin.zqls.ucenter.model.UmsUserInfo;
import com.duanxin.zqls.ucenter.model.UmsUserInfoExample;

/**
 * 用户信息Service层接口
 * @author duanxin
 * @version 1.0
 * @date 2019/9/19 9:30
 */
public interface UmsUserInfoService extends BaseService<UmsUserInfo, UmsUserInfoExample> {
    /**
     * 删除用户
     * @param id 用户主键
     * @date 2019/9/22 9:31
     **/
    void deleteUserInfoByPrimaryKey(Integer id);
}
