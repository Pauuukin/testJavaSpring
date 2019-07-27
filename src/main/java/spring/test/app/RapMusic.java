package spring.test.app;

public class RapMusic implements Music {

    @Override
    public String getSong(){
        return "Rap God";
    }

    public void doMyInit(){
        System.out.println("Doing my initializatin");
    }

    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }


}
