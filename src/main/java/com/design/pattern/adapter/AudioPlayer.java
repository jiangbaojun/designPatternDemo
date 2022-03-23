package com.design.pattern.adapter;

import com.design.pattern.adapter.basic.MediaPlayer;

/**
 * 初级播放器的再次实现，也就是适配好了的播放器。
 * 因为拥有一个高级播放器的适配器属性，即使是“AudioPlayer”，也拥有了播放视频（MP4、vlc）的功能
 * @author jiangbaojun
 * @date 2021/1/15 10:45
 * @version v1.0
 */
public class AudioPlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 
 
   @Override
   public void play(String audioType, String fileName) {    
 
      //播放 mp3 音乐文件的内置支持
      if(audioType.equalsIgnoreCase("mp3")){
         System.out.println("Playing mp3 file. Name: "+ fileName);         
      } 
      //mediaAdapter 提供了播放其他文件格式的支持
      else if(audioType.equalsIgnoreCase("vlc") 
         || audioType.equalsIgnoreCase("mp4")){
         mediaAdapter = new MediaAdapter(audioType);
         mediaAdapter.play(audioType, fileName);
      }
      else{
         System.out.println("Invalid media. "+
            audioType + " format not supported");
      }
   }   
}