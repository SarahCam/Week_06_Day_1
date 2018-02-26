import java.util.ArrayList;
import java.util.Collections;

public class EightBall {

    private ArrayList<String> answers;

    public EightBall(ArrayList<String> answers){
        this.answers = answers;
    }

    public int getSize(){
        return this.answers.size();
    }


    public ArrayList<String> getAllAnswers(){
        return new ArrayList<>(this.answers);       // return a copy
    }

    public String getRandomAnswer(){
        Collections.shuffle(this.answers);
        return answers.get(0);
    }

    public void add(String answer){
        this.answers.add(answer);
    }

    public void remove(String text){
      this.answers.remove(text);
    }

}
