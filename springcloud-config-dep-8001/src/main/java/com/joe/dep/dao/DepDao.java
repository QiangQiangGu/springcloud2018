package com.joe.dep.dao;

import com.joe.api.entity.Dep;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (Dep)表数据库访问层
 *
 * @author Joe
 * @since 2020-05-27 10:34:58
 */
public interface DepDao {

    /**
     * 新增数据
     *
     * @param dep 实例对象
     * @return 影响行数
     */
    int insert(Dep dep);

    /**
     * 通过主键删除数据
     *
     * @param  id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    /**
     * 修改数据
     *
     * @param dep 实例对象
     * @return 影响行数
     */
    int update(Dep dep);

    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    Dep queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Dep> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param dep 实例对象
     * @return 对象列表
     */
    List<Dep> queryAll(Dep dep);

}