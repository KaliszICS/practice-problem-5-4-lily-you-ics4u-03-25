public class VideoPlayer implements Player{
    private boolean onOff;
    private String video;
    private int currentTime;
    private int volume;

    public VideoPlayer(String word){
        this.video = word;
        this.volume = 0;
        this.onOff = false;
        this.currentTime = 0;
    }

    @Override
    public void start(){
        if(!onOff){
            this.onOff = true;
        }
    }

    @Override
    public void stop(){
        if(onOff){
            this.onOff = false;
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume += 5;
    }

    @Override
    public void volumeDown(){
        this.volume -= 5;
    }

    public int getVolume(){
        return this.volume;
    }

    public void fastForward(){
        this.currentTime += 5;
    }

    public void rewind(){
        this.currentTime -= 5;
    }

    public int getCurrentTime(){
        return this.currentTime;
    }

    public String getVideo(){
        return this.video;
    }

    public void setVideo(String video){
        this.video = video;
    }
}
