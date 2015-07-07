/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dextraining;

import static br.com.dextraining.util.JsonTransformer.fromJson;
import static spark.Spark.get;
import static spark.Spark.post;
import static spark.SparkBase.staticFileLocation;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;
import br.com.dextraining.dto.LoginDto;
import br.com.dextraining.services.PessoaService;
import freemarker.template.Configuration;

/**
 *
 * @author dherik
 */
public class IniciarSistema {

    private static Configuration config;
    private static PessoaService pessoaService;
    
    private static Thread sistema = new Thread(new Runnable() {
		
		@Override
		public void run() {
			staticFileLocation("/public");
	         staticFreeMarkerFileLocation("src/main/resources/public/");

	         //apenas para iniciar o spark server
	         get("/hello", (request, response) -> "Selenium WebDriver exemplo");
	         get("/inicio", (request, response) -> {
	             return new ModelAndView(null, "paginaInicial.ftl");
	         }, new FreeMarkerEngine(config));
	         get("/sobre", (request, response) -> {
	             return new ModelAndView(null, "sobre.ftl");
	         }, new FreeMarkerEngine(config));
	         post("/login", (request, response) -> {
	             //return toJson(new ResultDto("example", "value example"));
	             String body = request.body();

	             LoginDto loginDto = fromJson(body, LoginDto.class);

	             Map<String, Object> attributes = new HashMap<>();
	             return new ModelAndView(attributes, "paginaInicial.ftl");
	         }, new FreeMarkerEngine(config));
	         get("/contato", (request, response) -> {
	             Map<String, Object> attributes = new HashMap<>();
	             attributes.put("message", "Hello World!");

	             return new ModelAndView(attributes, "contato.ftl");
	         }, new FreeMarkerEngine(config));
	         
	         pessoaService = new PessoaService(config);				
		}
	});
    public static void start() {
    	sistema.run();
    }

    public static void stop() {
    	sistema.stop();
    	System.out.println("stoped");
    }
    
    public static void main(String[] args) {
       start();
    }

    private static void staticFreeMarkerFileLocation(String location) {
        try {
            config = new Configuration();
            config.setDirectoryForTemplateLoading(new File(location));
            config.setDefaultEncoding("UTF-8");
        } catch (IOException ex) {
            Logger.getLogger(IniciarSistema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
