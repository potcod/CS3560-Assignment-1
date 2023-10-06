// SimDriver will create Student object and sent to question object as many times as needed for random amount of students
// then it will get random data of ABCD answers and then send to voting service

import java.util.Random;

public class SimulationDriver {
    public static void main(String []args){
        System.out.println("Voting Program Start");
    
        //Get Random number of Students
        Random rand = new Random();
        int studentAmount = rand.nextInt(31)+10;
        System.out.println("Number of Students: " + studentAmount);

        Question singleQuestion = new Question(1); // for loop to get single answer data
        for(int i = 0 ;i<studentAmount;i++){
            Student stud = new Student();
            singleQuestion.takeSingleAnswers(stud);
        }
        VotingService voteSingle = new VotingService(singleQuestion);
        voteSingle.displayVotes();



        Question multipleQuestion = new Question(2); //for loop to get multiple answer data
        for(int j = 0;j<studentAmount;j++){
            Student student = new Student();
            multipleQuestion.takeMultipleAnswers(student);
        }
        VotingService voteMultiple = new VotingService(multipleQuestion);
        voteMultiple.displayVotes();

    }
}
