package com.duanxin.zqls.ucenter.mapper;

import com.duanxin.zqls.ucenter.model.UmsUserAccountInfo;
import com.duanxin.zqls.ucenter.model.UmsUserAccountInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface UmsUserAccountInfoMapper {
    long countByExample(UmsUserAccountInfoExample example);

    int deleteByExample(UmsUserAccountInfoExample example);

    @Delete({
        "delete from ums_user_account_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into ums_user_account_info (aid, balance, ",
        "type, flow_id)",
        "values (#{aid,jdbcType=CHAR}, #{balance,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.common.handler.MoneyTypeHandler}, ",
        "#{type,jdbcType=CHAR}, #{flowId,jdbcType=INTEGER})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(UmsUserAccountInfo record);

    int insertSelective(UmsUserAccountInfo record);

    List<UmsUserAccountInfo> selectByExampleWithRowbounds(UmsUserAccountInfoExample example, RowBounds rowBounds);

    List<UmsUserAccountInfo> selectByExample(UmsUserAccountInfoExample example);

    @Select({
        "select",
        "id, aid, balance, type, flow_id",
        "from ums_user_account_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.ucenter.mapper.UmsUserAccountInfoMapper.BaseResultMap")
    UmsUserAccountInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserAccountInfo record, @Param("example") UmsUserAccountInfoExample example);

    int updateByExample(@Param("record") UmsUserAccountInfo record, @Param("example") UmsUserAccountInfoExample example);

    int updateByPrimaryKeySelective(UmsUserAccountInfo record);

    @Update({
        "update ums_user_account_info",
        "set aid = #{aid,jdbcType=CHAR},",
          "balance = #{balance,jdbcType=BIGINT,typeHandler=com.duanxin.zqls.common.handler.MoneyTypeHandler},",
          "type = #{type,jdbcType=CHAR},",
          "flow_id = #{flowId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UmsUserAccountInfo record);
}