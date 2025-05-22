package week12;

public class TV implements RemoteControl {
    //인터페이스 기능을 사용(구현)하는 클래스 => 구현 클래스
    //구현클래스에서 인터페이스의 메소드를 반드시 재정의
    private int volume;
    
    @Override
    public void turnOn() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원을 켭니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VALUE) {
            volume = RemoteControl.MAX_VALUE;
        }else if(volume < RemoteControl.MIN_VALUE) {
            volume = RemoteControl.MIN_VALUE;
        }
        
        this.volume = volume;
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }
    
}