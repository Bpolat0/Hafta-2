public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3, int finalNote1, int finalNote2, int finalNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1 * c1.percent;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2 * c2.percent;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3 * c3.percent;
        }
        if (finalNote1 >= 0 && finalNote1 <= 100) {
            this.c1.finalnote = finalNote1 * c1.finalPercent;
        }

        if (finalNote2 >= 0 && finalNote2 <= 100) {
            this.c2.finalnote = finalNote2 * c1.finalPercent;
        }

        if (finalNote3 >= 0 && finalNote3 <= 100) {
            this.c3.finalnote = finalNote3 * c3.finalPercent;
        }
    }

    void printNote() {
        System.out.println(c1.name + " Notu : " + c1.note);
        System.out.println(c2.name + " Notu : " + c2.note);
        System.out.println(c3.name + " Notu : " + c3.note);
        System.out.println("Ortalamanız : " + this.avarage);
    }

    void calcAvarage() {
        c1.courseAvarage = this.c1.note + this.c1.finalnote;
        c2.courseAvarage = this.c2.note + this.c2.finalnote;
        c3.courseAvarage = this.c3.note + this.c3.finalnote;
        this.avarage = (c1.courseAvarage + c2.courseAvarage + c3.courseAvarage) / 3.0;
    }

    void isPass() {
        if (this.avarage > 55) {
            System.out.println("Sınıfı başarılı bir şekilde geçtiniz!");
            this.isPass = true;
        } else {
            System.out.println("Kaldınız!");
            this.isPass = false;
        }
        printNote();
        System.out.println("===================");
    }


}
