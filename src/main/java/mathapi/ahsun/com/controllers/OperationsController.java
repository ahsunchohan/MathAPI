package mathapi.ahsun.com.controllers;

import mathapi.ahsun.com.handlers.OperationHandler;
import mathapi.ahsun.com.models.responses.Numbers;
import mathapi.ahsun.com.models.requests.QuantifiableNumbers;
import mathapi.ahsun.com.models.responses.Average;
import mathapi.ahsun.com.models.responses.Median;
import mathapi.ahsun.com.models.responses.Percentile;
import mathapi.ahsun.com.validations.NumbersValidations;
import mathapi.ahsun.com.validations.QuantifiableNumbersValidations;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/operation")
public class OperationsController
{   
    @PostMapping("/min")
    public ResponseEntity<Numbers> findMinNumbers(@Validated @RequestBody QuantifiableNumbers body)
    {
        var response = new Numbers();
        QuantifiableNumbersValidations.quantifierSmallerThanNumbersSize(body, response);
        if (response.error != null)
        {
            return ResponseEntity.badRequest().body(response);
        }
        
        response.numbers = OperationHandler.getMinNumbers(body);
        return ResponseEntity.ok().body(response);
    }
    
    @PostMapping("/max")
    public ResponseEntity<Numbers> findMaxNumbers(@Validated @RequestBody QuantifiableNumbers body)
    {
        var response = new Numbers();
        QuantifiableNumbersValidations.quantifierSmallerThanNumbersSize(body, response);
        if (response.error != null)
        {
            return ResponseEntity.badRequest().body(response);
        }
        
        response.numbers = OperationHandler.getMaxNumbers(body);
        return ResponseEntity.ok().body(response);
    }
    
    @PostMapping("/avg")
    public ResponseEntity<Average> findNumbersAverage(@Validated @RequestBody mathapi.ahsun.com.models.requests.Numbers body)
    {
        var response = new Average();
        NumbersValidations.numbersEmptyOrNull(body, response);
        if (response.error != null)
        {
            return ResponseEntity.badRequest().body(response);
        }
        
        response.average = OperationHandler.getNumbersAverage(body);
        return ResponseEntity.ok().body(response);
    }
    
    @PostMapping("/median")
    public ResponseEntity<Median> findNumbersMedian(@Validated @RequestBody mathapi.ahsun.com.models.requests.Numbers body)
    {
        var response = new Median();
        NumbersValidations.numbersEmptyOrNull(body, response);
        if (response.error != null)
        {
            return ResponseEntity.badRequest().body(response);
        }
        
        response.median = OperationHandler.getNumbersMedian(body);
        return ResponseEntity.ok().body(response);
    }
    
    @PostMapping("/percentile")
    public ResponseEntity<Percentile> findNumbersPercentile(@Validated @RequestBody QuantifiableNumbers body)
    {
        var response = new Percentile();
        NumbersValidations.numbersEmptyOrNull(body, response);
        if (response.error != null)
        {
            return ResponseEntity.badRequest().body(response);
        }
        
        response.percentile = OperationHandler.getNumbersPercentile(body);
        return ResponseEntity.ok().body(response);
    }
}
 