//package com.qa.QACinema.Controllers;
//
//import org.bson.types.ObjectId;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.web.bind.annotation.*;
//
//import com.qa.QACinema.Entities.Screen;
//import com.qa.QACinema.Repositories.ScreenRepository;
//
//import javax.validation.Valid;
//import java.util.List;
//
//@RestController
//@RequestMapping("/screen")
//public class ScreenController {
//
//    @Autowired
//    private ScreenRepository repository;
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public List<Screen> getAllScreens() {
//
//        return repository.findAll();
//    }
//
//
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public Screen createScreen(@Valid @RequestBody Screen screens) {
//        screens.set_id(ObjectId.get());
//        repository.save(screens);
//        return screens;
//    }
//
//    @RequestMapping(value = "/seats/", method = RequestMethod.POST)
//    public Screen createScreenSeats(@Valid @RequestBody Screen screens) {
//        screens.set_id(ObjectId.get());
//        repository.save(screens);
//        return screens;
//    }
//
//
//}
