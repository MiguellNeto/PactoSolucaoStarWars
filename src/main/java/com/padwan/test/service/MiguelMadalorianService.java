package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MiguelMadalorianService {

	public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("Armadura Beskar");
        skills.add("Capacete e Viseira HUD");
        skills.add("Whistling Birds");
        skills.add("Lanca-Chamas");
        skills.add("Vibroblade");
        skills.add("Jetpack");
        skills.add("Razor Crest");
        return skills;
    }
}
