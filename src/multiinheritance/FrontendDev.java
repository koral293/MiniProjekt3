package multiinheritance;

import java.util.List;

public class FrontendDev implements IDesigner {

    private int yearsOfExperience;
    private List<String> developedWebistes;

    public FrontendDev(int yearsOfExperience, List<String> developedWebistes) {
        this.yearsOfExperience = yearsOfExperience;
        this.developedWebistes = developedWebistes;
    }

    @Override
    public void portfolioPreview() {
        System.out.printf("Years of experience: %s%n", yearsOfExperience);
        for (String website : developedWebistes) {
            System.out.printf("Website: %s%n", website);
        }
    }
}
