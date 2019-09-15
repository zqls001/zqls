package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsFoodProductionRecommendation;
import com.duanxin.zqls.data.model.FmsFoodProductionRecommendationExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsFoodProductionRecommendationMapper {
    long countByExample(FmsFoodProductionRecommendationExample example);

    int deleteByExample(FmsFoodProductionRecommendationExample example);

    @Delete({
        "delete from fms_food_production_recommendation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_food_production_recommendation (fid, production, ",
        "create_time, renew_time)",
        "values (#{fid,jdbcType=INTEGER}, #{production,jdbcType=DECIMAL}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsFoodProductionRecommendation record);

    int insertSelective(FmsFoodProductionRecommendation record);

    List<FmsFoodProductionRecommendation> selectByExampleWithRowbounds(FmsFoodProductionRecommendationExample example, RowBounds rowBounds);

    List<FmsFoodProductionRecommendation> selectByExample(FmsFoodProductionRecommendationExample example);

    @Select({
        "select",
        "id, fid, production, create_time, renew_time",
        "from fms_food_production_recommendation",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsFoodProductionRecommendationMapper.BaseResultMap")
    FmsFoodProductionRecommendation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsFoodProductionRecommendation record, @Param("example") FmsFoodProductionRecommendationExample example);

    int updateByExample(@Param("record") FmsFoodProductionRecommendation record, @Param("example") FmsFoodProductionRecommendationExample example);

    int updateByPrimaryKeySelective(FmsFoodProductionRecommendation record);

    @Update({
        "update fms_food_production_recommendation",
        "set fid = #{fid,jdbcType=INTEGER},",
          "production = #{production,jdbcType=DECIMAL},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsFoodProductionRecommendation record);
}