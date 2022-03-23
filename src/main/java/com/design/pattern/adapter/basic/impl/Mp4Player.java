package com.design.pattern.adapter.basic.impl;

import com.design.pattern.adapter.basic.AdvancedMediaPlayer;

/**
 * 高级播放器-MP4实现
 * @author jiangbaojun
 * @date 2021/1/15 10:39
 * @version v1.0
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}
