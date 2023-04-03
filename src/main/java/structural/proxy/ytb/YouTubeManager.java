/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy.ytb;

/**
 *
 * @author tongcongminh
 */
public class YouTubeManager {
    private static ThirdPartyYoutubeLib service;

    public YouTubeManager(ThirdPartyYoutubeLib service) {
        this.service = service;
    }
    
    public void renderVideo(String id){
        String infor = service.getVideoInfor(id);
        System.out.println("render "+infor);
    }
    
    public void renderListPanel(){
        String list = service.listVideo();
        System.out.println("render "+list);
    }
    
    public void reactOnUserInput(){
        renderVideo("A");
        renderListPanel();
    }
    
}
