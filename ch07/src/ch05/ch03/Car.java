package ch05.ch03;

//강한 결합
public class Car {
	HankookTire tire = new HankookTire();
	KumhoTire tire2 = new KumhoTire();
	HankookTire tire3 = new HankookTire();
	KumhoTire tire4 = new KumhoTire();
}

/*
 * class Tire {
 * 
 * }
 */

class HankookTire {

}

class KumhoTire {

}