package org.example.controller;


import org.example.dto.RegiDto;
import org.example.dto.RegisterDto;
import org.example.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/student-subjects")
public class RegisterController {

    private final RegisterService registerService;

    @Autowired
    public RegisterController(RegisterService registerService) {
        this.registerService = registerService;
    }

    @PostMapping
    public String register(@RequestBody RegiDto regiDto) {
        registerService.register(regiDto);
        return "Register SUCCESS!";
    }

    @RequestMapping(value = "/{student-id}", method = RequestMethod.GET)
    public RegisterDto getAllSubject(@PathVariable("student-id") Long id) {
        return registerService.findAllSubject(id);
    }

    @GetMapping
    public RegisterDto getSubjectByType(@RequestParam Long id,@RequestParam String type) {
        return registerService.findSubjectByType(id, type);
    }



}
