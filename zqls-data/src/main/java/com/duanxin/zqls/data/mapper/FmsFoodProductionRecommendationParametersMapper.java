package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsFoodProductionRecommendationParameters;
import com.duanxin.zqls.data.model.FmsFoodProductionRecommendationParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsFoodProductionRecommendationParametersMapper {
    long countByExample(FmsFoodProductionRecommendationParametersExample example);

    int deleteByExample(FmsFoodProductionRecommendationParametersExample example);

    @Delete({
        "delete from fms_food_production_recommendation_parameters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_food_production_recommendation_parameters (cid, create_time, ",
        "renew_time)",
        "values (#{cid,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsFoodProductionRecommendationParameters record);

    int insertSelective(FmsFoodProductionRecommendationParameters record);

    List<FmsFoodProductionRecommendationParameters> selectByExampleWithRowbounds(FmsFoodProductionRecommendationParametersExample example, RowBounds rowBounds);

    List<FmsFoodProductionRecommendationParameters> selectByExample(FmsFoodProductionRecommendationParametersExample example);

    @Select({
        "select",
        "id, cid, create_time, renew_time",
        "from fms_food_production_recommendation_parameters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsFoodProductionRecommendationParametersMapper.BaseResultMap")
    FmsFoodProductionRecommendationParameters selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsFoodProductionRecommendationParameters record, @Param("example") FmsFoodProductionRecommendationParametersExample example);

    int updateByExample(@Param("record") FmsFoodProductionRecommendationParameters record, @Param("example") FmsFoodProductionRecommendationParametersExample example);

    int updateByPrimaryKeySelective(FmsFoodProductionRecommendationParameters record);

    @Update({
        "update fms_food_production_recommendation_parameters",
        "set cid = #{cid,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsFoodProductionRecommendationParameters record);
}