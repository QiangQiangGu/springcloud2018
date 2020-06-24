package com.joe.cloud02.service.impl;

import com.joe.api.entity.Dep;
import com.joe.cloud02.service.DepService;
import com.joe.cloud02.dao.DepDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dep)表服务实现类
 *
 * @author Joe
 * @since 2020-05-31 11:31:09
 */
@Service("depService")
public class DepServiceImpl implements DepService {
    @Resource
    private DepDao depDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Dep queryById(Long id) {
        return this.depDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Dep> queryAllByLimit(int offset, int limit) {
        return this.depDao.queryAllByLimit(offset, limit);
    }

    /**
     * 查询多条数据
     * @param dep dep
     * @return 对象列表
     */
    @Override
    public List<Dep> queryAll(Dep dep){
        return depDao.queryAll(dep);
    }

    /**
     * 新增数据
     *
     * @param dep 实例对象
     * @return 实例对象
     */
    @Override
    public Dep insert(Dep dep) {
        this.depDao.insert(dep);
        return dep;
    }

    /**
     * 修改数据
     *
     * @param dep 实例对象
     * @return 实例对象
     */
    @Override
    public Dep update(Dep dep) {
        this.depDao.update(dep);
        return this.queryById(dep.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.depDao.deleteById(id) > 0;
    }
}