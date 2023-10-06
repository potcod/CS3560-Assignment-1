//Question class will take student object and obtain random answers, store it in ABCD int types to later be displayed in VotingService


class Question implements QuestionInterface{
    private int questionType; // 1 is single choice, 2 is multiple choice
    private int A,B,C,D;

    Question(int type){
        questionType = type;
    }

    public void takeSingleAnswers(Student stud){ //obtain single choice per student
        
        int answer = stud.getRandomAnswerSingle();
        if(answer == 1)
            A++;
        else if(answer == 2)
            B++;
        else if(answer == 3)
            C++;
        else if(answer == 4)
            D++;
    }
    public void takeMultipleAnswers(Student stud){ //obtain multiple choices per student
        int[] multAnswers = new int[4];
        
        multAnswers = stud.getRandomAnswerMultiple();

        A += multAnswers[0];
        B += multAnswers[1];
        C += multAnswers[2];
        D += multAnswers[3];

    }
    
    public int getA(){
        return A;
    }
    public int getB(){
        return B;
    }
    public int getC(){
        return C;
    }
    public int getD(){
        return D;
    }
    public int getQuestionType(){
        return questionType;
    }
    




}