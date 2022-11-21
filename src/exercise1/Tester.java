package exercise1;

public class Tester {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Jan", "Kowalski", 'M', 5,5,5);
        students[1] = new Student("Karol", "Nowak", 'M', 4.5, 5, 3.5);
        students[2] = new Student("Magdalena", "Kamińska", 'K', 3.5, 4.5, 4.5);

        for (Student student : students){
            student.printInfo();
            System.out.printf("Srednia ocen studenta: %.2f\n", student.calculateAverage());
        }

        System.out.printf("Srednia ocen z matematyki: %.2f\n", Grades.calculateCourseAverage(students, Grades.MATH));
        System.out.printf("Srednia ocen z informatyki: %.2f\n",Grades.calculateCourseAverage(students, Grades.IT));
        System.out.printf("Srednia ocen z fizyki: %.2f\n", Grades.calculateCourseAverage(students, Grades.PHYSICS));

    }
}
