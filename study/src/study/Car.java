package study;

// 자동차 클래스
class Car {
// 필드
	// 차량 번호
	int num;
	// 연료 양
	double gas;
}

// 자동차 클래스의 객체를 생성하기
class Sample1 {
	public static void main(String[] args) {
		// 객체 생성
		Car car1;
		car1 = new Car();
		
		// 멤버에 접근
		car1.num = 1234;
		car1.gas = 20.5;
		
		System.out.println("차량 번호는 " + car1.num + "입니다.");
		System.out.println("연료 양은 " + car1.gas + "입니다.");
		
		// 두 번째 객체
		Car car2 = new Car();
		car2.num = 2345;
		car2.gas = 30.5;
	}
}
