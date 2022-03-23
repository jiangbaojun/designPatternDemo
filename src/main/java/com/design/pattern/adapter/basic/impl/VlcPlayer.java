package com.design.pattern.adapter.basic.impl;

import com.design.pattern.adapter.basic.AdvancedMediaPlayer;

/**
 * 高级播放器-vlc实现
 * @author jiangbaojun
 * @date 2021/1/15 10:39
 * @version v1.0
 */
public class VlcPlayer implements AdvancedMediaPlayer {
   @Override
   public void playVlc(String fileName) {
      System.out.println("Playing vlc file. Name: "+ fileName);      
   }
 
   @Override
   public void playMp4(String fileName) {
      //什么也不做
   }
}
