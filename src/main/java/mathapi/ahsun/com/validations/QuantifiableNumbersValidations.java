package mathapi.ahsun.com.validations;

import mathapi.ahsun.com.models.requests.QuantifiableNumbers;
import mathapi.ahsun.com.models.responses.ApiError;
import mathapi.ahsun.com.models.responses.BaseResponse;

public class QuantifiableNumbersValidations
{
    public static BaseResponse quantifierSmallerThanNumbersSize(QuantifiableNumbers quantifiableNumbers, BaseResponse baseResponse)
    {
        if (quantifiableNumbers.quantifier > quantifiableNumbers.numbers.size())
        {
            baseResponse.error = new ApiError("Quantifier cannot be greater than numbers length");
        }
        
        return baseResponse;
    }
}
