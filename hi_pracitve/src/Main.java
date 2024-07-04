public class Main {
    public static void main(String[] args) {

        Person jobs=new Person("잡스","애플폰");

        Person jaeyoung=new Person("재용","삼송폰");

        Apple apple= new Apple();
        Samsung samsung=new Samsung();


        System.out.println(jobs.getName()+"님이 "+jobs.getMobile_brand()+"을 구매했습니다.");
        System.out.println(jobs.getName()+"님이 "+jobs.getMobile_brand()+"을 켰습니다.");
        System.out.println("@@@"+apple.getturnon()+"@@@");
        System.out.println(" ");
        System.out.println(jaeyoung.getName()+"님이 "+jaeyoung.getMobile_brand()+"을 구매했습니다.");
        System.out.println(jaeyoung.getName()+"님이 "+jaeyoung.getMobile_brand()+"을 켰습니다.");
        System.out.println("@@@"+samsung.getturnon()+"@@@");
    }
}