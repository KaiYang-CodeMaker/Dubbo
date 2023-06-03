package com.dubbo.api.remote;

import com.dubbo.api.response.FirstDubboReturnDemoDTO;
import com.dubbo.api.response.RpcResult;

public interface FirstDubboService {

    /**
     * 提供一个公共的api，用于订阅者调用。发布者实现
     * @return FirstDubboReturnDemoDTO
     */
    RpcResult<FirstDubboReturnDemoDTO> getFirstDemoReturn();



}
