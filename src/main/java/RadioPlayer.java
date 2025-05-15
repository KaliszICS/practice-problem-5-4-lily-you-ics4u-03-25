public class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;

    public RadioPlayer(double[] list){
        this.stationList = list;
        this.volume = 0;
        this.onOff = false;
        this.station = 0;
    }

    @Override
    public void start(){
        if(!onOff){
            this.onOff = true;
            this.station = stationList[0];
        }
    }

    @Override
    public void stop(){
        if(onOff){
            this.onOff = false;
            this.station = 0;
        }

    }

    @Override
    public boolean getOnOff(){
        return this.onOff;
    }

    @Override
    public void volumeUp(){
        this.volume += 2;
    }

    @Override
    public void volumeDown(){
        this.volume -= 2;
    }

    @Override
    public int getVolume(){
        return this.volume;
    }

    int index = 0;
    public void next(){
        for(int i = stationList.length - 1; i > 0; i++){
            if(stationList[i] == (this.station)){
                index = i;
            }
        }
        this.station = stationList[index+1];
    }

    public void previous(){
        for(int i = stationList.length - 1; i > 0; i++){
            if(stationList[i] == (this.station)){
                index = i;
            }
        }
        this.station = stationList[index-1];
    }

    public double getStation(){
        return this.station;
    }
}