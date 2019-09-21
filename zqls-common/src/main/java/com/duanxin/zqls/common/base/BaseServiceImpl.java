package com.duanxin.zqls.common.base;
import com.duanxin.zqls.common.util.SpringContextUtil;
import com.github.pagehelper.PageHelper;

import java.lang.reflect.InvocationTargetException;
import	java.lang.reflect.Method;

import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * BaseService实现抽象
 * @author duanxin
 * @version 1.0
 * @date 2019/9/16 9:23
 */
public abstract class BaseServiceImpl<Mapper, Record, Example> implements BaseService<Record, Example> {

    private Mapper mapper;

    @Override
    public int countByExample(Example example) {

        try {
            Method countByExample = mapper.getClass().getDeclaredMethod("countByExample", example.getClass());
            Object result = countByExample.invoke(mapper, example);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByExample(Example example) {

        try {
            Method deleteByExample = mapper.getClass().getDeclaredMethod("deleteByExample", example.getClass());
            Object result = deleteByExample.invoke(mapper, example);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {

        try {
            Method deleteByPrimaryKey = mapper.getClass().getDeclaredMethod("deleteByPrimaryKey", id.getClass());
            Object result = deleteByPrimaryKey.invoke(mapper, id);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insert(Record record) {

        try {
            Method insert = mapper.getClass().getDeclaredMethod("insert", record.getClass());
            Object result = insert.invoke(mapper, record);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertSelective(Record record) {

        try {
            Method insertSelective = mapper.getClass().getDeclaredMethod("insertSelective", record.getClass());
            Object result = insertSelective.invoke(mapper, record);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public List<Record> selectByExample(Example example) {

        try {
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
            Object result = selectByExample.invoke(mapper, example);

            return (List<Record>) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Record selectByPrimaryKey(Integer id) {

        try {
            Method selectByPrimaryKey = mapper.getClass().getDeclaredMethod("selectByPrimaryKey", id.getClass());
            Object result = selectByPrimaryKey.invoke(mapper, id);

            return (Record) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Record> selectByExampleWithBLOBsForStartPage(Example example, Integer pageNum, Integer pageSize) {

        try {
            Method selectByExampleWithBLOBsForStartPage = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBsForStartPage", example.getClass());
            PageHelper.startPage(pageNum, pageSize, false);
            Object result = selectByExampleWithBLOBsForStartPage.invoke(mapper, example);

            return (List<Record>) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Record> selectByExampleForStartPage(Example example, Integer pageNum, Integer pageSize) {

        try {
            Method selectByExampleForStartPage = mapper.getClass().getDeclaredMethod("selectByExampleForStartPage", example.getClass());
            PageHelper.startPage(pageNum, pageSize, false);
            Object result = selectByExampleForStartPage.invoke(mapper, example);

            return (List<Record>) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Record> selectByExampleWithBLOBsForOffsetPage(Example example, Integer offset, Integer limit) {

        try {
            Method selectByExampleWithBLOBsForOffsetPage = mapper.getClass().getDeclaredMethod("selectByExampleWithBLOBsForOffsetPage", example.getClass());
            PageHelper.offsetPage(offset, limit, false);
            Object result = selectByExampleWithBLOBsForOffsetPage.invoke(mapper, example);

            return (List<Record>) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Record> selectByExampleForOffsetPage(Example example, Integer offset, Integer limit) {

        try {
            Method selectByExampleForOffsetPage = mapper.getClass().getDeclaredMethod("selectByExampleForOffsetPage", example.getClass());
            PageHelper.offsetPage(offset, limit, false);
            Object result = selectByExampleForOffsetPage.invoke(mapper, example);

            return (List<Record>) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Record selectFirstByExample(Example example) {

        try {
            Method selectFirstByExample = mapper.getClass().getDeclaredMethod("selectFirstByExample", example.getClass());
            Object result = selectFirstByExample.invoke(mapper, example);

            return (Record) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Record selectFirstByExampleWithBLOBs(Example example) {

        try {
            Method selectFirstByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("selectFirstByExampleWithBLOBs", example.getClass());
            Object result = selectFirstByExampleWithBLOBs.invoke(mapper, example);

            return (Record) result;
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int updateByExampleSelective(Record record, Example example) {

        try {
            Method updateByExampleSelective = mapper.getClass().getDeclaredMethod("updateByExampleSelective", record.getClass(), example.getClass());
            Object result = updateByExampleSelective.invoke(mapper, record, example);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByExample(Record record, Example example) {

        try {
            Method updateByExample = mapper.getClass().getDeclaredMethod("updateByExample", record.getClass(), example.getClass());
            Object result = updateByExample.invoke(mapper, record, example);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByExampleWithBLOBs(Record record, Example example) {

        try {
            Method updateByExampleWithBLOBs = mapper.getClass().getDeclaredMethod("updateByExampleWithBLOBs", record.getClass(), example.getClass());
            Object result = updateByExampleWithBLOBs.invoke(mapper, record, example);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeySelective(Record record) {

        try {
            Method updateByPrimaryKeySelective = mapper.getClass().getDeclaredMethod("updateByPrimaryKeySelective", record.getClass());
            Object result = updateByPrimaryKeySelective.invoke(mapper, record);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Record record) {

        try {
            Method updateByPrimaryKey = mapper.getClass().getDeclaredMethod("updateByPrimaryKey", record.getClass());
            Object result = updateByPrimaryKey.invoke(mapper, record);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(Record record) {

        try {
            Method updateByPrimaryKeyWithBLOBs = mapper.getClass().getDeclaredMethod("updateByPrimaryKeyWithBLOBs", record.getClass());
            Object result = updateByPrimaryKeyWithBLOBs.invoke(mapper, record);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int deleteByPriaryKeys(String ids) {

        try {
            Method deleteByPriaryKeys = mapper.getClass().getDeclaredMethod("deleteByPriaryKeys", ids.getClass());
            Object result = deleteByPriaryKeys.invoke(mapper, ids);

            return Integer.parseInt(String.valueOf(result));
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void initMapper() {
        this.mapper = SpringContextUtil.getBean(getMapperClass());
    }

    /**
     * 获取类泛型class
     * @date 2019/9/16 9:52
     * @return java.lang.Class<Mapper>
     **/
    public Class<Mapper> getMapperClass() {
        return (Class<Mapper>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }
}
