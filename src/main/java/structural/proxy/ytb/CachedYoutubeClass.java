/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structural.proxy.ytb;

/**
 *
 * @author tongcongminh
 */
// To save some bandwidth, we can cache request results and keep
// them for some time. But it may be impossible to put such code
// directly into the service class. For example, it could have
// been provided as part of a third party library and/or defined
// as `final`. That's why we put the caching code into a new
// proxy class which implements the same interface as the
// service class. It delegates to the service object only when
// the real requests have to be sent.
public class CachedYoutubeClass implements ThirdPartyYoutubeLib {

    private ThirdPartyYoutubeLib service;
    private String listCache;
    private String videoCache;
    boolean needReset;
    boolean downloadExists;

    public CachedYoutubeClass(ThirdPartyYoutubeLib service) {
        this.service = service;
    }

    @Override
    public String listVideo() {
        if(listCache==null || needReset){
            listCache=service.listVideo();
        }
        return listCache;
    }

    @Override
    public String getVideoInfor(String id) {
        if(videoCache == null || needReset){
            videoCache = service.getVideoInfor(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(String id) {
        if(!downloadExists || needReset){
            service.downloadVideo(id);
        }
    }

}
