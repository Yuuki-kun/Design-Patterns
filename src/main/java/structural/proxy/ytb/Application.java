/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy.ytb;

/**
 *
 * @author tongcongminh
 */
public class Application {
    public static void main(String[] args) {
        ThirdPartyYoutubeClass aYouTubeService = new ThirdPartyYoutubeClass();
        CachedYoutubeClass aYouTubeProxy = new CachedYoutubeClass(aYouTubeService);
        
        YouTubeManager ytm = new YouTubeManager(aYouTubeProxy);
        ytm.reactOnUserInput();
    }
}
