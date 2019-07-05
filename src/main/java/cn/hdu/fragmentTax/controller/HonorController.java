package cn.hdu.fragmentTax.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller("honor")
@RequestMapping("/honor")
@CrossOrigin(allowCredentials="true",allowedHeaders="*")
public class HonorController {

    @RequestMapping(value = "/get", method = {RequestMethod.GET})
    @ResponseBody
    public String test(@RequestParam(name = "id")Integer id){
        return "helloworld"+id;
    }
}
