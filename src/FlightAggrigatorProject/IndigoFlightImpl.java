package FlightAggrigatorProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndigoFlightImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
        List<FlightData> list = new ArrayList<>();
        list.add(new FlightData(src,dest,jDate,"Indigo",1,3000));
        list.add(new FlightData(src,dest,jDate,"Indigo",2,3000));
        list.add(new FlightData(src,dest,jDate,"Indigo",3,3000));
        list.add(new FlightData(src,dest,jDate,"Indigo",4,3000));
        list.add(new FlightData(src,dest,jDate,"Indigo",5,3000));

        return list;
    }
}
