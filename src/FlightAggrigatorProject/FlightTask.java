package FlightAggrigatorProject;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

public class FlightTask implements Callable<List<FlightData>>
{
    private String src;
    private String dest;
    private Date jDate;
    private FlightService service;

    public FlightTask(String src, String dest, FlightService service, Date jDate) {
        this.src = src;
        this.dest = dest;
        this.service = service;
        this.jDate = jDate;
    }

    @Override
    public List<FlightData> call() throws Exception {
        return service.getFlights(src,dest,jDate);
    }
}
