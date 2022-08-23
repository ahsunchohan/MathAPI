package mathapi.ahsun.com.validations;

import mathapi.ahsun.com.models.requests.Numbers;
import mathapi.ahsun.com.models.responses.ApiError;
import mathapi.ahsun.com.models.responses.BaseResponse;

public class NumbersValidations {
    public static BaseResponse numbersEmptyOrNull(Numbers numbers, BaseResponse baseResponse)
    {
        if (numbers.numbers == null || numbers.numbers.size() < 1)
        {
            baseResponse.error = new ApiError("Numbers must have at least 1 element");
        }
        
        return baseResponse;
    }
}
