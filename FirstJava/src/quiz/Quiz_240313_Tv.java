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
	
//TV 테이트
		TV tv1 = new TV();
		
		tv1.getTvInfo();
		tv1.channelUP();
		tv1.powerOnOff();
		tv1.getTvInfo();
		tv1.channelUP();
		tv1.getTvInfo();
		tv1.moveChannel(20);
		tv1.moveChannel(999);
		tv1.channelDown();
		tv1.prevChannel();
		tv1.prevChannel();
		
		tv1.getTvInfo();

	}

}

class TV {
	// TV 클래스 멤버 변수
	int channel;
	int prevChannel;
	int volume;
	boolean isPowerOn;
	
	// TV 클래스의 상수(final)
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 300;
	final int MIN_CHANNEL = 1;
	
	// 기본 생성자... 
	public TV() {
		channel = 7;
		volume = 20;
	}
	
	// TV 기능... 
	// 전원 : isPowerOn 값이 true면, false, false면 true
	void powerOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	// # 볼륨업/다운, 채널업/다운(1씩 채널값 증감), 이전 채널이동(이전 채널 정보를 기준으로 이동)
	//  , 채널이동(입력된 채널로 이동), TV현재 정보 확인(전원, 채널, 볼륨, 저장된 이전채널)
	// # 정보확인 제외 모두 전원이 있어야 구동... 
	void volumeUp() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;  // void에서 리턴을 만나면 메서드 종료...
		}else if(volume == MAX_VOLUME){  // 볼륨이 최대이면 채널업 동작X 
			System.out.println("현재 볼륨이 최대입니다.");
			return;
		}
		
		volume ++;
		System.out.println("현재 볼륨은 " + volume + "입니다.");
	}
	
	void volumeDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;  // void에서 리턴을 만나면 메서드 종료...
		}else if(volume == MIN_VOLUME){  // 볼륨이 최대이면 채널업 동작X 
			System.out.println("현재 볼륨이 0입니다.");
			return;
		}
		
		volume --;
		System.out.println("현재 볼륨은 " + volume + "입니다.");
	}
	
	void channelUP() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		
		//이전 채널
		prevChannel = channel;
		
		if(channel == MAX_CHANNEL) {
			channel = MIN_CHANNEL;
		}else {
			channel ++;
		}
		
		System.out.println(channel + "CH");
		
	}
	
	void channelDown() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}
		
		//이전 채널
		prevChannel = channel;
		
		if(channel == MIN_CHANNEL) {
			channel = MAX_CHANNEL;
		}else {
			channel --;
		}
		
		System.out.println(channel + "CH");
		
	}
	
	boolean moveChannel(int ch) {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return false;
		}
		
		if(ch >= MIN_CHANNEL && ch <= MAX_CHANNEL) {
			prevChannel = channel;
			channel = ch;
			System.out.println(ch +  "CH");
			return true;
		}else {
			System.out.println("존재하지 않는 채널을 입력했습니다.");
			return false;
		}
		
	}
	
	void prevChannel() {
		if(!isPowerOn) {
			System.out.println("전원이 꺼져있습니다.");
			return;
		}else if(prevChannel == 0) {
			System.out.println("이전 채널이 없음");
			return;
		}
		
		int temp = channel;
		channel = prevChannel;
		prevChannel = temp;
		
		getTvInfo();  //TV현재 상태 정보 확인.... 
	}
	
	void getTvInfo() {
		System.out.println("전원 : "+isPowerOn);
		System.out.println("채널 : "+channel);
		System.out.println("볼륨 : "+volume);
		System.out.println("저장된 이전 채널 : "+prevChannel);
	}
	
	
}