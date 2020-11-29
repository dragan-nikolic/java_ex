package com.dragan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dragan.model.Event;

@RestController
public class EventsReportController {
	
	@RequestMapping("/events")
	public List<Event> getEvents() {
		List<Event> events = new ArrayList<>();
		
		Event e1 = new Event();
		e1.setName("Java User Group");
		events.add(e1);
		
		Event e2 = new Event();
		e2.setName("Angular User Group");
		events.add(e2);
		
		return events;
	}
}
