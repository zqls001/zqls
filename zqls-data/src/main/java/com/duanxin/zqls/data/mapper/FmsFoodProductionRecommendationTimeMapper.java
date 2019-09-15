package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsFoodProductionRecommendationTime;
import com.duanxin.zqls.data.model.FmsFoodProductionRecommendationTimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsFoodProductionRecommendationTimeMapper {
    long countByExample(FmsFoodProductionRecommendationTimeExample example);

    int deleteByExample(FmsFoodProductionRecommendationTimeExample example);

    @Delete({
        "delete from fms_food_production_recommendation_time",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_food_production_recommendation_time (date, week, ",
        "type, remark)",
        "values (#{date,jdbcType=DATE}, #{week,jdbcType=TINYINT}, ",
        "#{type,jdbcType=TINYINT}, #{remark,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsFoodProductionRecommendationTime record);

    int insertSelective(FmsFoodProductionRecommendationTime record);

    List<FmsFoodProductionRecommendationTime> selectByExampleWithRowbounds(FmsFoodProductionRecommendationTimeExample example, RowBounds rowBounds);

    List<FmsFoodProductionRecommendationTime> selectByExample(FmsFoodProductionRecommendationTimeExample example);

    @Select({
        "select",
        "id, date, week, type, remark",
        "from fms_food_production_recommendation_time",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsFoodProductionRecommendationTimeMapper.BaseResultMap")
    FmsFoodProductionRecommendationTime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsFoodProductionRecommendationTime record, @Param("example") FmsFoodProductionRecommendationTimeExample example);

    int updateByExample(@Param("record") FmsFoodProductionRecommendationTime record, @Param("example") FmsFoodProductionRecommendationTimeExample example);

    int updateByPrimaryKeySelective(FmsFoodProductionRecommendationTime record);

    @Update({
        "update fms_food_production_recommendation_time",
        "set date = #{date,jdbcType=DATE},",
          "week = #{week,jdbcType=TINYINT},",
          "type = #{type,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsFoodProductionRecommendationTime record);
}