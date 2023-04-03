/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy.ytb;

/**
 *
 * @author tongcongminh
 */
public interface ThirdPartyYoutubeLib {
    public String listVideo();
    public String getVideoInfor(String id);
    public void downloadVideo(String id);
}
