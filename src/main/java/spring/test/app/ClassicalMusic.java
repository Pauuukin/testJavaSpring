package spring.test.app;

public class ClassicalMusic implements Music{
    //запрещаем вручную создавать объекты класса,
    // чтобы реализовать factory-method
    private ClassicalMusic (){}
    // factory method
    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    // инициализация бина
    public void doMyInit(){
        System.out.println("Doing my initializatin");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }



    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
