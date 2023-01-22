public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setFullName("Dmitry Gutsal");

        person.setAge(33);

        System.out.println(person.getFullName());
        System.out.println(person.getAge());

        Person person2 = new Person("Alex Kuznetsov", 31);

        person.talk();
        person2.talk();
    }
}