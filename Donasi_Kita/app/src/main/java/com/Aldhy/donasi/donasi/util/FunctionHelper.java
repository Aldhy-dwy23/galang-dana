package com.Aldhy.donasi.donasi.util;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class FunctionHelper {

    public static String rupiahFormat(int price) {
        DecimalFormat formatter = new DecimalFormat("#,###");
        return "Rp " + formatter.format(price).replaceAll(",", ".");
    }

    public static String setDataTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM yyyy HH:mm:ss");
        String formattedDate = simpleDateFormat.format(calendar.getTime());
        return formattedDate;
    }
}