package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsMealRecommendationParameters;
import com.duanxin.zqls.data.model.FmsMealRecommendationParametersExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsMealRecommendationParametersMapper {
    long countByExample(FmsMealRecommendationParametersExample example);

    int deleteByExample(FmsMealRecommendationParametersExample example);

    @Delete({
        "delete from fms_meal_recommendation_parameters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_meal_recommendation_parameters (uid, create_time, ",
        "renew_time)",
        "values (#{uid,jdbcType=INTEGER}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsMealRecommendationParameters record);

    int insertSelective(FmsMealRecommendationParameters record);

    List<FmsMealRecommendationParameters> selectByExampleWithRowbounds(FmsMealRecommendationParametersExample example, RowBounds rowBounds);

    List<FmsMealRecommendationParameters> selectByExample(FmsMealRecommendationParametersExample example);

    @Select({
        "select",
        "id, uid, create_time, renew_time",
        "from fms_meal_recommendation_parameters",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsMealRecommendationParametersMapper.BaseResultMap")
    FmsMealRecommendationParameters selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsMealRecommendationParameters record, @Param("example") FmsMealRecommendationParametersExample example);

    int updateByExample(@Param("record") FmsMealRecommendationParameters record, @Param("example") FmsMealRecommendationParametersExample example);

    int updateByPrimaryKeySelective(FmsMealRecommendationParameters record);

    @Update({
        "update fms_meal_recommendation_parameters",
        "set uid = #{uid,jdbcType=INTEGER},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsMealRecommendationParameters record);
}