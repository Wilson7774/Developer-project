package com.example.Developer.project.Controlleres;


import com.example.Developer.project.Entities.Enterprise;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnterpriseController {

    @GetMapping ("/enterprise")
    public Enterprise empresas(){
        Enterprise miEmpresa1 = new Enterprise("Azul", "Diciembre", "333333", "1234567");
        //miEmpresa1.InformacionEmpresa();
        return miEmpresa1;
    }


}
