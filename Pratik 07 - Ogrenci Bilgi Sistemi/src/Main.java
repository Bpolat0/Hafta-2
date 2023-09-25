public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ali Hoca", "TRH", "1111");
        Teacher t2 = new Teacher("Mahmut Hoca", "FZK", "0000");
        Teacher t3 = new Teacher("İbrahim Hoca", "BIO", "2222");

        Course tarih = new Course("Tarih", "101", "TRH", 0.80,0.20);
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK", 0.60, 0.40);
        fizik.addTeacher(t2);

        Course biyoloji = new Course("Biyoloji", "101", "BIO",0.70,0.30);
        biyoloji.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyoloji);
        s1.addBulkExamNote(100, 78, 50,60,95,13);
        s1.calcAvarage();
        s1.isPass();

        Student s2 = new Student("Yusuf Kılıç", "444", "4", tarih, fizik, biyoloji);
        s2.addBulkExamNote(51,65,35,96,12,85);
        s2.calcAvarage();
        s2.isPass();
    }
}