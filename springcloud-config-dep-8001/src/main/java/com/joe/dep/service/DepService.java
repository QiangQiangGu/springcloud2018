package com.joe.dep.service;

import com.joe.api.entity.Dep;

import java.util.List;

/**
 * (Dep)表服务接口
 *
 * @author Joe
 * @since 2020-05-27 10:34:59
 */
public interface DepService {

    /**
     * 新增数据
     *
     * @param dep 实例对象
     * @return 实例对象
     */
    boolean insert(Dep dep);

    /**
     * 修改数据
     *
     * @param dep 实例对象
     * @return 实例对象
     */
    boolean update(Dep dep);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Dep queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Dep> queryAllByLimit(int offset, int limit);

    /**
     * 通过实体作为筛选条件查询
     * @param dep dep
     * @return 对象列表
     */
    List<Dep> queryAll(Dep dep);
}