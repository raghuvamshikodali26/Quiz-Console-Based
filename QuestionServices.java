
import java.util.Scanner;

public class QuestionServices {
    Questions[] questions = new Questions[5]; //array of class and also reference
    String answers[] = new String[5];

    public QuestionServices() {
        questions[0] = new Questions(1, "A", "B", "C", "D", "E", "A");
        questions[1] = new Questions(2, "A", "B", "C", "D", "E", "B");
        questions[2] = new Questions(3, "A", "B", "C", "D", "E", "C");
        questions[3] = new Questions(4, "A", "B", "C", "D", "E", "D");
        questions[4] = new Questions(5, "A", "B", "C", "D", "E", "E");
    }

    public void playQuiz(){
        int i=0;
        int score = 0;
        for(Questions q : questions){
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("A. " +q.getOpt1() + "   B. " + q.getOpt2());
            System.out.println("C. " +q.getOpt3() + "   D. " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            answers[i] = sc.nextLine();
            int val = realTimeScore(answers[i], i);
            if(val == 1){
                score++;
                System.out.println("Your Answer is Correct and Your Score is : " + score);
            }
            else{
                System.out.println("Your Answer is Wrong and Your Score is : " + score); 
            }
            i++;
        }

        System.out.println("Answers Entered");
        for(String s : answers){
            System.out.println(s);
        }
    }

    public int realTimeScore(String str, int i){
        if(str.equals(questions[i].getAnswer())){
            return 1;
        }
        return 0;
    }






    public void printScore(){
        int score = 0;

        for(int i=0;i<questions.length;i++){
            if(answers[i].equals(questions[i].getAnswer())){
                score++;
            }
        }
        System.out.println("Scores after calculations : " + score);
    }
}
