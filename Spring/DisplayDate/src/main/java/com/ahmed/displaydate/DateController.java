package com.ahmed.displaydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String day = "EEEEE";
		String dateNum = "dd";
		String monthName = "MMMMM";
		String yearInt = "YYYY";
		SimpleDateFormat date = new SimpleDateFormat(day);
		SimpleDateFormat dateNumber = new SimpleDateFormat(dateNum);
		SimpleDateFormat dateMonth = new SimpleDateFormat(monthName);
		SimpleDateFormat intYear = new SimpleDateFormat(yearInt);
//		date.applyLocalizedPattern("EEEEE");
		String dateDay = date.format(new Date());
		String numberOfDay = dateNumber.format(new Date());
		String month = dateMonth.format(new Date());
		String year = intYear.format(new Date());
		
		
		model.addAttribute("dateOfWeek", dateDay);
		model.addAttribute("numberOfDay", numberOfDay);
		model.addAttribute("month", month);
		model.addAttribute("year", year);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String timeNow = "hh:mm aa";
		SimpleDateFormat timeFormat = new SimpleDateFormat(timeNow);
		String time = timeFormat.format(new Date());
		
		model.addAttribute("time", time);
		
		
		
		return "time.jsp";
	}
}
