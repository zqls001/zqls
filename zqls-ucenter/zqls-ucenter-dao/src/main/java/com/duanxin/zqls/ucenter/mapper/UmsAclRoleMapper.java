package com.duanxin.zqls.ucenter.mapper;

import com.duanxin.zqls.ucenter.model.UmsAclRole;
import com.duanxin.zqls.ucenter.model.UmsAclRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsAclRoleMapper {
    long countByExample(UmsAclRoleExample example);

    int deleteByExample(UmsAclRoleExample example);

    @Delete({
        "delete from ums_acl_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_acl_role (aid, rid, ",
        "operate_time, operate_ip, ",
        "operator)",
        "values (#{aid,jdbcType=INTEGER}, #{rid,jdbcType=INTEGER}, ",
        "#{operateTime,jdbcType=TIMESTAMP}, #{operateIp,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsAclRole record);

    int insertSelective(UmsAclRole record);

    List<UmsAclRole> selectByExampleWithRowbounds(UmsAclRoleExample example, RowBounds rowBounds);

    List<UmsAclRole> selectByExample(UmsAclRoleExample example);

    @Select({
        "select",
        "id, aid, rid, operate_time, operate_ip, operator",
        "from ums_acl_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.ucenter.mapper.UmsAclRoleMapper.BaseResultMap")
    UmsAclRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsAclRole record, @Param("example") UmsAclRoleExample example);

    int updateByExample(@Param("record") UmsAclRole record, @Param("example") UmsAclRoleExample example);

    int updateByPrimaryKeySelective(UmsAclRole record);

    @Update({
        "update ums_acl_role",
        "set aid = #{aid,jdbcType=INTEGER},",
          "rid = #{rid,jdbcType=INTEGER},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsAclRole record);
}