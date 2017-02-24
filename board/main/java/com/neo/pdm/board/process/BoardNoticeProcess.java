package com.neo.pdm.board.process;

import java.util.ArrayList;
import java.util.List;

import com.neo.pdm.board.model.NoticeInfo;
import com.neo.pdm.core.BaseAccessManager;
import com.neo.pdm.core.model.DefaultUserInfo;

public class BoardNoticeProcess extends BaseAccessManager {
    
    public BoardNoticeProcess(DefaultUserInfo userinfo){
        super(userinfo);
    }
    
    public List<NoticeInfo> selectNoticeList(){
        List<NoticeInfo> list = new ArrayList<NoticeInfo>();
        list.add(new NoticeInfo());
        list.add(new NoticeInfo());
        list.add(new NoticeInfo());
        list.add(new NoticeInfo());
        
        return list;
    }
}
