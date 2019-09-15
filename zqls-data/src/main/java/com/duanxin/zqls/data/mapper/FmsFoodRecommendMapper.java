package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsFoodRecommend;
import com.duanxin.zqls.data.model.FmsFoodRecommendExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsFoodRecommendMapper {
    long countByExample(FmsFoodRecommendExample example);

    int deleteByExample(FmsFoodRecommendExample example);

    @Delete({
        "delete from fms_food_recommend",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_food_recommend (uid, fid, ",
        "type, create_time, ",
        "renew_time)",
        "values (#{uid,jdbcType=INTEGER}, #{fid,jdbcType=INTEGER}, ",
        "#{type,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsFoodRecommend record);

    int insertSelective(FmsFoodRecommend record);

    List<FmsFoodRecommend> selectByExampleWithRowbounds(FmsFoodRecommendExample example, RowBounds rowBounds);

    List<FmsFoodRecommend> selectByExample(FmsFoodRecommendExample example);

    @Select({
        "select",
        "id, uid, fid, type, create_time, renew_time",
        "from fms_food_recommend",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsFoodRecommendMapper.BaseResultMap")
    FmsFoodRecommend selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsFoodRecommend record, @Param("example") FmsFoodRecommendExample example);

    int updateByExample(@Param("record") FmsFoodRecommend record, @Param("example") FmsFoodRecommendExample example);

    int updateByPrimaryKeySelective(FmsFoodRecommend record);

    @Update({
        "update fms_food_recommend",
        "set uid = #{uid,jdbcType=INTEGER},",
          "fid = #{fid,jdbcType=INTEGER},",
          "type = #{type,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsFoodRecommend record);
}