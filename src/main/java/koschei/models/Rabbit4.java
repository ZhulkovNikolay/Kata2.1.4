package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {
    //Связь через сеттер

    private Duck5 duck;

    @Autowired
    public void setDuck(Duck5 duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck.toString();
    }
}
