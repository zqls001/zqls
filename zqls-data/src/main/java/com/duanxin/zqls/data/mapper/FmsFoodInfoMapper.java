package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FmsFoodInfo;
import com.duanxin.zqls.data.model.FmsFoodInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FmsFoodInfoMapper {
    long countByExample(FmsFoodInfoExample example);

    int deleteByExample(FmsFoodInfoExample example);

    @Delete({
        "delete from fms_food_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into fms_food_info (name, price, ",
        "remark, taste_type, ",
        "basic_features, status, ",
        "pic_url, place, type, ",
        "create_time, operate_time, ",
        "operate_ip, operator)",
        "values (#{name,jdbcType=VARCHAR}, #{price,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.data.handler.MoneyTypeHandler}, ",
        "#{remark,jdbcType=VARCHAR}, #{tasteType,jdbcType=TINYINT}, ",
        "#{basicFeatures,jdbcType=TINYINT}, #{status,jdbcType=TINYINT}, ",
        "#{picUrl,jdbcType=VARCHAR}, #{place,jdbcType=VARCHAR}, #{type,jdbcType=TINYINT}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{operateTime,jdbcType=TIMESTAMP}, ",
        "#{operateIp,jdbcType=VARCHAR}, #{operator,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FmsFoodInfo record);

    int insertSelective(FmsFoodInfo record);

    List<FmsFoodInfo> selectByExampleWithRowbounds(FmsFoodInfoExample example, RowBounds rowBounds);

    List<FmsFoodInfo> selectByExample(FmsFoodInfoExample example);

    @Select({
        "select",
        "id, name, price, remark, taste_type, basic_features, status, pic_url, place, ",
        "type, create_time, operate_time, operate_ip, operator",
        "from fms_food_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FmsFoodInfoMapper.BaseResultMap")
    FmsFoodInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FmsFoodInfo record, @Param("example") FmsFoodInfoExample example);

    int updateByExample(@Param("record") FmsFoodInfo record, @Param("example") FmsFoodInfoExample example);

    int updateByPrimaryKeySelective(FmsFoodInfo record);

    @Update({
        "update fms_food_info",
        "set name = #{name,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.data.handler.MoneyTypeHandler},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "taste_type = #{tasteType,jdbcType=TINYINT},",
          "basic_features = #{basicFeatures,jdbcType=TINYINT},",
          "status = #{status,jdbcType=TINYINT},",
          "pic_url = #{picUrl,jdbcType=VARCHAR},",
          "place = #{place,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "operate_time = #{operateTime,jdbcType=TIMESTAMP},",
          "operate_ip = #{operateIp,jdbcType=VARCHAR},",
          "operator = #{operator,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FmsFoodInfo record);
}