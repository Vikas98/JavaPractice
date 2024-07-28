package FlightAggrigatorProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VistaraFlightImpl implements FlightService{
    @Override
    public List<FlightData> getFlights(String src, String dest, Date jDate) {
            List<FlightData> list = new ArrayList<>();
            list.add(new FlightData(src,dest,jDate,"Vistara",6,3000));
            list.add(new FlightData(src,dest,jDate,"Vistara",7,3000));
            list.add(new FlightData(src,dest,jDate,"Vistara",8,3000));
            list.add(new FlightData(src,dest,jDate,"Vistara",9,3000));
            list.add(new FlightData(src,dest,jDate,"Vistara",10,3000));

            return list;
    }
}
