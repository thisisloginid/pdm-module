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
        
        NoticeInfo noticeInfo = new NoticeInfo();
        noticeInfo.setSeq("112");
        noticeInfo.setId("김진원");
        noticeInfo.setTitle("신규오픈 기념행사");
        noticeInfo.setViewCnt("110");
        noticeInfo.setInputDt("2017.01.01");
        list.add(noticeInfo);
        
        noticeInfo = new NoticeInfo();
        noticeInfo.setSeq("113");
        noticeInfo.setId("김진원");
        noticeInfo.setTitle("긴급공지");
        noticeInfo.setViewCnt("110");
        noticeInfo.setInputDt("2017.01.01");
        list.add(noticeInfo);
        
        noticeInfo = new NoticeInfo();
        noticeInfo.setSeq("114");
        noticeInfo.setId("김진원");
        noticeInfo.setTitle("새월호 관련 공지");
        noticeInfo.setViewCnt("110");
        noticeInfo.setInputDt("2017.01.01");
        list.add(noticeInfo);
        
        noticeInfo = new NoticeInfo();
        noticeInfo.setSeq("115");
        noticeInfo.setId("김진원");
        noticeInfo.setTitle("신규 가입 안내 공지");
        noticeInfo.setViewCnt("110");
        noticeInfo.setInputDt("2017.01.01");
        list.add(noticeInfo);
        
        return list;
    }
    
    
    public NoticeInfo selectNoticeDetail(String seq){
        NoticeInfo noticeInfo = new NoticeInfo();
        noticeInfo.setSeq(seq);
        noticeInfo.setId("김진원");
        noticeInfo.setTitle("신규오픈 기념행사");
        noticeInfo.setViewCnt("110");
        noticeInfo.setInputDt("2017.01.01");
        noticeInfo.setId("김진원");
        noticeInfo.setTitle("신규오픈 기념행사");
        noticeInfo.setNote("신규오픈 기념행사\n신규오픈 기념행사\n신규오픈 기념행사\n신규오픈 기념행사\n신규오픈 기념행사\n신규오픈 기념행사\n신규오픈 기념행사\n");
        noticeInfo.setViewCnt("21,100");
        noticeInfo.setAttachFileName(null);
        noticeInfo.setAttachFile(null);
        noticeInfo.setStartDate("2016.01.01");
        noticeInfo.setEndDate("2999.12.31");
        noticeInfo.setUseYn("Y");
        noticeInfo.setInputDt("2017.01.01");
        noticeInfo.setInputTm("23:11:10");
        noticeInfo.setUpdateDt("2017.01.08");
        noticeInfo.setUpdateTm("07:01:29");

        return noticeInfo;
    }
    
    
    public String insertNotice(NoticeInfo noticeInfo){
        noticeInfo.setSeq("999");
        noticeInfo.setViewCnt("1");
        noticeInfo.setInputDt("2017.01.01");
        noticeInfo.setAttachFileName(null);
        noticeInfo.setAttachFile(null);
        noticeInfo.setUseYn("Y");
        noticeInfo.setInputDt("2017.01.01");
        noticeInfo.setInputTm("23:11:10");
        noticeInfo.setUpdateDt("2017.01.08");
        noticeInfo.setUpdateTm("07:01:29");

        return noticeInfo.getSeq();
    }
}
