package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.LogInfo;
import com.duanxin.zqls.data.model.LogInfoExample;
import com.duanxin.zqls.data.model.LogInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface LogInfoMapper {
    long countByExample(LogInfoExample example);

    int deleteByExample(LogInfoExample example);

    @Delete({
        "delete from log_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into log_info (type, target_id, ",
        "status, operate_time, ",
        "operate_ip, operator, ",
        "old_value, new_value)",
        "values (#{type,jdbcType=TINYINT}, #{targetId,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER}, #{operateTime,jdbcType=TIMESTAMP}, ",
        "#{operateIp,jdbcType=VARCHAR}, #{operator,jdbcType=VARCHAR}, ",
        "#{oldValue,jdbcType=LONGVARCHAR}, #{newValue,jdbcType=LONGVARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(LogInfoWithBLOBs record);

    int insertSelective(LogInfoWithBLOBs record);

    List<LogInfoWithBLOBs> selectByExampleWithBLOBsWithRowbounds(LogInfoExample example, RowBounds rowBounds);

    List<LogInfoWithBLOBs> selectByExampleWithBLOBs(LogInfoExample example);

    List<LogInfo> selectByExampleWithRowbounds(LogInfoExample example, RowBounds rowBounds);

    List<LogInfo> selectByExample(LogInfoExample example);

    @Select({
        "select",
        "id, type, target_id, status, operate_time, operate_ip, operator, old_value, ",
        "new_value",
        "from log_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.LogInfoMapper.ResultMapWithBLOBs")
    LogInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LogInfoWithBLOBs record, @Param("example") LogInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") LogInfoWithBLOBs record, @Param("example") LogInfoExample example);

    int updateByExample(@Param("record") LogInfo record, @Param("example") LogInfoExample example);

    int updateByPrimaryKeySelective(LogInfoWithBLOBs record);

    @Update({
        "update log_info",
        "set type = #{type,jdbcType=TINYINT},",
          "target_id = #{targetId,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR},",
          "old_value = #{oldValue,jdbcType=LONGVARCHAR},",
          "new_value = #{newValue,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(LogInfoWithBLOBs record);

    @Update({
        "update log_info",
        "set type = #{type,jdbcType=TINYINT},",
          "target_id = #{targetId,jdbcType=INTEGER},",
          "status = #{status,jdbcType=INTEGER},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(LogInfo record);
}