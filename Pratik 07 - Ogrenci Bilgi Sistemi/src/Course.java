public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    double finalPercent;
    double percent;
    double note;
    double finalnote;
    double courseAvarage;


    Course(String name, String code, String prefix, double percent, double finalPercent) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.percent = percent;
        this.finalPercent = finalPercent;
        int note = 0;
        int finalnote = 0;
        double courseAvarage;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders isimleri uyuşmuyor!");
        }
    }

    void printTeacher() {
        this.teacher.print();
    }

}


