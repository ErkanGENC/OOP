package ders13;

public class Time {
    private int hour;
    private int minute;
    private int second;

  public Time(int hour,int minute,int second){

     setHour(hour);
     setMinute(minute);
      setSecond(second);

  }

  void setHour(int hour){
      if(hour < 0 || hour >23)
          throw new IllegalArgumentException("hour must be in 0-23");
      this.hour = hour;
  }

  void setMinute(int minute){
      if(minute < 0 || minute >59)
          throw new IllegalArgumentException("hour must be in 0-59");
      this.minute = minute;
  }
  void setSecond(int second){
      if(second < 0 || second >59)
          throw new IllegalArgumentException("hour must be in 0-59");
      this.second = second;
  }

  public String run(){
      return String.format("%02d -%02d - %02d",this.hour,this.minute,this.second);
  }
}
