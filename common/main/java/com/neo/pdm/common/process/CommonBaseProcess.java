package com.neo.pdm.common.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.neo.pdm.core.BaseAccessManager;
import com.neo.pdm.core.model.DefaultUserInfo;

public class CommonBaseProcess extends BaseAccessManager{

    private static final Logger logger = LoggerFactory.getLogger(CommonBaseProcess.class);
    
    public CommonBaseProcess(DefaultUserInfo userinfo){
        super(userinfo);
    }
}
