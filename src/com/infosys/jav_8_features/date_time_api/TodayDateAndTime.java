package com.infosys.jav_8_features.date_time_api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TodayDateAndTime {

	public static void main(String[] args) {

		// to display today date

		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate);

		DayOfWeek day = todayDate.getDayOfWeek();

		System.out.println(day);

		LocalTime currentTime = LocalTime.now();

		System.out.println(currentTime);

		LocalDateTime dateTime = LocalDateTime.now();

		System.out.println(dateTime);

	}

}
