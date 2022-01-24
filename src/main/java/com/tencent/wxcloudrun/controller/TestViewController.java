package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index控制器
 */
@Controller
@RequestMapping("/yq/tool")
public class TestViewController {
  /**
   * 测试页面
   * @return API response html
   */
  @RequestMapping(value = "/test01")
  public String test01() {
    return "test01";
  }
}
