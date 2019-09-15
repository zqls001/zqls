package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.UmsUserInfo;
import com.duanxin.zqls.data.model.UmsUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsUserInfoMapper {
    long countByExample(UmsUserInfoExample example);

    int deleteByExample(UmsUserInfoExample example);

    @Delete({
        "delete from ums_user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_user_info (aid, job_number, ",
        "user_name, password, ",
        "gender, head_pic, phone, ",
        "email, remark, status, ",
        "type, create_time, ",
        "operate_time, operate_ip, ",
        "operator)",
        "values (#{aid,jdbcType=CHAR}, #{jobNumber,jdbcType=CHAR}, ",
        "#{userName,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
        "#{gender,jdbcType=CHAR}, #{headPic,jdbcType=VARCHAR}, #{phone,jdbcType=CHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{remark,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{type,jdbcType=CHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{operateTime,jdbcType=TIMESTAMP}, #{operateIp,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsUserInfo record);

    int insertSelective(UmsUserInfo record);

    List<UmsUserInfo> selectByExampleWithRowbounds(UmsUserInfoExample example, RowBounds rowBounds);

    List<UmsUserInfo> selectByExample(UmsUserInfoExample example);

    @Select({
        "select",
        "id, aid, job_number, user_name, password, gender, head_pic, phone, email, remark, ",
        "status, type, create_time, operate_time, operate_ip, operator",
        "from ums_user_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.UmsUserInfoMapper.BaseResultMap")
    UmsUserInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserInfo record, @Param("example") UmsUserInfoExample example);

    int updateByExample(@Param("record") UmsUserInfo record, @Param("example") UmsUserInfoExample example);

    int updateByPrimaryKeySelective(UmsUserInfo record);

    @Update({
        "update ums_user_info",
        "set aid = #{aid,jdbcType=CHAR},",
          "job_number = #{jobNumber,jdbcType=CHAR},",
          "user_name = #{userName,jdbcType=VARCHAR},",
          "password = #{password,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=CHAR},",
          "head_pic = #{headPic,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=CHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "type = #{type,jdbcType=CHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsUserInfo record);
}