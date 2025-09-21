interface ResearchPaper {
    public void view();
}

public class FullResearchPaper implements ResearchPaper {
    private FullResearchPaper() {
        this.view();
    }
    @Override
    public void view() {
        System.out.println("Loading the PDF...");
    }
}
