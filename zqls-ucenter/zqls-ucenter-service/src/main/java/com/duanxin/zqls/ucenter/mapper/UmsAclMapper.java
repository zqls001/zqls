package com.duanxin.zqls.ucenter.mapper;

import com.duanxin.zqls.ucenter.model.UmsAcl;
import com.duanxin.zqls.ucenter.model.UmsAclExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsAclMapper {
    long countByExample(UmsAclExample example);

    int deleteByExample(UmsAclExample example);

    @Delete({
        "delete from ums_acl",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_acl (code, name, ",
        "url, type, status, ",
        "remark, operate_time, ",
        "operate_ip, operator)",
        "values (#{code,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{type,jdbcType=TINYINT}, #{status,jdbcType=TINYINT}, ",
        "#{remark,jdbcType=VARCHAR}, #{operateTime,jdbcType=TIMESTAMP}, ",
        "#{operateIp,jdbcType=VARCHAR}, #{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsAcl record);

    int insertSelective(UmsAcl record);

    List<UmsAcl> selectByExampleWithRowbounds(UmsAclExample example, RowBounds rowBounds);

    List<UmsAcl> selectByExample(UmsAclExample example);


    UmsAcl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsAcl record, @Param("example") UmsAclExample example);

    int updateByExample(@Param("record") UmsAcl record, @Param("example") UmsAclExample example);

    int updateByPrimaryKeySelective(UmsAcl record);

    @Update({
        "update ums_acl",
        "set code = #{code,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsAcl record);
}