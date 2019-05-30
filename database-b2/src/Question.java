public class Question {
    private int id;
    private String contens;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String corect;

    public Question() {
    }

    public Question(int id, String contens, String answerA, String answerB, String answerC, String answerD, String corect) {
        this.id = id;
        this.contens = contens;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
        this.corect = corect;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContens() {
        return contens;
    }

    public void setContens(String contens) {
        this.contens = contens;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getCorect() {
        return corect;
    }

    public void setCorect(String corect) {
        this.corect = corect;
    }

    @Override
    public String toString() {
        String question = "\n" + this.contens +
                "\n\tA. " + this.answerA +
                "\n\tB. " + this.answerB +
                "\n\tC. " + this.answerC +
                "\n\tD. " + this.answerD;

        return question;
    }

    public String answer(String answer) {
        String question = null;
        if (answer.equals(this.answerA)) {
            question = "\n" + this.contens +
                    "\n\t[A]. " + this.answerA +
                    "\n\tB. " + this.answerB +
                    "\n\tC. " + this.answerC +
                    "\n\tD. " + this.answerD;
        }
        if (answer.equals(this.answerB)) {
            question = "\n" + this.contens +
                    "\n\tA. " + this.answerA +
                    "\n\t[B]. " + this.answerB +
                    "\n\tC. " + this.answerC +
                    "\n\tD. " + this.answerD;
        }
        if (answer.equals(this.answerC)) {
            question = "\n" + this.contens +
                    "\n\tA. " + this.answerA +
                    "\n\tB. " + this.answerB +
                    "\n\t[C]. " + this.answerC +
                    "\n\tD. " + this.answerD;
        }
        if (answer.equals(this.answerD)) {
            question = "\n" + this.contens +
                    "\n\tA. " + this.answerA +
                    "\n\tB. " + this.answerB +
                    "\n\tC. " + this.answerC +
                    "\n\t[D]. " + this.answerD;
        }
        return question;
    }
}
