package com.neo.pdm.board.process;

import java.util.ArrayList;
import java.util.List;

import com.neo.pdm.board.model.DiscussionInfo;
import com.neo.pdm.core.BaseAccessManager;
import com.neo.pdm.core.model.DefaultUserInfo;

public class BoardDiscussionProcess extends BaseAccessManager {
    
    public BoardDiscussionProcess(DefaultUserInfo userinfo){
        super(userinfo);
    }

    public List<DiscussionInfo> selectDiscussionList(){
        
        List<DiscussionInfo> discussionList = new ArrayList<DiscussionInfo>();
        DiscussionInfo discussionInfo = new DiscussionInfo();
        discussionInfo.setId("KJW");
        discussionInfo.setDocumentTitle("KJW = DOCUMENT");
        discussionInfo.setViewCnt("23,000");
        discussionInfo.setInputDt("2017.10.20");
        discussionList.add(discussionInfo);
        
        discussionInfo = new DiscussionInfo();
        discussionInfo.setId("JIN WON");
        discussionInfo.setDocumentTitle("=== DOCUMENT ===");
        discussionInfo.setViewCnt("3,111");
        discussionInfo.setInputDt("2017.01.20");
        discussionList.add(discussionInfo);
        
        discussionInfo = new DiscussionInfo();
        discussionInfo.setId("김진원");
        discussionInfo.setDocumentTitle("김진원 = DOCUMENT");
        discussionInfo.setViewCnt("23,000");
        discussionInfo.setInputDt("2017.10.20");
        discussionList.add(discussionInfo);
        
        discussionInfo = new DiscussionInfo();
        discussionInfo.setId("이재인");
        discussionInfo.setDocumentTitle("이재인 = DOCUMENT");
        discussionInfo.setViewCnt("23,000");
        discussionInfo.setInputDt("2017.10.20");
        discussionList.add(discussionInfo);
        
        discussionInfo = new DiscussionInfo();
        discussionInfo.setId("마일럽");
        discussionInfo.setDocumentTitle("마일럽~~~~~~~~~~~~~~~~");
        discussionInfo.setViewCnt("23,000");
        discussionInfo.setInputDt("2017.10.20");
        discussionList.add(discussionInfo);
        
        return discussionList;
    }
}
