package example01;

public class TVCR extends Tv{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void re() {
		vcr.rew();
	}
	public static void main(String[] args) {
		TVCR tvcr = new TVCR();
		tvcr.power();
		tvcr.channelDown();
		tvcr.channelUp();
		tvcr.play();
	}
}

class VCR{
	boolean power;
	int counter = 0;
	void power() {
		power = !power;
	}
	void play() {}
	void stop() {}
	void rew() {}
	void ff() {}
}
