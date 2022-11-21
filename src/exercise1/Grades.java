package exercise1;

public class Grades {
    public static final String MATH = "math";
    public static final String IT = "it";
    public static final String PHYSICS = "physics";

    static double calculateCourseAverage(Student[] students, String name) {
        double sum = 0;
        for (Student student : students) {
            sum += getGrade(name, student);
        }
        return sum / students.length;
    }

    private static double getGrade(String name, Student student) {
        switch (name) {
            case MATH:
                return student.getMath();
            case IT:
                return student.getIt();
            case PHYSICS:
                return student.getPhysics();
//            default:
//                return 0;
        }
        return 0;
    }


}
