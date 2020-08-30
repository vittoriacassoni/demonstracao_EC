package classes;

public class Blogger extends Person {
    public Blogger(String name, Integer age){
        super(name, age);
    }

    @Override
    public void answerHello(Person anotherPerson){
        System.out.println(this.getName() + ": Oi " + anotherPerson.getName() + " turo bom?? ");
    }

    @Override
    public void introduceYourself(){
        System.out.println(this.getName() + ": Oiii meninas turo bom? " +
                                            "me chamo " + this.getName() + " e tenho "
                                            + this.getAge() + " aninhos. Me sigam nas redes sociais @blogueirinha! #RumoAos30K");
    }
}
