public class Calculator {

    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int cem() {

        return a + b;
    }

    int cixma() {
        return a - b;
    }

    int vurma() {
        return a * b;
    }

    double bolme() {
        if (b == 0) {
            System.out.println(" 0-a Bolmek Olmaz ");
            return 0;


        }
        return (double) a / b;
    }
}

// Calculator class yarat. 2 ədəd və onların cəmini, fərqini, hasilini və bölməsini hesablamaq üçün metodlar yaz.