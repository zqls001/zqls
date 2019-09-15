package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.UmsRole;
import com.duanxin.zqls.data.model.UmsRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsRoleMapper {
    long countByExample(UmsRoleExample example);

    int deleteByExample(UmsRoleExample example);

    @Delete({
        "delete from ums_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_role (name, type, ",
        "status, remark, ",
        "operate_time, operate_ip, ",
        "operator)",
        "values (#{name,jdbcType=VARCHAR}, #{type,jdbcType=TINYINT}, ",
        "#{status,jdbcType=TINYINT}, #{remark,jdbcType=VARCHAR}, ",
        "#{operateTime,jdbcType=TIMESTAMP}, #{operateIp,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsRole record);

    int insertSelective(UmsRole record);

    List<UmsRole> selectByExampleWithRowbounds(UmsRoleExample example, RowBounds rowBounds);

    List<UmsRole> selectByExample(UmsRoleExample example);

    @Select({
        "select",
        "id, name, type, status, remark, operate_time, operate_ip, operator",
        "from ums_role",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.UmsRoleMapper.BaseResultMap")
    UmsRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int updateByExample(@Param("record") UmsRole record, @Param("example") UmsRoleExample example);

    int updateByPrimaryKeySelective(UmsRole record);

    @Update({
        "update ums_role",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsRole record);
}