package com.jc.dubboconsumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jc.dubboapi.service.CostService;
import com.jc.dubboconsumer.service.ProductService;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/1/12 21:52
 * @Version 1.0
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Reference
    private CostService costService;

    @Override
    public Integer getCost(int a) {
        return costService.add(a);
    }
}
