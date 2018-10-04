package de.Adorsys.project.overview.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody
public class adorsysController {

   public String hello(){
      return  "Hello Spring Boot";
   }
}
