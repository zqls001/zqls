package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.UmsUserAccountConsume;
import com.duanxin.zqls.data.model.UmsUserAccountConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsUserAccountConsumeMapper {
    long countByExample(UmsUserAccountConsumeExample example);

    int deleteByExample(UmsUserAccountConsumeExample example);

    @Delete({
        "delete from ums_user_account_consume",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_user_account_consume (time, place, ",
        "price)",
        "values (#{time,jdbcType=TIMESTAMP}, #{place,jdbcType=VARCHAR}, ",
        "#{price,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.data.handler.MoneyTypeHandler})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsUserAccountConsume record);

    int insertSelective(UmsUserAccountConsume record);

    List<UmsUserAccountConsume> selectByExampleWithRowbounds(UmsUserAccountConsumeExample example, RowBounds rowBounds);

    List<UmsUserAccountConsume> selectByExample(UmsUserAccountConsumeExample example);

    @Select({
        "select",
        "id, time, place, price",
        "from ums_user_account_consume",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.UmsUserAccountConsumeMapper.BaseResultMap")
    UmsUserAccountConsume selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserAccountConsume record, @Param("example") UmsUserAccountConsumeExample example);

    int updateByExample(@Param("record") UmsUserAccountConsume record, @Param("example") UmsUserAccountConsumeExample example);

    int updateByPrimaryKeySelective(UmsUserAccountConsume record);

    @Update({
        "update ums_user_account_consume",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "place = #{place,jdbcType=VARCHAR},",
          "price = #{price,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.data.handler.MoneyTypeHandler}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsUserAccountConsume record);
}