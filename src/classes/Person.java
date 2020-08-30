package classes;

public class Person {
    private String name;
    private Integer age;
    private Boolean isSad;

    public  Person (String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getIsSad() {
        return isSad;
    }

    public void setIsSad(Boolean isSad) {
        this.isSad = isSad;
    }

    public void sayHello(Person anotherPerson){
        System.out.println(this.name + ": Oi, " + anotherPerson.getName());
        anotherPerson.answerHello(this);
    }

    public void answerHello(Person anotherPerson){
        System.out.println(this.name + ": Oi, " +anotherPerson.getName());
    }

    public void introduceYourself(){
        System.out.println(this.name + ": Meu nome é " + this.name + " e tenho " + this.getAge() + " anos");
    }

    public void lie(Person targetPerson){
        targetPerson.setIsSad(true);
        System.out.println(this.name + " mentiu para " + targetPerson.getName());
        System.out.println(targetPerson.name + " esta triste ");
    }

}
