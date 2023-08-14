package com.linx.wiki.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WikiView {

    @GetMapping("arquitectura")
    public String paginaArquitectura() {
        return "arquitectura";
    }
    @GetMapping("contactenos")
    public String paginaContactenos() {
        return "contactenos";
    }
    @GetMapping("descripcion")
    public String paginaDescripcion() {
        return "descripcion";
    }
    @GetMapping("pruebas")
    public String paginaPruebas()  {
        return "Pruebas";
    }
}
