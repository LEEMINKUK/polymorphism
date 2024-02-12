package ohgiraffers.no1;

public class Teacher1 extends Person1 {
// 1. 강의를 한다.
// 2. 수업 준비를 한다.
// 3. 학원에서 밥을 먹는다 (점심)
// 4. 갑자기 노래를 하신다 (수업도중에)
// 5. 한술 더 떠서 춤도 추신다. (...)
// 6. 학생들을 이끌고 담배를 핀다. (대장)
// 7. 학원에서 쪽잠을 잔다.
// 8. 학원으로 출근을 한다.
// 9. 누구보다 빠르게 남들과는 다르게 집으로 향한다.

    // 10. 학생을 몹시 때린다.(큰일이다)
// 11. 수업 도중 술을 마신다. (이것도 큰일 이다)
    @Override
    public void speak() {
        System.out.println("묵시적 형변환~ 명시적 형변환~ 여기까지 이해 되세요?");
    }

    @Override
    public void study() {
        System.out.println("강사님이 아침부터 강의를 준비합니다.");
    }

    @Override
    public void eat() {
        System.out.println("강사님이 점심을 먹으러 갑니다.");
    }

    @Override
    public void sing() {
        System.out.println("강사님 : 거친 세상 속에도~! 젖은 지붕 밑에도~오~~!");
    }

    @Override
    public void dance() {
        System.out.println("강사님이 갑자기 춤을 춥니다.");
    }

    @Override
    public void smoke() {
        System.out.println("강사님이 모두를 이끌고 흡연을 합니다.");
    }

    @Override
    public void sleep() {
        System.out.println("강사님이 쪽잠을 잡니다.");
    }

    @Override
    public void goToWork() {
        System.out.println("강사님이 아침 일찍부터 출근을 합니다.");
    }

    @Override
    public void goToHome() {
        System.out.println("강사님이 누구보다 빠르게 남들과는 다른 퇴근을 합니다.");
    }

    public void hit() {
        System.out.println("강사님이 xx학생을 아프게 때립니다. ");
    }

    public void drink() {
        System.out.println("강사님이 수업 도중 숨겨둔 소주를 마십니다.");
    }
}



