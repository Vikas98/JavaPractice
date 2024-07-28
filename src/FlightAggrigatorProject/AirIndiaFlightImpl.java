package FlightAggrigatorProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirIndiaFlightImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
        List<FlightData> list = new ArrayList<>();
        list.add(new FlightData(src,dest,jDate,"Air-India",11,3000));
        list.add(new FlightData(src,dest,jDate,"Air-India",12,3000));
        list.add(new FlightData(src,dest,jDate,"Air-India",13,3000));
        list.add(new FlightData(src,dest,jDate,"Air-India",14,3000));
        list.add(new FlightData(src,dest,jDate,"Air-India",15,3000));

        return list;
    }
}
