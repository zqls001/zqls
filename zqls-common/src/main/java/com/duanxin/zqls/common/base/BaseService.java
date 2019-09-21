package com.duanxin.zqls.common.base;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * BaseService接口
 * @author duanxin
 * @version 1.0
 * @date 2019/9/16 8:38
 */
public interface BaseService<Record, Example> {

    /**
     * 根据条件获取记录数量
     * @param example 条件
     * @date 2019/9/16 8:39
     * @return int
     **/
    int countByExample(Example example);

    /**
     * 根据条件删除记录
     * @param example 条件
     * @date 2019/9/16 8:40
     * @return int
     **/
    int deleteByExample(Example example);

    /**
     * 根据主键删除记录
     * @param id 主键
     * @date 2019/9/16 8:41
     * @return int
     **/
    int deleteByPrimaryKey(Integer id);

    /**
     * 插入记录
     * @param record 记录
     * @date 2019/9/16 8:42
     * @return int
     **/
    int insert(Record record);

    /**
     * 插入记录有效字段
     * @param record 记录
     * @date 2019/9/16 8:42
     * @return int
     **/
    int insertSelective(Record record);

    /**
     * 根据条件查询记录
     * @param example 条件
     * @date 2019/9/16 8:46
     * @return java.util.List<Record>
     **/
    List<Record> selectByExample(Example example);

    /**
     * 根据主键查询记录
     * @param id 主键
     * @date 2019/9/16 8:47
     * @return Record
     **/
    Record selectByPrimaryKey(Integer id);

    /**
     * 根据条件查询记录并分页，附带BLOB字段
     * @param example 条件
     * @param pageNum 页数
     * @param pageSize 每页记录数
     * @date 2019/9/16 8:57
     * @return java.util.List<Record>
     **/
    List<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize);

    /**
     * 根据条件查询记录并分页
     * @param example 条件
     * @param pageNum 页数
     * @param pageSize 每页记录数
     * @date 2019/9/16 9:13
     * @return java.util.List<Record>
     **/
    List<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize);

    /**
     * 根据条件查询记录并按最后记录数分页，附带BLOB字段
     * @param example 条件
     * @param offset 跳过数量
     * @param limit 查询数量
     * @date 2019/9/16 9:14
     * @return java.util.List<Record>
     **/
    List<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit);

    /**
     * 根据条件查询记录并按最后记录数分页
     * @param example 条件
     * @param offset 跳过数量
     * @param limit 查询数量
     * @date 2019/9/16 9:15
     * @return java.util.List<Record>
     **/
    List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit);

    /**
     * 根据条件查询第一条记录
     * @param example 条件
     * @date 2019/9/16 9:16
     * @return Record
     **/
    Record selectFirstByExample(Example example);

    /**
     * 根据条件查询记录第一条，附带BLOBs
     * @param example 条件
     * @date 2019/9/16 9:17
     * @return Record
     **/
    Record selectFirstByExampleWithBLOBs(Example example);

    /**
     * 根据条件更新记录有效字段
     * @param record  记录
     * @param example 条件
     * @date 2019/9/16 8:49
     * @return int
     **/
    int updateByExampleSelective(@Param("record") Record record, @Param("example") Example example);

    /**
     * 根据条件更新记录
     * @param record  记录
     * @param example 条件
     * @date 2019/9/16 8:51
     * @return int
     **/
    int updateByExample(@Param("record") Record record, @Param("example") Example example);

    /**
     * 根据条件更新记录，附带BLOBs
     * @param record 记录
     * @param example 条件
     * @date 2019/9/16 9:20
     * @return int
     **/
    int updateByExampleWithBLOBs(@Param("record") Record record, @Param("example") Example example);

    /**
     * 根据主键更新记录有效字段
     * @param record 记录
     * @date 2019/9/16 8:53
     * @return int
     **/
    int updateByPrimaryKeySelective(Record record);

    /**
     * 根据主键更新记录
     * @param record 记录
     * @date 2019/9/16 8:54
     * @return int
     **/
    int updateByPrimaryKey(Record record);

    /**
     * 根据主键更新记录，附带BLOBs
     * @param record 记录
     * @date 2019/9/16 9:21
     * @return int
     **/
    int updateByPrimaryKeyWithBLOBs(Record record);

    /**
     * 根据主键批量删除记录
     * @param ids 主键
     * @date 2019/9/16 9:22
     * @return int
     **/
    int deleteByPriaryKeys(String ids);

    /**
     * 初始化mapper
     * @date 2019/9/16 9:23
     **/
    void initMapper();
}
