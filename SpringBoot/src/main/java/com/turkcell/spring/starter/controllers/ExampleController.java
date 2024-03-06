package com.turkcell.spring.starter.controllers;

import com.turkcell.spring.starter.Request;
import com.turkcell.spring.starter.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/example")
public class ExampleController
{
    // ? => Sistem gelen isteği spesifik olarak TEK BİR TANE fonksiyona yönlendirebiliyor ise sorun yok.
    @GetMapping()
    public String a(@RequestParam("abc") String name)
    {
        return "Merhaba " + name;
    }
    @PostMapping()
    public Response b(@RequestBody Request request){
        Response response = new Response();
        response.setGivenNumber(request.getNumber());
        return response;
    }
    //@PutMapping()
    //@DeleteMapping
    @GetMapping("{page}")
    public String b(@PathVariable String page) {
        return "Get Request " + page;
    }
    @GetMapping("get3")
    public String c() {
        return "Get 3";
    }
}
// Entity