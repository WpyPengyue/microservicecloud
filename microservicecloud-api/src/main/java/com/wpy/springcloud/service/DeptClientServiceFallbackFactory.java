package com.wpy.springcloud.service;

import com.wpy.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component //不要忘记添加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(Integer.parseInt(id + "")).setDname("该ID：" + id + "没有对应的信息，Consumer客户端提供的降级信息，此刻服务Provider已经关闭").setDb_source("no this data in mysql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
