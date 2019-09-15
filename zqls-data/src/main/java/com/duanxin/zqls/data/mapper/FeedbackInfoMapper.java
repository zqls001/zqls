package com.duanxin.zqls.data.mapper;

import com.duanxin.zqls.data.model.FeedbackInfo;
import com.duanxin.zqls.data.model.FeedbackInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface FeedbackInfoMapper {
    long countByExample(FeedbackInfoExample example);

    int deleteByExample(FeedbackInfoExample example);

    @Delete({
        "delete from feedback_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into feedback_info (uid, type, ",
        "remark, status, ",
        "is_pic, pic_url, create_time, ",
        "renew_time)",
        "values (#{uid,jdbcType=INTEGER}, #{type,jdbcType=TINYINT}, ",
        "#{remark,jdbcType=VARCHAR}, #{status,jdbcType=TINYINT}, ",
        "#{isPic,jdbcType=TINYINT}, #{picUrl,jdbcType=VARCHAR}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{renewTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(FeedbackInfo record);

    int insertSelective(FeedbackInfo record);

    List<FeedbackInfo> selectByExampleWithRowbounds(FeedbackInfoExample example, RowBounds rowBounds);

    List<FeedbackInfo> selectByExample(FeedbackInfoExample example);

    @Select({
        "select",
        "id, uid, type, remark, status, is_pic, pic_url, create_time, renew_time",
        "from feedback_info",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("com.duanxin.zqls.data.mapper.FeedbackInfoMapper.BaseResultMap")
    FeedbackInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeedbackInfo record, @Param("example") FeedbackInfoExample example);

    int updateByExample(@Param("record") FeedbackInfo record, @Param("example") FeedbackInfoExample example);

    int updateByPrimaryKeySelective(FeedbackInfo record);

    @Update({
        "update feedback_info",
        "set uid = #{uid,jdbcType=INTEGER},",
          "type = #{type,jdbcType=TINYINT},",
          "remark = #{remark,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=TINYINT},",
          "is_pic = #{isPic,jdbcType=TINYINT},",
          "pic_url = #{picUrl,jdbcType=VARCHAR},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "renew_time = #{renewTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(FeedbackInfo record);
}