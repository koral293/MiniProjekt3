package multiinheritance;

import java.util.List;

public abstract class Developer {

    protected List<String> programmingStack;
    protected String favouriteIDE;

    public void greeting() {
        System.out.println("I am just normal developer");
    }

}
