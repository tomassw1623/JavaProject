package quiz;

public class Quiz_240313_Tv {
	
	/*
	 TV클래스 만들기...
	- 채널 클래스의 기본 생성시 채널과 볼륨은 채널 7, 볼륨 20
	- 최대 볼륨은 100. 최소 볼륨은 0, 채널의 최대 채널 300, 채널의 최고 1
	- 이전 채얼이 동작시 저장되어 있던 이전 채널로 이동
	- 채널 이동은 채널 정보를 입력받아서 채널 이동
	- 채널 이동 및 볼륨 조절은 전원 On인 상태에서 동작합니다.
	
	- 속성(맴버 변수): 채널, 볼륨, 전원, 이전채널
	- 기능: 전원On/Off, 볼륨 UP/DOUN, 채널 UP/DOUN, 이전 채널이동, 채널이동, 
	  TV현재 정보 확인(전원, 채너르 볼륨, 저장된 이전채널)
	 */

    public static void main(String[] args) {
//        Tv myTv = new Tv();
//        myTv.turnOn();
//        myTv.setChannel(10);
//        myTv.setVolume(30);
//        myTv.previousChannel();
//        myTv.channelDown();
//        myTv.volumeDown();
//        myTv.displayInfo();
//    }
//}
//
//class Tv {
//    static final int MAX_CHANNEL = 300;
//    static final int MAX_VOLUME = 100;
//    static final int MIN_VOLUME = 0;
//
//    // 맴버 변수 (속성)
//    int channel;
//    int volume;
//    boolean power;
//    int previousChannel;
//
//    // 생성자
//    public Tv() {
//        channel = 7;
//        volume = 20;
//        power = false;
//        previousChannel = channel;
//    }
//
//    // 메서드
//    public void turnOn() { // Tv on
//        power = true;
//    }
//
//    public void turnOff() {	// tv off
//        power = false;
//    }
//
//    public void setChannel(int newChannel) {
//        if (power && newChannel >= 1 && newChannel <= MAX_CHANNEL) {
//            previousChannel = channel;
//            channel = newChannel;
//        }
//    }
//
//    public void channelUp() {
//        if (power && channel < MAX_CHANNEL) {
//            previousChannel = channel;
//            channel++;
//        }
//    }
//
//    public void channelDown() {
//        if (power && channel > 1) {
//            previousChannel = channel;
//            channel--;
//        }
//    }
//
//    public void setVolume(int newVolume) {
//        if (power && newVolume >= MIN_VOLUME && newVolume <= MAX_VOLUME) {
//            volume = newVolume;
//        }
//    }
//
//    public void volumeUp() {
//        if (power && volume < MAX_VOLUME) {
//            volume++;
//        }
//    }
//
//    public void volumeDown() {
//        if (power && volume > MIN_VOLUME) {
//            volume--;
//        }
//    }
//
//    public void previousChannel() {
//        if (power) {
//            int temp = channel;
//            channel = previousChannel;
//            previousChannel = temp;
//        }
//    }
//
//    public void displayInfo() {
//        System.out.println("전원: " + (power ? "켜짐" : "꺼짐"));
//        System.out.println("채널: " + channel);
//        System.out.println("볼륨: " + volume);
//        System.out.println("이전 채널: " + previousChannel);
//    }
//}

    	
    	// 선생님 답안============================================================================================
    }
}

class Tv{
	// Tv 클래스 맴버 변수
	static final int MAX = 100;
	
	// 필드, 속성, 매개변수
	public int channel = 7;
	public int volume = 20;
	public boolean isPowerOn;
	public int before;
	
	
}