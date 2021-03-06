package student_dmitry_vasiliev.lesson_10.level_1;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
public interface JavaStarLoginService {

    boolean canLogin(String login, String password);

    boolean notNull(String text);
}
