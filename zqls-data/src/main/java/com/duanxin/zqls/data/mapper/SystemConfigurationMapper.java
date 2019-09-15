package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.SystemConfiguration;
import com.duanxin.zqls.data.model.SystemConfigurationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface SystemConfigurationMapper {
    long countByExample(SystemConfigurationExample example);

    int deleteByExample(SystemConfigurationExample example);

    @Delete({
        "delete from system_configuration",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into system_configuration (name, value, ",
        "status, create_time, ",
        "operate_time, operate_ip, ",
        "operator)",
        "values (#{name,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{operateTime,jdbcType=TIMESTAMP}, #{operateIp,jdbcType=VARCHAR}, ",
        "#{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(SystemConfiguration record);

    int insertSelective(SystemConfiguration record);

    List<SystemConfiguration> selectByExampleWithRowbounds(SystemConfigurationExample example, RowBounds rowBounds);

    List<SystemConfiguration> selectByExample(SystemConfigurationExample example);

    @Select({
        "select",
        "id, name, value, status, create_time, operate_time, operate_ip, operator",
        "from system_configuration",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.SystemConfigurationMapper.BaseResultMap")
    SystemConfiguration selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SystemConfiguration record, @Param("example") SystemConfigurationExample example);

    int updateByExample(@Param("record") SystemConfiguration record, @Param("example") SystemConfigurationExample example);

    int updateByPrimaryKeySelective(SystemConfiguration record);

    @Update({
        "update system_configuration",
        "set name = #{name,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(SystemConfiguration record);
}