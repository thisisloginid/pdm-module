package com.neo.pdm.common.process;

import com.neo.pdm.core.BaseAccessManager;
import com.neo.pdm.core.model.DefaultUserInfo;

public class CommonLoginProcess extends BaseAccessManager{

    public CommonLoginProcess(DefaultUserInfo userinfo){
        super(userinfo);
    }
    
    public String login(com.neo.pdm.common.model.UserInfo userinfo){
        if( "kjw".equals(userinfo.getId()) && "111".equals(userinfo.getPw()) ){
            this.userinfo.setId(userinfo.getId());
            this.userinfo.setLevel("3");
            this.userinfo.setAge("30");
            this.userinfo.setName("KJW");
            this.userinfo.setScore("215065");
            this.userinfo.setSex("M");
            
            return "success";
        } else {
            return "fail";
        }
    }
}
