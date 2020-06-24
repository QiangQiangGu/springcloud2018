package com.joe.hystrix01.controller;

import com.joe.api.entity.Dep;
import com.joe.hystrix01.service.DepService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Dep)表控制层
 *
 * @author Joe
 * @since 2020-05-27 10:34:59
 */
@RestController
@RequestMapping("dep")
public class DepController {
    /**
     * 服务对象
     */
    @Resource
    private DepService depService;

    @Autowired
    DiscoveryClient client;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping
    @RequestMapping("{id}")
    @HystrixCommand(fallbackMethod = "processHystrixGet")
    public Dep queryById(@PathVariable("id") Long id) {
        Dep dep = this.depService.queryById(id);
        if (dep == null) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        return dep;
    }


    public Dep processHystrixGet(@PathVariable("id") Long id) {
        Dep dep = new Dep();
        dep.setId(id);
        dep.setName("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand");
        dep.setDbSource("no this database in MySQL");
        return dep;
    }


    /**
     * 通过主键查询单条数据
     *
     * @return 对象列表
     */
    @GetMapping
    public List<Dep> queryAll() {
        return this.depService.queryAll(null);
    }

    @RequestMapping(path = "discovery", method = RequestMethod.GET)
    public Object dispatch() {
        List<String> services = client.getServices();
        System.out.println("********************" + services);
        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-DEP-8001");
        for (ServiceInstance instance : instances) {
            System.out.println("Uri=============" + instance.getUri());
            System.out.println("Host=============" + instance.getHost());
            System.out.println("Port=============" + instance.getPort());
            System.out.println("ServiceId=============" + instance.getServiceId());
        }
        return client;
    }

}