package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsUserLike;
import com.duanxin.zqls.data.model.FmsUserLikeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsUserLikeMapper {
    long countByExample(FmsUserLikeExample example);

    int deleteByExample(FmsUserLikeExample example);

    @Delete({
        "delete from fms_user_like",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_user_like (uid, nation, ",
        "area, taste_type, ",
        "diet, favorite_dishes, ",
        "create_time, renew_time)",
        "values (#{uid,jdbcType=INTEGER}, #{nation,jdbcType=TINYINT}, ",
        "#{area,jdbcType=TINYINT}, #{tasteType,jdbcType=TINYINT}, ",
        "#{diet,jdbcType=TINYINT}, #{favoriteDishes,jdbcType=TINYINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsUserLike record);

    int insertSelective(FmsUserLike record);

    List<FmsUserLike> selectByExampleWithRowbounds(FmsUserLikeExample example, RowBounds rowBounds);

    List<FmsUserLike> selectByExample(FmsUserLikeExample example);

    @Select({
        "select",
        "id, uid, nation, area, taste_type, diet, favorite_dishes, create_time, renew_time",
        "from fms_user_like",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsUserLikeMapper.BaseResultMap")
    FmsUserLike selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsUserLike record, @Param("example") FmsUserLikeExample example);

    int updateByExample(@Param("record") FmsUserLike record, @Param("example") FmsUserLikeExample example);

    int updateByPrimaryKeySelective(FmsUserLike record);

    @Update({
        "update fms_user_like",
        "set uid = #{uid,jdbcType=INTEGER},",
          "nation = #{nation,jdbcType=TINYINT},",
          "area = #{area,jdbcType=TINYINT},",
          "taste_type = #{tasteType,jdbcType=TINYINT},",
          "diet = #{diet,jdbcType=TINYINT},",
          "favorite_dishes = #{favoriteDishes,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsUserLike record);
}