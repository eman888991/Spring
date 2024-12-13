package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.ChronoUnit;

@Controller
public class HomeController
{

    @RequestMapping("/")
    public String showHomePage()
    {
        return "formPage";
    }

    @RequestMapping("/processForm")
    public String processForm(HttpServletRequest request , Model model)
    {

        //getting parameters from request
        int year = Integer.parseInt(request.getParameter("year"));
        int month = Integer.parseInt(request.getParameter("month"));
        int day = Integer.parseInt(request.getParameter("day"));

        //processing the data that received from the request
        // calculate days

        long nowYear = LocalDate.now().getYear();
        long nowMonth = LocalDate.now().getMonthValue();
        long nowDay = LocalDate.now().getDayOfMonth();

        if(nowDay<day){
            nowMonth = nowMonth-1;
            if(month == 1 || month == 3 || month== 5 || month == 7 || month== 8|| month == 10 || month== 12){
                nowDay = nowDay + 31;
            }else {
                nowDay = nowDay + 30;
            }
        }
        if(nowMonth<month){
            nowYear = nowYear-1;
            nowMonth = nowMonth + 12;
        }
        long daysDifference = nowDay -  day;
        long monthsDifference = nowMonth-  month;
        long yearsDifference = nowYear-  year;



        //adding data to the model
        model.addAttribute("resultyear" , yearsDifference);
        model.addAttribute("resultmonth" , monthsDifference);
        model.addAttribute("resultday" , daysDifference);

        //return the view with model
        return "resultPage";
    }
}
