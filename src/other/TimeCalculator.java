/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package other;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import view.admin.AdminMain;

/**
 *
 * @author DinukaMedis
 */
public class TimeCalculator {
    //Intakes only happen in January and June
    public static boolean canIntake(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMMM");
        String month = simpleDateFormat2.format(date);
        return month.equals("January")||month.equals("June");
    }
    
    //Check student is eligible to change subjects
    public static boolean canChangeSubjects(String strDate) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf. parse(strDate);
        Calendar regDate = Calendar. getInstance();
        regDate. setTime(date);
        Calendar now = Calendar.getInstance();
        return now.get((Calendar.WEEK_OF_YEAR)-regDate.get(Calendar.WEEK_OF_YEAR))<4;
    }
    
    public static String getToDayDate() {
        String toDayDate="";
        Date date = new Date();
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        toDayDate=simpleDateFormat.format(date);
        //dateLbl.setText(simpleDateFormat2.format(date));
        
        return toDayDate;
    }
}
