package multiinheritance;

import java.util.List;

public class FullstackDev extends Developer implements IDesigner {

    private List<String> developedWebistes;
    private List<String> projects;

    public FullstackDev(List<String> developedWebsites, List<String> backendProjects) {
        this.developedWebistes = developedWebsites;
        this.projects = backendProjects;
    }

    @Override
    public void portfolioPreview() {
        System.out.println("Designer experience:");
        for (String website : developedWebistes) {
            System.out.printf("Website: %s%n", website);
        }
        System.out.println("Backend experience:");
        for (String project : projects) {
            System.out.printf("Project: %s%n", project);
        }
    }

}
