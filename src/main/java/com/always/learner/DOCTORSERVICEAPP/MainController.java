package com.always.learner.DOCTORSERVICEAPP;
import com.always.learner.DOCTORSERVICEAPP.api.DoctorsServiceApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private static Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    private DoctorsServiceApi doctorsServiceApi;
    @GetMapping("/allDoctors/{hospital}")
    public String doctors(@PathVariable String hospital){
        logger.info("got hit on /allDoctors/"+hospital);
        return doctorsServiceApi.getDoctors(hospital);
    }
}
