package FlightAggrigatorProject;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws InterruptedException {

        FlightService service = new AirIndiaFlightImpl();
        FlightService service1 = new IndigoFlightImpl();
        FlightService service2 = new VistaraFlightImpl();
        List<FlightService> serviceList = new ArrayList<>();

        serviceList.add(service);
        serviceList.add(service1);
        serviceList.add(service2);

        FlightTask task1 = new FlightTask("delhi","goa", service1, new Date());
        FlightTask task2 = new FlightTask("delhi","goa", service2, new Date());
        FlightTask task3 = new FlightTask("delhi","goa", service, new Date());

        ExecutorService executorService = Executors.newFixedThreadPool(serviceList.size());

        //1st way of doing that
//        List<Future<List<FlightData>>> result = new ArrayList<>();
//        Future<List<FlightData>> f1 =executorService.submit(task1);
//        Future<List<FlightData>> f2 = executorService.submit(task2);
//        Future<List<FlightData>> f3 = executorService.submit(task3);
//
//        result.add(f1);
//        result.add(f2);
//        result.add(f3);
//
//        result.stream().forEach(flightData-> {\
//            try {
//                System.out.println(flightData.get()+" \n");
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        });

        //2nd way of doing that  list of callables first and then calling invoke all
        List<Callable<List<FlightData>>> list = new ArrayList<>();
        list.add(task1);
        list.add(task2);
        list.add(task3);

        List<Future<List<FlightData>>> result1 = executorService.invokeAll(list);

        result1.stream().forEach(flightData-> {
            try {
                System.out.println(flightData.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        });
        executorService.shutdown();
    }
}
