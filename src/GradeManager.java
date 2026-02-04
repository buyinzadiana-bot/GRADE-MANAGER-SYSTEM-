public class GradeManager {
    private int[] grades;
    private int count;

    public GradeManager(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size must be greater than zero");
        }
        grades = new int[size];
        count = 0;

    }
    public void addGrade(int grade){
        if (grade < 0 || grade > 100){
            throw new IllegalArgumentException("Grade must be between 0 and 100.");
        }
        if (count >= grades.length){
            throw new ArrayIndexOutOfBoundsException("Grade list is full.");
        }
        grades [count]=grade;
        count++;
    }

}