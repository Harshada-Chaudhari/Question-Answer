package application;

import java.sql.SQLException;
import java.util.List;

public interface QuestionService {

    int addQuestions(Question newQuestion);
    int removeQuestions( int questionId ) ;


    int modifyQuestion(Question newQuestion) throws SQLException;

    int modifyOption(Question newQuestion);

    List<Question> getAllQuestions();
}