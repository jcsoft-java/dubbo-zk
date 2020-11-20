package com.jc.dubboprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jc.dubboproviderapi.service.CostService;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/11/20 14:45
 * @Version 1.0
 */
@Service
public class CostServiceImpl implements CostService {
    /**
     * 假设之前总花费了100
     */
    private final Integer totalCost = 1000;

    /**
     * 之前总和 加上 最近一笔
     *
     * @param cost
     * @return
     */
    @Override
    public Integer add(int cost) {
        return totalCost + cost;
    }
}