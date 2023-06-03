package com.example.consumer.controller;

import com.dubbo.api.remote.FirstDubboService;
import com.dubbo.api.response.FirstDubboReturnDemoDTO;
import com.dubbo.api.response.RpcResult;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference(check = false)
    private FirstDubboService firstDubboService;



    @GetMapping("/demo")
    public Integer getDemoInfo(){
        RpcResult<FirstDubboReturnDemoDTO> firstDemoReturn = firstDubboService.getFirstDemoReturn();
        FirstDubboReturnDemoDTO data = firstDemoReturn.getData();
        Integer num = data.getNum();
        return num;
    }
}
