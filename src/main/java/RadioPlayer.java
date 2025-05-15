public class RadioPlayer implements Player{
    private boolean onOff;
    private double[] stationList;
    private int volume;
    private double station;
    int index = 0;

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
            index = 0;

        }
    }

    @Override
    public void stop(){
        if(onOff){
            this.onOff = false;
            this.station = 0;
        }

    }

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

    
    public void next(){
        index++;
        this.station = stationList[index];
    }

    public void previous(){
        index--;
        this.station = stationList[index];
    }

    public double getStation(){
        return this.station;
    }
}