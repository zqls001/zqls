package com.duanxin.zqls.ucenter.mapper;

import com.duanxin.zqls.ucenter.model.UmsUserRole;
import com.duanxin.zqls.ucenter.model.UmsUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsUserRoleMapper {
    long countByExample(UmsUserRoleExample example);

    int deleteByExample(UmsUserRoleExample example);

    @Delete({
        "delete from ums_user_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_user_role (uid, rid, ",
        "operate_time, operate_ip, ",
        "operator)",
        "values (#{uid,jdbcType=INTEGER}, #{rid,jdbcType=INTEGER}, ",
        "#{operateTime,jdbcType=TIMESTAMP}, #{operateIp,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsUserRole record);

    int insertSelective(UmsUserRole record);

    List<UmsUserRole> selectByExampleWithRowbounds(UmsUserRoleExample example, RowBounds rowBounds);

    List<UmsUserRole> selectByExample(UmsUserRoleExample example);

    UmsUserRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserRole record, @Param("example") UmsUserRoleExample example);

    int updateByExample(@Param("record") UmsUserRole record, @Param("example") UmsUserRoleExample example);

    int updateByPrimaryKeySelective(UmsUserRole record);

    @Update({
        "update ums_user_role",
        "set uid = #{uid,jdbcType=INTEGER},",
          "rid = #{rid,jdbcType=INTEGER},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsUserRole record);
}