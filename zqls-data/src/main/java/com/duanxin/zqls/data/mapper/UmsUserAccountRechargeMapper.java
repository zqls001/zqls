package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.UmsUserAccountRecharge;
import com.duanxin.zqls.data.model.UmsUserAccountRechargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsUserAccountRechargeMapper {
    long countByExample(UmsUserAccountRechargeExample example);

    int deleteByExample(UmsUserAccountRechargeExample example);

    @Delete({
        "delete from ums_user_account_recharge",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_user_account_recharge (time, style, ",
        "amount)",
        "values (#{time,jdbcType=TIMESTAMP}, #{style,jdbcType=CHAR}, ",
        "#{amount,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.data.handler.MoneyTypeHandler})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsUserAccountRecharge record);

    int insertSelective(UmsUserAccountRecharge record);

    List<UmsUserAccountRecharge> selectByExampleWithRowbounds(UmsUserAccountRechargeExample example, RowBounds rowBounds);

    List<UmsUserAccountRecharge> selectByExample(UmsUserAccountRechargeExample example);

    @Select({
        "select",
        "id, time, style, amount",
        "from ums_user_account_recharge",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.UmsUserAccountRechargeMapper.BaseResultMap")
    UmsUserAccountRecharge selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserAccountRecharge record, @Param("example") UmsUserAccountRechargeExample example);

    int updateByExample(@Param("record") UmsUserAccountRecharge record, @Param("example") UmsUserAccountRechargeExample example);

    int updateByPrimaryKeySelective(UmsUserAccountRecharge record);

    @Update({
        "update ums_user_account_recharge",
        "set time = #{time,jdbcType=TIMESTAMP},",
          "style = #{style,jdbcType=CHAR},",
          "amount = #{amount,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.data.handler.MoneyTypeHandler}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsUserAccountRecharge record);
}