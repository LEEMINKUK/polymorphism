package ohgiraffers.no1;

public class Application01 {

    public static void main(String[] args) {


// 클래스 설정(Person(1)   Teacher(1)   Student(1)   Employee(1))
//
// Person 을 Student, Teacher 가 상속 받게 설정.

// Person
// 1.말을 한다.
// 2.공부를 한다.
// 3.밥을 먹는다. (아침,점심,저녁)
// 4.혼자 노래를 한다.
// 5.춤을 춘다.
// 6.담배를 핀다.
// 7.잠을 잔다.
// 8.출근을 한다.
// 9.퇴근을 한다.

//  Student 1
// 1.질문을 한다.
// 2.강의를 듣는다.
// 3.학원에서 밥을 먹는다. (점심)
// 4.멍하게 강사님의 노래를 듣는다.
// 5.경악 하며 강사님의 춤을 구경한다.
// 6.쪼로록 강사님께 이끌려 담배를 핀다.
// 7.학원에서 대놓고 잠을 잔다.
// 8.학원으로 등원을 한다.
// 9. 매우 평범 하게 집으로 향한다.

// 10. 강사님께 호되게 맞는다. (아프다)
// 11. 질 수 없다 같이 술을 마신다.
// 12. 조퇴를 한다.

//  Teacher 1
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
        System.out.println("===============================");

        Person1 person1 = new Person1();
        person1.eat();
        person1.dance();
        person1.sing();
        person1.sleep();
        person1.smoke();
        person1.speak();
        person1.study();
        person1.goToWork();
        person1.goToHome();
        System.out.println();


        Student1 student1 = new Student1();
        student1.eat();
        student1.dance();
        student1.sing();
        student1.sleep();
        student1.smoke();
        student1.speak();
        student1.study();
        student1.goToWork();
        student1.goToHome();
        System.out.println("---------------------------------");
        student1.drink();
        student1.hit();
        student1.leaveEarly();
        System.out.println("=================================");


        Teacher1 teacher1 = new Teacher1();
        teacher1.eat();
        teacher1.dance();
        teacher1.sing();
        teacher1.sleep();
        teacher1.smoke();
        teacher1.speak();
        teacher1.study();
        teacher1.goToWork();
        teacher1.goToHome();
        System.out.println("-------------------------------------");
        teacher1.drink();
        teacher1.hit();
        System.out.println("===================================");



        System.out.println("============= 동적 바인딩  ===============");

        Person1 person2 = new Person1();
        person2.eat();
        person2.dance();
        person2.sing();
        person2.sleep();
        person2.smoke();
        person2.speak();
        person2.study();
        person2.goToWork();
        person2.goToHome();
        System.out.println();


        Person1 student2 = new Student1();
        student2.eat();
        student2.dance();
        student2.sing();
        student2.sleep();
        student2.smoke();
        student2.speak();
        student2.study();
        student2.goToWork();
        student2.goToHome();
        System.out.println("--------------클래스 형변환 -------------------");
        ((Student1)student2).drink();
        ((Student1)student2).hit();
        ((Student1)student2).leaveEarly();
        System.out.println("=================================");


        Person1 teacher2 = new Teacher1();
        teacher2.eat();
        teacher2.dance();
        teacher2.sing();
        teacher2.sleep();
        teacher2.smoke();
        teacher2.speak();
        teacher2.study();
        teacher2.goToWork();
        teacher2.goToHome();
        System.out.println("------------------ 클래스 형변환 ------------------");
        ((Teacher1)teacher2).drink();
        ((Teacher1)teacher2).hit();
        System.out.println("===================================");





    }
}
