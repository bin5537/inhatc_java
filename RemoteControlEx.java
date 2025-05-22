package week12;

public class RemoteControlEx {
    public static void main(String[] args) {
        //구현 클래스를 이용해서 구현 객체 생성
        Audio     audio = new Audio();
        TV         tv      = new TV();
        
        //생성된 구현객체를 이용해서 메소드 호출
        audio.turnOn();
        audio.setVolume(5);
        audio.setMute(true);
        audio.turnOff();
        
        System.out.println("---");
        
        tv.turnOn();
        tv.setVolume(15);
        tv.setMute(true);
        tv.turnOff();
        
        System.out.println("---");
        System.out.println("리모컨의 최대 볼륨 : " + RemoteControl.MAX_VALUE);
        System.out.println("리모컨의 최소 볼륨 : " + RemoteControl.MIN_VALUE);
    }
}