package multiinheritance;

import java.util.List;

public class BackendDev extends Developer {

    private boolean lowLevelDeveloper;

    public BackendDev(List<String> programmingStack, String favouriteIDE, boolean lowLevelDeveloper) {
        this.programmingStack = programmingStack;
        this.favouriteIDE = favouriteIDE;
        this.lowLevelDeveloper = lowLevelDeveloper;
    }

    @Override
    public void greeting() {
        System.out.println("I am backend developer!");
        System.out.printf("My favourite IDE is %s", favouriteIDE);
        if (lowLevelDeveloper) {
            System.out.println("I am low level programmer");
        } else {
            System.out.println("Iam not eligible to low level programming");
        }
    }

}
