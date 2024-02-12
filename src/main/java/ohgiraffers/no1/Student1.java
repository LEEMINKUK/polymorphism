package ohgiraffers.no1;

public class Student1 extends Person1 {
// 1.질문을 한다.
// 2.강의를 듣는다.
// 3.학원에서 밥을 먹는다. (점심)
// 4.멍하게 강사님의 노래를 듣는다.
// 5.경악 했지만? 강사님과 같이 춤을 춥니다.
// 6.쪼로록 강사님께 이끌려 담배를 핀다.
// 7.학원에서 대놓고 잠을 잔다.
// 8.학원으로 등원을 한다.
// 9. 매우 평범 하게 집으로 향한다.

// 10. 강사님께 호되게 맞는다. (아프다)
// 11. 질 수 없다 같이 술을 마신다.
// 12. 조퇴를 한다.
    @Override
    public void speak() {
        System.out.println("xx 학생이 질문 : 오버라이딩 어떡해 하나요?");
    }

    @Override
    public void study() {
        System.out.println("xx 학생이 수업을 듣습니다 : JAVA 코딩 공부중");
    }

    @Override
    public void eat() {
        System.out.println("xx 학생이 도시락을 깝니다~");
    }

    @Override
    public void sing() {
            System.out.println("xx 학생 : 멍하니 강사님의 노래를 듣습니다.");
    }
    @Override
    public void dance() {
        System.out.println("xx 학생이 날뛰는 중입니다. (쿼드라 킬)");
    }

    @Override
    public void smoke() {
        System.out.println("xx 학생이 강사님께 이끌려 내려가 담배를 꺼내 듭니다.");
    }

    @Override
    public void sleep() {
        System.out.println("xx 학생이 대놓고 잠을 잡니다. ");
    }

    @Override
    public void goToWork() {
        System.out.println("xx 학생이 등원 합니다 ");
    }

    @Override
    public void goToHome() {
        System.out.println("xx 학생이 매우 평범하게 하원 합니다.");
    }

    public void hit() {
        System.out.println("xx 학생이 강사님께 후드려 맞습니다. ");
    }

    public void drink() {
        System.out.println("xx 학생이 수업도중 몰래 챙겨온 맥주를 마십니다.");
    }

    public void leaveEarly() {
        System.out.println("xx 학생이 취해서 조퇴를 합니다.");
    }

}
