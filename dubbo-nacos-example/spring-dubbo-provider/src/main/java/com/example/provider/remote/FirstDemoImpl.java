package com.example.provider.remote;

import com.dubbo.api.remote.FirstDubboService;
import com.dubbo.api.response.FirstDubboReturnDemoDTO;
import com.dubbo.api.response.RpcResult;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService
public class FirstDemoImpl implements FirstDubboService {
    @Override
    public RpcResult<FirstDubboReturnDemoDTO> getFirstDemoReturn() {
        FirstDubboReturnDemoDTO firstDubboReturnDemoDTO = new FirstDubboReturnDemoDTO();
        firstDubboReturnDemoDTO.setNum(200);
        return RpcResult.success(firstDubboReturnDemoDTO);
    }
}
