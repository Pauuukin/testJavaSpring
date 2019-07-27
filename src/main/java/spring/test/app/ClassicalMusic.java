package spring.test.app;

import org.springframework.stereotype.Component;

// аннотация Component позволяет внедрять бины без xml
@Component
public class ClassicalMusic implements Music{

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
