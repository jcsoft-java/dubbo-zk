package com.jc.dubboprovider1.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jc.dubboapi.service.CostService;
import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.extern.slf4j.Slf4j;

/*
 *
 * @Copyright: 2020JCSoft
 * @author: Zjf
 * @since: 2020/1/12 21:59
 * @Version 1.0
 */
@Service
@Slf4j
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
