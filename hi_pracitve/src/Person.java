public class Person {

    private String name;

    private String mobile_brand;

    public Person(String name,String mobile_brand){
        this.name=name;
        this.mobile_brand=mobile_brand;
    }

    public String getName(){
        return this.name;
    }

    public String getMobile_brand(){
        return this.mobile_brand;
    }
}
