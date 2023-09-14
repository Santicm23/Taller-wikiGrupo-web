package com.linx.wiki.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class WikiView {

    @GetMapping("arquitectura")
    public String paginaArquitectura(Model model) {
        setBreadcrumbs(model, "Arquitectura");
        return "arquitectura";
    }

    @GetMapping("contactenos")
    public String paginaContactenos(Model model) {
        setBreadcrumbs(model, "Contáctenos");
        return "contactenos";
    }

    @GetMapping("descripcion")
    public String paginaDescripcion(Model model) {
        setBreadcrumbs(model, "Descripción");
        return "descripcion";
    }

    @GetMapping("pruebas")
    public String paginaPruebas(Model model) {
        setBreadcrumbs(model, "Pruebas");
        return "pruebas";
    }

    @GetMapping("desarrollo")
    public String paginaDesarrollo(Model model) {
        setBreadcrumbs(model, "Desarrollo");
        return "desarrollo";
    }

    @GetMapping("despliegue")
    public String paginaDespliegue(Model model) {
        setBreadcrumbs(model, "Despliegue");
        return "despliegue";
    }

    private void setBreadcrumbs(Model model, String currentPage) {
        List<BreadcrumbItem> breadcrumbs = new ArrayList<>();
        breadcrumbs.add(new BreadcrumbItem("Inicio", "/"));
        breadcrumbs.add(new BreadcrumbItem(currentPage, null)); // La página actual no tiene enlace

        model.addAttribute("breadcrumbs", breadcrumbs);
    }
}
