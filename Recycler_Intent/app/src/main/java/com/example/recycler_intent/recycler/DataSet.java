package com.example.recycler_intent.recycler;

import com.example.recycler_intent.R;
import java.util.ArrayList;
import java.util.List;

public class DataSet {
    public static List<msg_item> getData() {
        List<msg_item> result = new ArrayList();
        result.add(new msg_item("青春环游记", "第4期 贾玲丁禹兮重演陈芊芊", "16:27", R.drawable.huanyou));
        result.add(new msg_item("贾玲", "上火的陈芊芊[图片]", "17:28", R.drawable.jialing));
        result.add(new msg_item("杨迪", "我没有偷题！", "9:15", R.drawable.yangdi));
        result.add(new msg_item("郎朗", "媳妇真可爱", "10:45", R.drawable.langlang));
        result.add(new msg_item("范丞丞", "大白鹅就是我[直播]", "10:26", R.drawable.fcc));
        result.add(new msg_item("周深", "转发[视频]一起来唱达拉崩吧", "15:36", R.drawable.zhoushen));
        result.add(new msg_item("吉娜","什么玩意儿！", "10:40", R.drawable.jina));
        result.add(new msg_item("丁禹兮", "第一次上综艺好紧张", "11:51", R.drawable.dyx));
        result.add(new msg_item("沙溢", "我在隔壁录跑男", "20:57", R.drawable.shayi));
        result.add(new msg_item("沈腾", "我在隔壁录王牌", "19:18", R.drawable.shenteng));
        result.add(new msg_item("陌生人", "[Hi]", "12:04", R.drawable.ic_launcher_foreground));
        return result;
    }
}
