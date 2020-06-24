package com.joe.api.service;

import com.joe.api.entity.Dep;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author QiangQiang Gu
 * @date 2020/6/23 10:39
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public Dep getById(Long id) {
                Dep dep = new Dep();
                dep.setId(id);
                dep.setName("该ID："+id+"没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭");
                dep.setDbSource("no this database in MySQL");
                return dep;
            }

            @Override
            public List<Dep> queryAll() {
                return null;
            }
        };
    }
}
