package Tasks;

public abstract class Marks {

/*    We have to calculate the average of marks
    obtained in three subjects by student A and by
    student B. Create class 'Marks' with an abstract
    method 'getPercentage' that will be returning
    the average percentage of marks. Provide
    implementation of abstract method in classes
'A' and 'B'. The constructor of student A takes the
    marks in three subjects as its parameters and
    the marks in four subjects as its parameters for
    student B. Test your code*/

    abstract int getPercentage();

}

class A extends Marks {
    @Override
    int getPercentage () {
        return (subj1 + subj2 + subj3) / 3;
    }

    int subj1;
    int subj2;
    int subj3;

    A(int subj1, int subj2, int subj3) {

        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;

    }
}

class B extends Marks{

    int subj1;
    int subj2;
    int subj3;
    int subj4;

    @Override
    int getPercentage() {
        return (subj1+subj2+subj3+ subj4)/4;
    }

    B(int subj1, int subj2, int subj3, int subj4) {


        this.subj1 = subj1;
        this.subj2 = subj2;
        this.subj3 = subj3;
        this.subj4 = subj4;

    }

}

class Test {

    public static void main(String[] args) {

        A studentA = new A(80,70,50);

        B studentB = new B(40,100,90,60);

        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());
    }


}


