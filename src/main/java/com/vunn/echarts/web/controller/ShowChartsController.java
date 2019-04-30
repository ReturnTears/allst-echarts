package com.vunn.echarts.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author June 2019/05/01 上午 12:26
 * @version 1.0
 */
@Controller
@RequestMapping("/allst/echarts/show")
public class ShowChartsController {

    @RequestMapping("/dailyprod")
    public String showDailyProdHtml() {
        return "dailyprod";
    }
}
