package com.design.pattern.adapter.basic;

/**
 * 高级播放器
 * @author jiangbaojun
 * @date 2021/1/15 10:30
 * @version v1.0
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
