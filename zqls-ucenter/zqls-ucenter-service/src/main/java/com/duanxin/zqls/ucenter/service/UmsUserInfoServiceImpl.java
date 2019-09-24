package com.duanxin.zqls.ucenter.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.duanxin.zqls.common.annotation.BaseService;
import com.duanxin.zqls.common.base.BaseServiceImpl;
import com.duanxin.zqls.common.exception.CheckException;
import com.duanxin.zqls.ucenter.UmsUserInfoService;
import com.duanxin.zqls.ucenter.mapper.UmsUserInfoMapper;
import com.duanxin.zqls.ucenter.model.UmsUserInfo;
import com.duanxin.zqls.ucenter.model.UmsUserInfoExample;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 用户信息Service层实现
 * @author duanxin
 * @version 1.0
 * @date 2019/9/20 8:57
 */
@Service
@BaseService
@Transactional(rollbackFor = Exception.class)
public class UmsUserInfoServiceImpl extends BaseServiceImpl<UmsUserInfoMapper, UmsUserInfo, UmsUserInfoExample> implements UmsUserInfoService {

    @Resource
    private UmsUserInfoMapper umsUserInfoMapper;

    @Override
    public void deleteUserInfoByPrimaryKey(Integer id) {
        UmsUserInfo umsUserInfo = umsUserInfoMapper.selectByPrimaryKey(id);
        if (null == umsUserInfo) {
            throw new CheckException("该用户不存在");
        }
        umsUserInfo.setStatus(Byte.parseByte("1"));
        umsUserInfoMapper.updateByPrimaryKeySelective(umsUserInfo);
    }
}
