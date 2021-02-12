/* Name: Cole Ternes
 * ID: 2323955
 * Description: Creates the StudentRecord Class. Objects created from the class
 * will be able to calculate the total numeric grade and letter grade of a
 * student based on their quiz scores, midterm score, and final score.
 */

public class StudentRecord {
  //Member Variables
  private float m_quiz1_score;
  private float m_quiz2_score;
  private float m_quiz3_score;
  private float m_midterm_score;
  private float m_final_score;

  private float m_total_numeric_grade;
  private String m_total_letter_grade;

  //Default Constructor
  public StudentRecord() {
    m_quiz1_score = -1.0f;
    m_quiz2_score = -1.0f;
    m_quiz3_score = -1.0f;
    m_midterm_score = -1.0f;
    m_final_score = -1.0f;

    m_total_numeric_grade = -1.0f;
    m_total_letter_grade = "";
  }

  //Overloaded Constructor
  public StudentRecord(float quiz1Score, float quiz2Score, float quiz3Score, float midtermScore, float finalScore) {
    m_quiz1_score = quiz1Score;
    m_quiz2_score = quiz2Score;
    m_quiz3_score = quiz3Score;
    m_midterm_score = midtermScore;
    m_final_score = finalScore;

    calcNumericGrade();
    calcLetterGrade();
  }

  //Copy Constructor
  public StudentRecord(StudentRecord sr) {
    m_quiz1_score = sr.m_quiz1_score;
    m_quiz2_score = sr.m_quiz2_score;
    m_quiz3_score = sr.m_quiz3_score;
    m_midterm_score = sr.m_midterm_score;
    m_final_score = sr.m_final_score;

    m_total_numeric_grade = sr.m_total_numeric_grade;
    m_total_letter_grade = sr.m_total_letter_grade;
  }

  //Accessor & Mutator Methods
  //Quiz 1 Score
  public float getQuiz1Score() {
    return m_quiz1_score;
  }
  public void setQuiz1Score(float quiz1Score) {
    m_quiz1_score = quiz1Score;
  }
  //Quiz 2 Score
  public float getQuiz2Score() {
    return m_quiz2_score;
  }
  public void setQuiz2Score(float quiz2Score) {
    m_quiz2_score = quiz2Score;
  }
  //Quiz 3 Score
  public float getQuiz3Score() {
    return m_quiz3_score;
  }
  public void setQuiz3Score(float quiz3Score) {
    m_quiz3_score = quiz3Score;
  }
  //Midterm Score
  public float getMidtermScore() {
    return m_midterm_score;
  }
  public void setMidtermScore(float midtermScore) {
    m_midterm_score = midtermScore;
  }
  //FinalScore
  public float getFinalScore() {
    return m_final_score;
  }
  public void setFinalScore(float finalScore) {
    m_final_score = finalScore;
  }

  //Equals Method
  public boolean equals(StudentRecord sr) {
    boolean quiz1Equals = this.equals(sr.m_quiz1_score);
    boolean quiz2Equals = this.equals(sr.m_quiz2_score);
    boolean quiz3Equals = this.equals(sr.m_quiz3_score);
    boolean midtermEquals = this.equals(sr.m_midterm_score);
    boolean finalEquals = this.equals(sr.m_final_score);
    boolean totalNumericEquals = this.equals(sr.m_total_numeric_grade);
    boolean totalLetterEquals = this.equals(sr.m_total_letter_grade);

    if (quiz1Equals && quiz2Equals && quiz3Equals && midtermEquals && finalEquals && totalNumericEquals && totalLetterEquals) {
      return true;
    }
    else {
      return false;
    }

  }

  //toString Method
  public String toString() {
    String s = "";
    s += "-----------------------------";
    s += "\nQuiz 1 Score: " + m_quiz1_score;
    s += "\nQuiz 2 Score: " + m_quiz2_score;
    s += "\nQuiz 3 Score: " + m_quiz3_score;
    s += "\nMidterm Score: " + m_midterm_score;
    s += "\nFinal Score: " + m_final_score;
    s += "\n\nTotal Numeric Grade: ";
    s += String.format("%.2f", m_total_numeric_grade);
    s += "%";
    s += "\nTotal Letter Grade: " + m_total_letter_grade;
    s += "\n-----------------------------";
    return s;
  }

  //Other Methods
  public void calcNumericGrade() {
    float weightedQuizScore = (((m_quiz1_score/10.0f) + (m_quiz2_score/10.0f) + m_quiz3_score/10.0f) / 3.0f) * 25.0f;
    float weightedMidtermScore = (m_midterm_score/100.0f) * 35.0f;
    float weightedFinalScore = (m_final_score/100.0f) * 40.0f;

    m_total_numeric_grade = (weightedQuizScore + weightedMidtermScore + weightedFinalScore);
  }

  public void calcLetterGrade() {
    if (m_total_numeric_grade < 60) {
      m_total_letter_grade = "F";
    }
    else if (m_total_numeric_grade < 70) {
      m_total_letter_grade = "D";
    }
    else if (m_total_numeric_grade < 80) {
      m_total_letter_grade = "C";
    }
    else if (m_total_numeric_grade < 90) {
      m_total_letter_grade = "B";
    }
    else {
      m_total_letter_grade = "A";
    }
  }
}
