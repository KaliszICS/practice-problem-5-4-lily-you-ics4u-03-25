public class MusicPlayer implements Player{
    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume;

    int index = 0;

    public MusicPlayer(String[] list){
        this.musicList = list;
        this.volume = 0;
        this.onOff = false;
        this.currentSong = "";
    }

    @Override
    public void start(){
        if(!this.onOff){
            this.onOff = true;
            this.currentSong = musicList[0];
            index = 0;
        }
    }

    @Override
    public void stop(){
        if(this.onOff){
            this.onOff = false;
            this.currentSong = "";
        }
    }

    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume += 1;
    }

    @Override 
    public void volumeDown(){
        this.volume -= 1;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    public void next(){
        index++;
        this.currentSong = musicList[index];
    }

    public void previous(){
        index--;
        this.currentSong = musicList[index];
    }

    public String getCurrentSong(){
        return this.currentSong;
    }
}