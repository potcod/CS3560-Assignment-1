public class VotingService {
    Question questionDisplay;
    
    VotingService(Question quest){
        questionDisplay = quest;
    }

    public void displayVotes(){ //get data from question 

        if(questionDisplay.getQuestionType() == 1)
            System.out.println("Single Choice Question Results");
        else 
            System.out.println("Multiple Choice Question Results");
        
        System.out.println("A: " + questionDisplay.getA());
        System.out.println("B: " + questionDisplay.getB());
        System.out.println("C: " + questionDisplay.getC());
        System.out.println("D: " + questionDisplay.getD());
    }

}
