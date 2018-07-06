package com.hantangtouzi;

import org.springframework.stereotype.Component;

/**
 * @author WilliamChang.
 * created on 2018/7/6 0:55
 */

@Component
public class Mp3 implements Music {
    private String title = "她来听我的演唱会";

    private String singer = "张学友";

    public void play() {
        System.out.println("歌曲名称：" + title + ", 演唱者：" + singer);
    }
}
