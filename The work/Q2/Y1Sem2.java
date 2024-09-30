public class Y1Sem2 extends StudentFees{

    @Override
    public int calculateFees() {
        return 500;
    }

    public void fees(StudentFees studentFees){
        System.out.println("The fees is: " + studentFees.calculateFees());
    }

    public static void main(String[] args){
        StudentFees Y1Sem1 = new Y1Sem1();
        System.out.println("The fees of year one sem1 is " + Y1Sem1.calculateFees());
        StudentFees Y1Sem2 = new Y1Sem2();
        System.out.println("The fees of year one sem2 is " + Y1Sem2.calculateFees());

        Y1Sem1.StudentFeesDetails();
        Y1Sem2.StudentFeesDetails(800);
    }
}