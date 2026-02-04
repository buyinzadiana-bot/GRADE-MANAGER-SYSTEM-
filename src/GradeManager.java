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
    public double calculateAverage() {
        if (count == 0) {
            throw new IllegalStateException("No grades available.");
        }
        int sum = 0;
        for (int i = 0; i <count; i++){
            sum += grades[i];
        }
        return (double) sum / count;
    }
    public int getHighestGrades(){
        if (count == 0){
            throw new IllegalStateException("No grades available.");
        }
        int max = grades[0];
        for (int i =1; i < count; i++){
            if (grades [i] > max){
                max = grades [i];
            }
        }
        return max;
    }

    public int getlowestGrdes(){
        if (count == 0){
            throw new IllegalStateException("No grades available.");
        }
        int min =grades[0];
        for (int i = 1; i < count; i++){

        if (grades[i] < min){
            min = grades [i];
        }

        }
        return min;
    }

    public void sortGrades(){
        for (int i = 0; i < count - 1; i++){
            for (int j = i = 1; j< count; j++){
                if (grades [i] > grades [j]){
                    int temp = grades [i];
                    grades[i] = grades [j];
                    grades [j] = temp;
                }
            }
        }

    }

}