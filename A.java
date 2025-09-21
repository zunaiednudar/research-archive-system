package research-archive-system;

// Factory Design Pattern
// interface ResearchPaper {
//     public void view();
// }

public class A implements ResearchPaper{
    @Override
    public void view() {
        System.out.println("Loading the PDF...");
    }
}
