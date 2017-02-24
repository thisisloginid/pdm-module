package com.neo.pdm.common.process.dao;

import java.util.ArrayList;
import java.util.List;

import com.neo.pdm.board.model.NoticeInfo;

public class CommonBaseDao {
    
    public List<NoticeInfo> getNoticeList() throws Exception{
        List<NoticeInfo> list = new ArrayList<NoticeInfo>();
        
        for( int i=0; i<10; i++ ){
            list.add(new NoticeInfo());
        }
        
        return list;
    }
}
