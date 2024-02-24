package inheritance;

public class Worker {
    public void work1(Doable job) {
        job.do1();
    }

    public void work2(Do job) {
        job.do2();
    }
}
