/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy.ytb;

/**
 *
 * @author tongcongminh
 */
public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib{

    @Override
    public String listVideo() {
        //send an API request to youtube
        return ("ThirdPartyYoutubeClass listVideo");
    }

    @Override
    public String getVideoInfor(String id) {
        //get meta data about some video
        return "ThirdPartyYoutubeClass return video information";
    }

    @Override
    public void downloadVideo(String id) {
        //download a video file from ytb
        System.out.println("ThirdPartyYoutubeClass download video");
    }
    
}
