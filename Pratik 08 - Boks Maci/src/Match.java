import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Random random = new Random();
    ;


    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (isCheck()) {
            boolean first = randomBoolean();
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("=====YENİ ROUND=====");
                if (first) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }

                }

                System.out.println(this.f1.name + "Sağlık : " + this.f1.health);
                System.out.println(this.f2.name + "Sağlık : " + this.f2.health);
            }
        } else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }

    public boolean randomBoolean() {
        return this.random.nextBoolean();
    }


    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " Kazandı !");
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " Kazandı !");
            return true;
        }

        return false;
    }

}
