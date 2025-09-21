// package research-archive-system;
import java.util.ArrayList;
interface ResearchPaper {
    public void view();
}

// Factory Design Pattern
class FullResearchPaper implements ResearchPaper {
    String filename;
    public FullResearchPaper(String filename) {
        this.filename = filename;
        this.view();
    }
    @Override
    public void view() {
        System.out.println("Loading the PDF from FullResearchPaper...  " + this.filename);
    }
}

class A implements ResearchPaper{
    String filename;
    public A(String filename) {
        this.filename = filename;
    }
    @Override
    public void view() {
        System.out.println("Loading the PDF from A... " + this.filename);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<ResearchPaper> paperList = new ArrayList<>();
        ResearchPaper r1 = new FullResearchPaper("paper-01.txt");
        ResearchPaper r2 = new FullResearchPaper("paper-02.txt");
        ResearchPaper r3 = new FullResearchPaper("paper-03.txt");
        ResearchPaper r4 = new FullResearchPaper("paper-04.txt");
        ResearchPaper r5 = new A("paper-05.txt");
        ResearchPaper r6 = new A("paper-06.txt");
        ResearchPaper r7 = new A("paper-07.txt");
        ResearchPaper r8 = new A("paper-08.txt");

        paperList.add(r1);
        paperList.add(r2);
        paperList.add(r3);
        paperList.add(r4);
        paperList.add(r5);
        paperList.add(r6);
        paperList.add(r7);
        paperList.add(r8);

        System.out.println("\n");

        for (ResearchPaper paper : paperList) {
            paper.view();
        }
    }
}
