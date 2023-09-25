public class Employee {
    String name;
    double salary;
    double workHours;
    double bonusWork = 0;
    double hireYear;
    double raiseSalary = 0;
    double tax = 0;
    double currentYear = 2021;
    double salaryWithTaxAndBonus = 0;
    double totalSalary = 0;

    Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.totalSalary = this.salary;
    }

    public void run() {
        employeeInfo();
    }

    String taxCalc() {
        if (this.salary <= 1000) {
            return Double.toString(this.tax);
        } else {
            return Double.toString(this.tax = this.salary * 0.03);
        }
    }

    String bonus() {
        if (this.workHours > 40) {
            return Double.toString(this.bonusWork = (this.workHours - 40) * 30);
        } else {
            return Double.toString(this.bonusWork);
        }
    }

    String raiseSalary() {
        this.currentYear -= this.hireYear;
        if (this.currentYear < 10) {
            return Double.toString(this.raiseSalary = this.salary * 0.05);
        }
        if (this.currentYear > 9 && this.currentYear < 20) {
            return Double.toString(this.raiseSalary = this.salary * 0.10);
        }
        if (this.currentYear > 19) {
            return Double.toString(this.raiseSalary = this.salary * 0.15);
        }
        return Double.toString(this.raiseSalary);
    }

    String taxAndBonus() {
        this.salaryWithTaxAndBonus = this.salary + (this.bonusWork - this.tax);
        return Double.toString(this.salaryWithTaxAndBonus);
    }

    String totalSalary() {
        this.totalSalary = this.salaryWithTaxAndBonus + this.raiseSalary;
        return Double.toString(this.totalSalary);
    }

    public void employeeInfo() {
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç Yılı : " + this.hireYear);
        System.out.println("Vergi : " + taxCalc());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + taxAndBonus());
        System.out.println("Toplam Maaş : " + totalSalary());
    }
}

