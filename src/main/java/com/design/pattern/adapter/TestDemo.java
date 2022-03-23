package com.design.pattern.adapter;

/**
 * 适配器模式
 * 作为两个不兼容的接口之间的桥梁。它结合了两个独立接口的功能。
 * 使用场景：有动机地修改一个正常运行的系统的接口，这时应该考虑使用适配器模式。
 * 注意事项：适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
 * @author jiangbaojun
 * @date 2021/1/15 10:50
 * @version v1.0
 */
public class TestDemo {
   public static void main(String[] args) {
      AudioPlayer audioPlayer = new AudioPlayer();
 
      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}