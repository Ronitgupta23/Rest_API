package com.learnboot.restdemo.controller;

import com.learnboot.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
    CloudVendor cloudvendor;
    @GetMapping("{vendorid}")
    public CloudVendor getCloudVendorDetails(String vendorid){

        return cloudvendor;
//        return new CloudVendor("c1","vendor 1", "Address one", "xxxxx");
    }

    @PostMapping
    public String createCloudVEndorDetails( @RequestBody CloudVendor cloudVendor){
        this.cloudvendor= cloudVendor;
        return "Cloud vendor is created sucessfully";
    }

    @PutMapping
    public String updateCloudVEndorDetails( @RequestBody CloudVendor cloudVendor){
        this.cloudvendor= cloudVendor;
        return "Cloud vendor is Updated sucessfully";
    }

    @DeleteMapping("{vendorid}")
    public String deleteCloudVEndorDetails(String vendoid){
        this.cloudvendor= null;
        return "Cloud vendor is deleted sucessfully";
    }

}
