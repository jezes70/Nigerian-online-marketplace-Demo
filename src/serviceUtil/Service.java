package serviceUtil;

import main.Cities;
import util.Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

public class Service {

    public static void menu1() throws Exception {
        String info = Util.fillUserInfo();
        System.out.println(info);
        System.out.println("Welcome...");
        String city = Util.enterString("Where do you want to go?");
        String toUpperCity = city.toUpperCase();
        System.out.println("Checking destination for "+toUpperCity);
        Thread.sleep(5000);
        Cities cities = new Cities();
        LinkedList<String> list = cities.getList();
        if (list.contains(toUpperCity)) {
            System.out.println("There are available trips for "+toUpperCity+"....");
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);


        } else {
            System.out.println("There are no available trips\nHere are the available trips");
            Cities cities2 = new Cities();
            LinkedList<String> list1 = cities2.getList();
            for (String s:list1) {
                System.out.println(s);
            }
        }
    }

    public static void menu2() {
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType = Util.enterString("Please enter your car type");
        String placeTo = Util.enterString("Where do you Ride?");
        String placeFrom = Util.enterString("Your current location?");
        int capacity = Util.enterInteger("How many passengers can you carry?");
        String requires = Util.enterString("Enter Requires: For example:(SMOKING-YES," +"PET-YES,Luggage)");
        System.out.println("Car type:"+carType+" from "+placeFrom+" to "+placeTo+" with "+capacity+" passengers and with these requires: "+requires);

    }

    public static void menu3() {
        String info = Util.fillUserInfo();
        System.out.println(info);


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm a");

        try {
            String dateString =null;
            String timeString = null;
            Date parsedDate = dateFormat.parse(dateString);
            Date parsedTime = timeFormat.parse(timeString);

            System.out.println("Trip information: on " + dateFormat.format(parsedDate) + " at " + timeFormat.format(parsedTime));

        } catch (ParseException e) {
            System.out.println("Invalid date or time format. Please enter the date in YYYY-MM-DD format and time in HH:mm AM/PM format.");
            throw new RuntimeException(e);
        }

    }


    public static void menu4() {
        System.out.println("BlaBlaCar is a Nigerian online marketplace for carpooling.\n" +
                " It's website and mobile apps connecting drivers and passengers willing to travel together "+
                " between cities and share the cost of the journey.\n" +
                " the platform had 70 million users in 2017 and is available in 24 countries." +
                " \nAlmost all of which are in Europe and latin America countries include:\n " +
                " Brazil, Croatia, Belgium,"+ " France, Czech Republic, Germany, Indian, Hungary, Italy, Mexico, Luxembourg, \nNetherlands, Poland, Romania, Portugal, Russia, Serbia, Slovakia, Turkey, Spain, Ukraine, Argentine, Chile," +
                " and the United Kingdom.");

    }
}
