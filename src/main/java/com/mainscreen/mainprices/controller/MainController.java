package com.mainscreen.mainprices.controller;

import com.mainscreen.mainprices.dto.Asset;
import com.mainscreen.mainprices.dto.PricesDTO;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;
import java.util.ArrayList;

@RestController
public class MainController {

    @GetMapping(path = "/" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArrayList<Asset>> getMainPage() {

        Asset x = new Asset(1, "name", 1);
        HttpHeaders headers = new HttpHeaders();

        ArrayList<Asset> xxx = new ArrayList<>();
        xxx.add(x);

        PricesDTO pricesDTO = new PricesDTO();
        pricesDTO.setName("name");
        pricesDTO.setPrice("price");


        return  new ResponseEntity<ArrayList<Asset>>(xxx, headers, HttpStatus.OK );
    }


//    @GetMapping("/prices")
//    public PricesDTO getCurrentPricesPage() {
//        return new PricesDTO();
//    }

}
