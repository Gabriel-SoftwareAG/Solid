package ISP;

public class OfficeWorker implements worker, Attendee{
    @Override
    public void attendMeeting() {
        System.out.println("attend meeting");
    }

    @Override
    public void work() {
        System.out.println("working");
    }
}
