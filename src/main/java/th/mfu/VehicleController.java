package th.mfu;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import th.mfu.Vehicle;

@Controller
public class VehicleController{
    @Autowired
    private VehicleController repository;

    @GetMapping("/vehicles")
    public String listVehicles(Model model) {
        model.addAttribute("vehicles", repository.findAll());
        return "list-vehicle";
    }

    @GetMapping("/add-vehicle")
    public String showAddVehicleForm(Model model) {
        model.addAttribute("veh", new Vehicle());
        return "add-vehicle-form";
    }

    @GetMapping("/vehicles/{id}")
    public String getEmployee(Model model, @PathVariable int id) {
        Vehicle veh = repository.findById(id).get();
        model.addAttribute("veh", veh);
        return "add-vehicle-form";
    }

    @PostMapping("/vehicles")
    public String saveVehicle(@ModelAttribute vehicle newemployee) {
        repository.save(newvehicle);
        return "redirect:/vehicles";
    }
}

