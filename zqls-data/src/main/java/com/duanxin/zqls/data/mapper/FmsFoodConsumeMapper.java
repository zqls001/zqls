package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsFoodConsume;
import com.duanxin.zqls.data.model.FmsFoodConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsFoodConsumeMapper {
    long countByExample(FmsFoodConsumeExample example);

    int deleteByExample(FmsFoodConsumeExample example);

    @Delete({
        "delete from fms_food_consume",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_food_consume (fid, uid, food_quality, ",
        "type, create_time, ",
        "renew_time)",
        "values (#{fid,jdbcType=INTEGER}, #{uid,jdbcType=CHAR}, #{foodQuality,jdbcType=DECIMAL}, ",
        "#{type,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsFoodConsume record);

    int insertSelective(FmsFoodConsume record);

    List<FmsFoodConsume> selectByExampleWithRowbounds(FmsFoodConsumeExample example, RowBounds rowBounds);

    List<FmsFoodConsume> selectByExample(FmsFoodConsumeExample example);

    @Select({
        "select",
        "id, fid, uid, food_quality, type, create_time, renew_time",
        "from fms_food_consume",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsFoodConsumeMapper.BaseResultMap")
    FmsFoodConsume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsFoodConsume record, @Param("example") FmsFoodConsumeExample example);

    int updateByExample(@Param("record") FmsFoodConsume record, @Param("example") FmsFoodConsumeExample example);

    int updateByPrimaryKeySelective(FmsFoodConsume record);

    @Update({
        "update fms_food_consume",
        "set fid = #{fid,jdbcType=INTEGER},",
          "uid = #{uid,jdbcType=CHAR},",
          "food_quality = #{foodQuality,jdbcType=DECIMAL},",
          "type = #{type,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsFoodConsume record);
}