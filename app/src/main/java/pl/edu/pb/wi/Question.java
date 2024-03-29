package pl.edu.pb.wi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    private int questionId;
    private boolean trueAnswer;

    public Question(int questionId, boolean answer) {
        this.questionId = questionId;
        this.trueAnswer = answer;
    };
}

