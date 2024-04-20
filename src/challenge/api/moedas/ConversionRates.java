package challenge.api.moedas;

import com.google.gson.annotations.SerializedName;

public record ConversionRates(@SerializedName("conversion_rates") Moedas conversionRates) {
}