package com.gigastone.order.controller;

import com.gigastone.order.service.RateService;

import com.gigastone.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class AsiaYoController {
    @Autowired
    RateService rateService;

    @RequestMapping("/ratechange")
    public R getOrderEntityByOrderId(@RequestParam("source") String source, @RequestParam("target") String  target, @RequestParam("amount") String  amount){
        String amounts= rateService.ratechange(source,target,amount);
        return R.ok().put("msg","success").put("amout",amounts);
    }

}
