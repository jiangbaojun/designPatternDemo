package com.design.pattern.adapter;

import com.design.pattern.adapter.basic.AdvancedMediaPlayer;
import com.design.pattern.adapter.basic.MediaPlayer;
import com.design.pattern.adapter.basic.impl.Mp4Player;
import com.design.pattern.adapter.basic.impl.VlcPlayer;

/**
 * 适配器
 * 实现原始的初级播放器接口，实现play功能（方法）。
 * 含有一个高级播放器属性，通过高级播放器的实现类，根据类型，扩展play方法
 * 相当于读卡器，在电脑和内存卡之间，起到适配作用
 * @author jiangbaojun
 * @date 2021/1/15 10:39
 * @version v1.0
 */
public class MediaAdapter implements MediaPlayer {
 
   AdvancedMediaPlayer advancedMusicPlayer;
 
   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }  
   }
 
   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}