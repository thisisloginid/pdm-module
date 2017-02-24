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
        List<DiscussionInfo> list = new ArrayList<DiscussionInfo>();
        list.add(new DiscussionInfo());
        list.add(new DiscussionInfo());
        list.add(new DiscussionInfo());
        list.add(new DiscussionInfo());
        
        return list;
    }
}
