import java.util.UUID;
import java.util.Random;
public class Student {
    private int singleAnswer;
    private int[] multipleAnswers = new int[4];
    private String ID;

    UUID uuid = UUID.randomUUID();
    Random rand = new Random();

    Student(){
        ID = uuid.toString();
    }

    public int getRandomAnswerSingle(){
        
        singleAnswer = rand.nextInt(4)+1;
        return singleAnswer;

    }
    public int[] getRandomAnswerMultiple(){

        for(int i = 0;i<4;i++){
            multipleAnswers[i] += rand.nextInt(2);
        }
        return multipleAnswers;

    }
    
    public String getUUID(){
        return ID;
    }


}
